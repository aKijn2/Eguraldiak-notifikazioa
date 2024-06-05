package com.app.notifikazioak.kontrolatzaileak;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.app.notifikazioak.Konexioa;

public class alertakSortu {

    public void sortuAlertak(String izena, String kokapena, String mota) {
        Konexioa konexioa = new Konexioa();
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            connection = konexioa.getKonekzioa();
            String sql = "INSERT INTO alerta (izena, kokapena, mota) VALUES (?, ?, ?)";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, izena);
            preparedStatement.setString(2, kokapena);
            preparedStatement.setString(3, mota);

            int rowsInserted = preparedStatement.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("A new alert was inserted successfully!");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (preparedStatement != null) preparedStatement.close();
                if (connection != null) connection.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }
}
