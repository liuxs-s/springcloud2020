package com.cumt.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * 描述：RestTempleteConfig 用于服务之间远程调用，通过http形式，底层是httpclient
 *
 * @author liuxs_s@163.com
 * @create 2020-06-29 22:57
 **/
@Configuration

public class RestTempleteConfig {

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
