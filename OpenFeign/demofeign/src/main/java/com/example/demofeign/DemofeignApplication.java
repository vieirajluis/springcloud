package com.example.demofeign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients(basePackages = {"com.example.demofeign.repository",
        "com.example.demofeign.controller"})
public class DemofeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemofeignApplication.class, args);
    }

}
