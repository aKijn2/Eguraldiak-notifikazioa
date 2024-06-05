package com.app.notifikazioak;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Logeatu {

    public boolean authenticate(String erabiltzailea, String pasahitza, String emaila) {
        boolean isAuthenticated = false;
        Konexioa konexioa = new Konexioa();

        try (Connection connection = konexioa.getKonekzioa()) {
            String query = "SELECT * FROM erabiltzaileak WHERE izena = ? AND pasahitza = ? AND emaila = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, erabiltzailea);
            preparedStatement.setString(2, pasahitza);
            preparedStatement.setString(3, emaila);

            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                isAuthenticated = true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return isAuthenticated;
    }
}
