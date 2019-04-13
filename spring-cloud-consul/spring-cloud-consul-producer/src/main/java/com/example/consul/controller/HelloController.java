package com.example.consul.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wh
 * @description
 * @date 2019/4/13
 */
@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String hello(){
        return "hello consul one";
    }
}
