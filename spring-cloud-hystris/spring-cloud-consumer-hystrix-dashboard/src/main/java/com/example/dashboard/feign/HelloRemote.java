package com.example.dashboard.feign;

import com.example.dashboard.feign.feignHystrisImpl.HytrisIsHelloRemote;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "spring-cloud-producer",fallback = HytrisIsHelloRemote.class) //name与被调用的配置文件中的spring.application.name保持一致
//falback:指向回调类,也就是该类的实现类,从而根据方法的重写达到断路与降级
public interface HelloRemote {
    @RequestMapping("/hello")
    String hello(@RequestParam(value = "name") String name);
}
