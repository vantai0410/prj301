/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author OS
 */
public class BaseRepository {
    private static final String URL = "jdbc:sqlserver://DESKTOP-B7VR0RK\\SQLEXPRESS:1433;databaseName=demoLogin";
//    private static final String USERNAME = "root";
//    private static final String PASSWORD = "000000";

    public static Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager.getConnection(URL);
            System.out.println("Connected Successfully");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
    
}
