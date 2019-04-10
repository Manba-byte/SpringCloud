package com.example.demo.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "spring-cloud-producer") //name与被调用的配置文件中的spring.application.name保持一致
public interface HelloRemote {
    @RequestMapping("/hello")
    String hello(@RequestParam(value = "name") String name);
}
