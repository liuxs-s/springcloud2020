package com.cumt.springcloud;

import com.cumt.rules.MyRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @description: ConsumerRibbonApplication80
 * @author: liuxiaosong
 * @Date: 2020/7/29
 * @version: 1.0
 */
@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name = "CLOUD-PAYMENT-SERVICE", configuration = MyRule.class)
public class ConsumerRibbonApplication80 {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerRibbonApplication80.class,args);
    }
}
