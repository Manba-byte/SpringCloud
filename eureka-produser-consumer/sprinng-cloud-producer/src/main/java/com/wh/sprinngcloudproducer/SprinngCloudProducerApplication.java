package com.wh.sprinngcloudproducer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SprinngCloudProducerApplication {
    public static void main(String[] args) {
        SpringApplication.run(SprinngCloudProducerApplication.class, args);
    }

}
