package com.cumt.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @description: PaymentProviderApplication8002
 * @author: liuxiaosong
 * @Date: 2020/7/18
 * @version: 1.0
 */
@SpringBootApplication
@EnableEurekaClient
public class PaymentProviderApplication8002 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentProviderApplication8002.class,args);
    }
}
