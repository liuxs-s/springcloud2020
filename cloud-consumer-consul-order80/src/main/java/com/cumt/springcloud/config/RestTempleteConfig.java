package com.cumt.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @description: RestTempleteConfig
 * @author: liuxiaosong
 * @Date: 2020/7/29
 * @version: 1.0
 */
@Configuration
public class RestTempleteConfig {
    @Bean
    @LoadBalanced
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
