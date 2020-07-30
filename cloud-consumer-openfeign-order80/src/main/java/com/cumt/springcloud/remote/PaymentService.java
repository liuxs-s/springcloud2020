package com.cumt.springcloud.remote;

import com.cumt.springcloud.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @description: PaymentService
 * @author: liuxiaosong
 * @Date: 2020/7/29
 * @version: 1.0
 */
@Component
@FeignClient(value = "cloud-payment-service")
public interface PaymentService {

    @GetMapping("/payment/get/{id}")
    public R getPaymentById(@PathVariable("id")Long id);

    @GetMapping(value = "/payment/timeout")
    public String feignTimeout();
}
