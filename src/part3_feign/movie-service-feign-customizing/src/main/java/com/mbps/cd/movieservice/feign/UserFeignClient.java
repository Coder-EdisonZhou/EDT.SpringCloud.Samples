package com.mbps.cd.movieservice.feign;

import com.mbps.cd.movieservice.domain.User;
import feign.Param;
import feign.RequestLine;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author EdisonZhou
 */
@FeignClient(name = "user-service", configuration = FeignConfiguration.class)
// 如果不使用服务发现，则可以如下直接指定请求的URL
//@FeignClient(name = "user-service", url = "http://localhost:8000/")
public interface UserFeignClient {
    /**
     * 使用feign自带的注解@RequestLine
     * @see https://github.com/OpenFeign/feign
     * @param id 用户id
     * @return 用户信息
     */
    @RequestLine("GET /{id}")
    User findById(@Param("id") Long id);
}
