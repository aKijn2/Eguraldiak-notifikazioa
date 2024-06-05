/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.app.notifikazioak;

import com.app.notifikazioak.interfazea.logeatuJFrame;

/**
 *
 * @author 1ag3.achralla
 */

public class main {

    public static void main(String[] args) {
        WeatherNotifier weatherNotifier = new WeatherNotifier();
        weatherNotifier.start();

        logeatuJFrame logeatu = new logeatuJFrame();
        logeatu.setVisible(true);
    }
}
