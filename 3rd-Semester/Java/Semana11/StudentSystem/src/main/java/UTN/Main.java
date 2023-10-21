package UTN;

import UTN.connection.MysqlConnection;

public class Main {
    public static void main(String[] args) {
        var connection = MysqlConnection.getConnection();

        if(connection != null) {
            System.out.println("Successful connection!");
        } else {
            System.out.println("Connection error!");
        }
    } // End of main
} // End of class
