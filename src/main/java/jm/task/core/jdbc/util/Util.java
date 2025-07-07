package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

// реализуйте настройку соеденения с БД
public class Util {
   private static final String URL = "jdbc:mysql://localhost:3306/testKata";
   private static final String USERNAME = "root";
   private static final String PASSWORD = "root";

    public static Connection getConnection() throws SQLException,ClassNotFoundException {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            if (!connection.isClosed()) {
                System.out.println("We are connected!");
            }
        } catch (SQLException e) {
            System.out.println("there is no connection... Exception!");
        }
        return connection;
    }

    }

