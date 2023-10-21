package UTN.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MysqlConnection {

    public static Connection getConnection() {
        Connection connection = null;
        // data
        var db = "students";
        var url = "jdbc:mysql://localhost:3306/"+ db;
        var user = "root";
        var password = "password";

        // Load Class in memory
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("An error has occurred with the connection: " + e.getMessage());
        }
        return connection;
    }
}
