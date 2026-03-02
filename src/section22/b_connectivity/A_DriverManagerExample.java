package section22.b_connectivity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class A_DriverManagerExample {
    private static final String CONN_STRING = "jdbc:mysql://localhost:3306/music";
    public static void main(String[] args) {
        String db_user = "dev_user";
        String db_pass = "Dev@12345"; // Instead hardcoding password here, JOptionPane can be used.
        try(Connection connection = DriverManager.getConnection(CONN_STRING, db_user, db_pass)) {
            //play with connections
            System.out.println("Success! Connection made to the music database.");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
