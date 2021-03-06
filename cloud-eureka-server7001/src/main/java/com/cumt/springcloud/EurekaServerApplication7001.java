package com.cumt.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @description: EurekaApplication启动类
 * @author: liuxiaosong
 * @Date: 2020/7/7
 * @version: 1.0
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApplication7001 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServerApplication7001.class,args);
    }
}
