package com.cumt.springcloud.controller;

import com.cumt.springcloud.entity.Payment;
import com.cumt.springcloud.remote.PaymentService;
import com.cumt.springcloud.utils.R;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @description: ConsumerController
 * @author: liuxiaosong
 * @Date: 2020/7/29
 * @version: 1.0
 */
@RestController
@Slf4j
public class ConsumerController {

    @Resource
    private PaymentService paymentService;

    @GetMapping(value = "/consumer/payment/get/{id}",produces="application/json")
    public R<Payment> getPaymentById(@PathVariable("id") Long id){
        R<Payment> paymentById = paymentService.getPaymentById(id);
        return paymentById;
    }

    @GetMapping(value = "/consumer/timeout")
    public String feignTimeout(){
        //open-feign-ribbon,客户端默认等待一秒钟
        return paymentService.feignTimeout();
    }

}
