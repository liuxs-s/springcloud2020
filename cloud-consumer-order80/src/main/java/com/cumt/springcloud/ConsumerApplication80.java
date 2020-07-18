package com.cumt.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 描述：Consumer80Application启动类
 *
 * @author liuxs_s@163.com
 * @create 2020-06-30 21:58
 **/
@SpringBootApplication
@EnableEurekaClient
public class ConsumerApplication80 {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication80.class,args);
    }
}
