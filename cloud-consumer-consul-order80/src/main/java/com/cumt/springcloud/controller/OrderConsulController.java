package com.cumt.springcloud.controller;

import com.cumt.springcloud.entity.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @description: OrderConsulController
 * @author: liuxiaosong
 * @Date: 2020/7/29
 * @version: 1.0
 */
@RestController
@Slf4j
public class OrderConsulController {

    public static final String PAYMENT_URL = "http://cloud-provider-payment";

    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/consumer/payment/consul")
    public String create(Payment payment) {
        return restTemplate.getForObject(PAYMENT_URL + "/payment/consul", String.class);
    }

}
