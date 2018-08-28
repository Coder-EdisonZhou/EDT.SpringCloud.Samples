package com.mbps.cd.movieservice.feign;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FeignLogConfiguration {
    @Bean
    Logger.Level feignLoggerLevel(){
        /*
         * Logger.Level 可选值：
         * NONE: 不记录任何日志（默认值）
         * BASIC: 仅记录请求方法、URL、响应状态码以及执行时间
         * HEADERS: 记录BASIC级别的基础之上，记录请求和响应的header
         * FULL: 记录请求和响应的header，body和元数据
         */
        return Logger.Level.BASIC;
    }
}
