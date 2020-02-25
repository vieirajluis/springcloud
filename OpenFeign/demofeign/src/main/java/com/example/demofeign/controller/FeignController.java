package com.example.demofeign.controller;

import com.example.demofeign.repository.IWeatherClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class FeignController {

    private final IWeatherClient weatherClient;

    @Autowired
    public FeignController(IWeatherClient weatherClient) {
        this.weatherClient = weatherClient;
    }



    @GetMapping(path = "/weather")
    ResponseEntity<Map> getWeather() {
        return ResponseEntity.ok(weatherClient.getWeather().getBody());
    }

}
