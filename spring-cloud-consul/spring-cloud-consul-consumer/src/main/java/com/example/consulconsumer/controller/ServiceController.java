package com.example.consulconsumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wh
 * @description 示例如何获取consul中的服务
 * @date 2019/4/13
 */
@RestController
public class ServiceController {
    @Autowired
    private LoadBalancerClient loadBalancerClient;
    @Autowired
    private DiscoveryClient discoveryClient;
    /**
     * 获取所有服务
     */
    @RequestMapping("/services")
    public Object services() {
        //获取所有名为"service-producer"的信息返回页面
        return discoveryClient.getInstances("service-producer");
    }

    /**
     * 从所有服务中选择一个服务（轮询）
     */
    @RequestMapping("/discover")
    public Object discover() {
        //轮询从"service-producer"的服务中获取一个,并将该服务的uri地址返回给页面
        return loadBalancerClient.choose("service-producer").getUri().toString();
    }
}
