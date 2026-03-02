package section22.b_connectivity;

import com.mysql.cj.jdbc.MysqlDataSource;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

//Run this file using Configuration option at Top-right, as password is stored in Environment Variables.
public class C_DataSourceWithSystemEnvPass {

    public static void main(String[] args) {
        Properties props = new Properties();
        try {
            props.load(Files.newInputStream(Path.of("src/section22/b_connectivity/music.properties"), StandardOpenOption.READ));
            System.out.println("Props successfully loaded!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        // Password has been stored in Environment Variables under this file Run Configurations.
        String db_password = System.getenv("MYSQL_PASS");

        var dataSource = new MysqlDataSource();
        dataSource.setServerName(props.getProperty("serverName"));
        dataSource.setPort(Integer.parseInt(props.getProperty("port")));
        dataSource.setDatabaseName(props.getProperty("databaseName"));

        try (Connection connection = dataSource.getConnection(props.getProperty("user"), db_password)) {
            //play with connections
            System.out.println("Success!");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
