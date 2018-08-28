package com.mbps.cd.movieservice.web;

import com.mbps.cd.movieservice.domain.User;
import com.mbps.cd.movieservice.feign.UserFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
}
