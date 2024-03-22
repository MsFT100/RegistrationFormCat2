package RegistrationFormAssignment;

import java.sql.*;

public class DataBaseConn {
    
    static String URL = "jdbc:mysql://localhost:3306/javaprograms?zeroDateTimeBehavior=convertToNull";
    static String USER = "root";
    static String PASSWORD = "Xonnel@6245";

    // JDBC variables for opening, closing, and managing connection
    private static Connection connection;
    
    public static Connection getConnection() {
        try {
            // Load and register the MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");
             // Establish the connection
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Connection succeded");
            return connection;
            
        } catch (SQLException | ClassNotFoundException e) {
            System.out.println(e);
            return null;
        }
    }
    
    public static void closeConnection() {
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                System.out.println(e);
            }
        }
    }
}
