package com.mbps.cd.movieservice.feign;

import com.mbps.cd.movieservice.domain.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "user-service", configuration = FeignLogConfiguration.class)
public interface UserFeignClient {
    @GetMapping(value = "/{id}")
    User findById(@PathVariable("id") Long id);
}
