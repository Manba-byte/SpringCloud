package com.example.clientcluster.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wh
 * @description
 * @date 2019/4/10
 */
@RestController
@RefreshScope //refresh实现配置中心自动刷新（实际还是手动的,需要先去访问问 .../refresh再访问该路径的requestmapping）
public class HelloConfigController {
    @Value("${neo.hello}") //远程配置中心的属性名
    private String hello;
    @RequestMapping(value = "/hello")
    public String hello(){
        return this.hello+" this is config value";
    }
}
