package com.example.demofeign.repository;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class WeatherClientImpl implements IWeatherClient {
    @Override
    public ResponseEntity<Map> getWeather() {
        return null;
    }
}
