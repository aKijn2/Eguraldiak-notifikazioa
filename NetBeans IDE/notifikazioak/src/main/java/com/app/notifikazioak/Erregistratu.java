package com.app.notifikazioak;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Erregistratu {

    public void gordeErabiltzailea(String erabiltzailea, String pasahitza, String emaila) throws SQLException {
        Konexioa konexioa = new Konexioa();
        try (Connection conn = konexioa.getKonekzioa()) {
            String sql = "INSERT INTO erabiltzaileak (izena, pasahitza, emaila) VALUES (?, ?, ?)";
            try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
                pstmt.setString(1, erabiltzailea);
                pstmt.setString(2, pasahitza);
                pstmt.setString(3, emaila);
                pstmt.executeUpdate();
            }
        }
    }
}
