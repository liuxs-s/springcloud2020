package com.cumt.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @description: ConsumerOpenfeignOrder80
 * @author: liuxiaosong
 * @Date: 2020/7/29
 * @version: 1.0
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class ConsumerOpenfeignOrder80 {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerOpenfeignOrder80.class,args);
    }
}
