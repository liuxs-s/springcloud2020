package com.cumt.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @description: 启动类
 * @author: liuxiaosong
 * @Date: 2020/7/29
 * @version: 1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ConsumerConsulOrder80 {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerConsulOrder80.class,args);
    }
}
