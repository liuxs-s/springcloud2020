package com.cumt.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 描述：启动类
 *
 * @author liuxs_s@163.com
 * @create 2020-06-27 23:45
 **/
@MapperScan("com.cumt.springcloud.dao")  //使用mybatis注解方式必须加上扫描包
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
public class PaymentProviderApplication8001 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentProviderApplication8001.class,args);
    }
}
