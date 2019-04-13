package com.example.consulconsumer.configruation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author wh
 * @description
 * @date 2019/4/13
 */
@Configuration
public class BuilderBean {

    @Bean
    public RestTemplate restTemplate(){
        System.out.println("执行");
        return new RestTemplate();
    }
}
