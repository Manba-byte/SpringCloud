package com.example.gatewayproducer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class GatewayProducer1Application {

    public static void main(String[] args) {
        SpringApplication.run(GatewayProducer1Application.class, args);
    }
}
