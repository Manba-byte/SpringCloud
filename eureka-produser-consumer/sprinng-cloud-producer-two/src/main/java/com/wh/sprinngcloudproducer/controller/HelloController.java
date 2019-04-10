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
        System.out.println("two 在 跑");
        System.out.println("bb");
        return "hello"+name+"this is second message";
    }
}
