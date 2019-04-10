package com.wh.sprinngcloudproducer.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wh
 * @description
 * @date 2019/4/10
 */
@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String index(@RequestParam String name){
        System.out.println("我在跑");
        System.out.println("aa");
        return "hello"+name+"this is first message";
    }
}
