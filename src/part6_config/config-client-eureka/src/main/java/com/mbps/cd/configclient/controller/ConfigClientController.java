package com.mbps.cd.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @project: part6_config
 * @description:
 * @author: Edison Zhou
 * @create: 2018-09-10
 **/
@RestController
@RefreshScope // @RefreshScope注解不能少，否则即使调用/refresh，配置也不会刷新
public class ConfigClientController {
    @Value("${profile}")
    private String profile;

    @GetMapping("/profile")
    public String hello(){
        return this.profile;
    }
}
