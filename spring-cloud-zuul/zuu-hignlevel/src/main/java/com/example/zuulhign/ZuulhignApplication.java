package com.example.zuulhign;

import com.example.zuulhign.filter.TokenFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableDiscoveryClient
@EnableZuulProxy

public class ZuulhignApplication {
    public static void main(String[] args) {
        SpringApplication.run(ZuulhignApplication.class, args);
    }

    @Bean
    public TokenFilter getTokenFilter() {
        return new TokenFilter();
    }
}
