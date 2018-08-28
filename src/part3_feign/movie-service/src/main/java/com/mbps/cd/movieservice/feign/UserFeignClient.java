package com.mbps.cd.movieservice.feign;

import com.mbps.cd.movieservice.domain.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@FeignClient(name = "user-service")
// 如果不使用服务发现，则可以如下直接指定请求的URL
//@FeignClient(name = "user-service", url = "http://localhost:8000/")
public interface UserFeignClient {
    @GetMapping(value = "/{id}")
    User findById(@PathVariable("id") Long id);

    // 针对两个参数的情况
    @GetMapping(value = "/get")
    User getUserByIdAndUserName(@RequestParam("id") Long id, @RequestParam("username") String username);

    // 针对多个参数的情况 => 使用Map
    @GetMapping(value = "/get")
    User getUserByMap(@RequestParam Map<String, Object> map);

    // 针对Post的情况
    @PostMapping(value = "/post")
    User postUser(@RequestBody User user);
}
