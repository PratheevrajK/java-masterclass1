package section22.c_data_source;

import com.mysql.cj.jdbc.MysqlDataSource;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class A_SelectOperations {

    private static final String CONN_STRING = "jdbc:mysql://localhost:3306/music";
    private static String db_user = "dev_user";
    private static String db_pass = "Dev@12345"; // Instead hardcoding password here, JOptionPane can be used.

    public static void main(String[] args) {

        var dataSource = new MysqlDataSource();
        dataSource.setUrl(CONN_STRING);

        String artistsFetchQuery = "SELECT * FROM artists limit 10;";
        try (Connection connection = dataSource.getConnection(db_user, db_pass);
            Statement statement = connection.createStatement()) {
            ResultSet resultSet = statement.executeQuery(artistsFetchQuery);
            while (resultSet.next()) {
                System.out.printf("%d %s %n", resultSet.getInt(1), resultSet.getString("artist_name"));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        System.out.println("-".repeat(50));

        String albumName = "Tapestry"; // This data can be fetched from user input.
        String albumViewQuery = "SELECT * FROM music.albumview where album_name = '%s'".formatted(albumName);
        try (Connection connection = dataSource.getConnection(db_user, db_pass);
             Statement statement = connection.createStatement()) {

            ResultSet resultSet = statement.executeQuery(albumViewQuery);
            var meta = resultSet.getMetaData(); // Metadata gives details on columnName, columnType,..
            for (int i=1; i<= meta.getColumnCount(); i++) {
                System.out.printf("%d %s %s %n", i, meta.getColumnName(i), meta.getColumnTypeName(i));
            }
            System.out.println("-".repeat(50));

            for (int i=1; i<= meta.getColumnCount(); i++) {
                System.out.printf("%-15s", meta.getColumnName(i).toUpperCase());
            }
            System.out.println();
            while (resultSet.next()) {
                for (int i=1; i<= meta.getColumnCount(); i++) {
                    System.out.printf("%-15s", resultSet.getString(i));
                }
                System.out.println();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
