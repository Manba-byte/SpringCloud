package com.example.hystris.feign.feignHystrisImpl;

import com.example.hystris.feign.HelloRemote;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author wh
 * @description 实现feign接口，并提供fallbac
 * @date 2019/4/10
 */
@Component //IOC容器识别
public class HytrisIsHelloRemote implements HelloRemote {
    @Override
    public String hello(@RequestParam(value = "name") String name) {
        return "服务么得了  "+name;
    }
}
