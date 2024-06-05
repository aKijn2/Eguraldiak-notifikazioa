package com.app.notifikazioak;

import org.apache.hc.client5.http.classic.methods.HttpGet;
import org.apache.hc.client5.http.impl.classic.CloseableHttpClient;
import org.apache.hc.client5.http.impl.classic.CloseableHttpResponse;
import org.apache.hc.client5.http.impl.classic.HttpClients;
import org.apache.hc.core5.http.ParseException;
import org.apache.hc.core5.http.io.entity.EntityUtils;
import org.json.JSONObject;

import java.io.IOException;

public class WeatherApiClient {
    private static final String API_KEY = "2cb5716d3ce8b739733816df18432566"; // Reemplazar con tu API Key
    private static final String API_URL = "http://api.openweathermap.org/data/2.5/weather?q=%s&appid=%s";

    public String getWeather(String location) {
        String url = String.format(API_URL, location, API_KEY);
        try (CloseableHttpClient client = HttpClients.createDefault()) {
            HttpGet request = new HttpGet(url);
            try (CloseableHttpResponse response = client.execute(request)) {
                String jsonResponse = EntityUtils.toString(response.getEntity());
                JSONObject jsonObject = new JSONObject(jsonResponse);
                return jsonObject.getJSONArray("weather").getJSONObject(0).getString("main");
            }
        } catch (IOException | ParseException e) {
            e.printStackTrace();
            return null;
        }
    }
}
