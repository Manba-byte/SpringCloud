package com.example.cluster;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableDiscoveryClient //开启注册中心支持
@EnableConfigServer
public class ClusterApplication {
    public static void main(String[] args) {
        SpringApplication.run(ClusterApplication.class, args);
    }
}
