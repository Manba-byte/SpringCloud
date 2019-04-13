package com.example.consulconsumer.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.net.URI;

/**
 * @author wh
 * @description 示例如何调用consul服务
 * @date 2019/4/13
 */
@RestController
public class CallHelloController {
    private Logger logger = LoggerFactory.getLogger(CallHelloController.class);
    @Autowired
    private LoadBalancerClient loadBalancerClient;
    @Autowired
    private RestTemplate restTemplate;
    @RequestMapping("/call")
    public String call(){
        ServiceInstance instance =loadBalancerClient.choose("service-producer");
        URI uri = instance.getUri();
        System.out.println("服务地址:"+ uri);
        System.out.println("服务名称："+instance.getServiceId());
        String forObject = restTemplate.getForObject(uri.toString()+"/hello", String.class);
        return forObject;
    }
}
