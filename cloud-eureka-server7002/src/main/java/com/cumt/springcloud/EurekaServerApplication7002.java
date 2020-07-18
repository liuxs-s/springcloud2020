package com.cumt.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @description: EurekaServerApplication7002
 * @author: liuxiaosong
 * @Date: 2020/7/18
 * @version: 1.0
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApplication7002 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServerApplication7002.class,args);
    }
}
