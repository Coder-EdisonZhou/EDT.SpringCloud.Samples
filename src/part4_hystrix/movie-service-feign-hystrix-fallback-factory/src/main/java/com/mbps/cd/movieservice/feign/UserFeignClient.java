package com.mbps.cd.movieservice.feign;

import com.mbps.cd.movieservice.domain.User;
import feign.hystrix.FallbackFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

@FeignClient(name = "user-service", fallbackFactory = FeignClientFallbackFactory.class)
public interface UserFeignClient {
    @GetMapping(value = "/{id}")
    User findById(@PathVariable("id") Long id);
}

@Component
class FeignClientFallbackFactory implements FallbackFactory<UserFeignClient> {
    private static final Logger LOGGER =
            LoggerFactory.getLogger(FeignClientFallbackFactory.class);

    @Override
    public UserFeignClient create(Throwable cause) {
        return new UserFeignClient() {
            @Override
            public User findById(Long id) {
                /*
                 * 日志最好放在各个fallback中，而不要直接放在create方法中
                 * 否则在引用启动时，就会打印该日志
                 */
                FeignClientFallbackFactory.LOGGER.info("sorry, fallback. reason was: ", cause);
                User user = new User();
                user.setId(-1L);
                user.setUsername("Default Username");

                return user;
            }
        };
    }
}
