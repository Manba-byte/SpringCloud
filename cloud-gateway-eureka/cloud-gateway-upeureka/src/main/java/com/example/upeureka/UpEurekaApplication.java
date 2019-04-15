package com.example.upeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class UpEurekaApplication {
    public static void main(String[] args) {
        SpringApplication.run(UpEurekaApplication.class, args);
    }
}
