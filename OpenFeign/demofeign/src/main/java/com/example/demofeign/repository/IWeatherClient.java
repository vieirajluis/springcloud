package com.example.demofeign.repository;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Map;

@FeignClient(name = "data", url = "${feign.client.url}")
public interface IWeatherClient {
    @RequestMapping(method = RequestMethod.GET)
    ResponseEntity<Map> getWeather();
}
