package com.example.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wh
 * @description
 * @date 2019/4/10
 */
@RestController
public class HelloConfigController {
    @Value("${neo.hello}") //远程配置中心的属性名
    private String hello;
    @RequestMapping("/hello")
    public String hello(){
        return this.hello+" this is config value";
    }
}
