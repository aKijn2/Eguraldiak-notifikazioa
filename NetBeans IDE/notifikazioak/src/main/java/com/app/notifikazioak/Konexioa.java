package com.app.notifikazioak;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Konexioa {

    public Connection getKonekzioa() throws SQLException {
        String DB_URL = "jdbc:mysql://localhost:3306/notifikazioak";
        String USER = "root";
        String PASS = "root";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        Connection connection = DriverManager.getConnection(DB_URL, USER, PASS);
        return connection;
    }
}
