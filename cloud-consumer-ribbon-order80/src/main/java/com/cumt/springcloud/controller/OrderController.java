package com.cumt.springcloud.controller;

import com.cumt.springcloud.entity.Payment;
import com.cumt.springcloud.utils.R;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * 描述：OrderController
 *
 * @author liuxs_s@163.com
 * @create 2020-06-30 22:01
 **/
@RestController
public class OrderController {
    @Resource
    private RestTemplate restTemplate;

    //private static final String PAYMENT_URL = "http://localhost:8001";
    // 通过在eureka上注册过的微服务名称调用
    public static final String PAYMENT_URL="http://CLOUD-PAYMENT-SERVICE";

    @GetMapping("/consumer/payment/get/{id}")
    public R<Payment> getPaymentById(@PathVariable("id")Long id){
        return restTemplate.getForObject(PAYMENT_URL+"/payment/get/"+id, R.class);
    }

    @GetMapping("/consumer/payment/save")
    public R save(Payment payment){
        return restTemplate.postForObject(PAYMENT_URL+"/payment/save",payment,R.class);
    }
}
