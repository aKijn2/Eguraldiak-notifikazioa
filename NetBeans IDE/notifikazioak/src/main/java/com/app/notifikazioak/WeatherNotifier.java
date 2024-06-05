package com.app.notifikazioak;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class WeatherNotifier {
    private WeatherApiClient weatherApiClient = new WeatherApiClient();
    private Konexioa konexioa = new Konexioa();

    public void start() {
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
        scheduler.scheduleAtFixedRate(this::checkWeatherAndSendEmails, 0, 1, TimeUnit.DAYS);
    }

    private void checkWeatherAndSendEmails() {
        try (Connection connection = konexioa.getKonekzioa()) {
            String sql = "SELECT * FROM alerta";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                String izena = resultSet.getString("izena");
                String kokapena = resultSet.getString("kokapena");
                String mota = resultSet.getString("mota");

                String weather = weatherApiClient.getWeather(kokapena);
                if (weather != null && weather.equalsIgnoreCase(mota)) {
                    sendWeatherAlertEmails(izena, kokapena, mota);
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void sendWeatherAlertEmails(String izena, String kokapena, String mota) {
        try (Connection connection = konexioa.getKonekzioa()) {
            String sql = "SELECT emaila FROM erabiltzaileak INNER JOIN erabiltzaileak_has_alerta " +
                    "ON erabiltzaileak.id_erabiltzailea = erabiltzaileak_has_alerta.erabiltzaileak_id_erabiltzailea " +
                    "WHERE erabiltzaileak_has_alerta.alerta_id_alerta = (SELECT id_alerta FROM alerta WHERE izena = ? AND kokapena = ? AND mota = ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, izena);
            preparedStatement.setString(2, kokapena);
            preparedStatement.setString(3, mota);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                String email = resultSet.getString("emaila");
                String subject = "Weather Alert: " + izena;
                String content = "There is a weather alert for " + mota + " in " + kokapena + ".";
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
