package com.example.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    private static final String URL = "jdbc:mysql://localhost:3306/testdb";
    private static final String USER = "root";
    private static final String PASSWORD = "Kuldeep@7249";

    // Method to get database connection
    public static Connection getConnection() {
        Connection connection = null;

        try {

            connection = DriverManager.getConnection(URL, USER, PASSWORD);

        }catch (SQLException e) {
            System.out.println("Connection failed.");
            e.printStackTrace();
        }

        return connection;
    }
}
