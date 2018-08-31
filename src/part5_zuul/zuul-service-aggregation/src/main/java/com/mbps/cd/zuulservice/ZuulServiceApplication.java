package com.mbps.cd.zuulservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableZuulProxy
/**
 * @description: dfds
 * @param: 
 * @return: 
 * @author: Edison Zhou
 * @date: 2018/8/31
 **/
public class ZuulServiceApplication {

	public static void main(String[] args) {

		SpringApplication.run(ZuulServiceApplication.class, args);
	}

	@Autowired
	private RestTemplateBuilder builder;

	@Bean
	@LoadBalanced
	public RestTemplate restTemplate(){
		return builder.build();
	}
}
