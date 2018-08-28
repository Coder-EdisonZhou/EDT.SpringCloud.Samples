package com.mbps.cd.movieservice.web;

import com.google.common.collect.Maps;
import com.mbps.cd.movieservice.domain.User;
import com.mbps.cd.movieservice.feign.UserFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

/**
 * @author EdisonZhou
 */
@RestController
public class MovieController {
    @Autowired
    private UserFeignClient userFeignClient;

    @GetMapping(value = "/user/{id}")
    public User findById(@PathVariable Long id) {
        return userFeignClient.findById(id);
    }

    // 针对多个参数的情况
    @GetMapping(value = "/userget/{username}&{password}&{token}")
    public User getUserByMap(@PathVariable("username") String username,
                             @PathVariable("password") String password,
                             @PathVariable("token") String token){
        HashMap<String, Object> map = Maps.newHashMap();
        map.put("username", username);
        map.put("password", password);
        map.put("token", token);

        return userFeignClient.getUserByMap(map);
    }

    @PostMapping(value = "/post")
    public User post(@RequestBody User user){
        // TO DO
        return null;
    }
}
