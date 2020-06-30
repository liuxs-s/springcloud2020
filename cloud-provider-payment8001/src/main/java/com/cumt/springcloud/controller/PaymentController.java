package com.cumt.springcloud.controller;

import com.cumt.springcloud.entity.Payment;
import com.cumt.springcloud.service.PaymentService;
import com.cumt.springcloud.utils.R;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 描述：PaymentController
 *
 * @author liuxs_s@163.com
 * @create 2020-06-29 22:08
 *
 * @RequestBody的作用：不加为啥会报错，应该什么时候加
 **/
@RestController
@Slf4j
public class PaymentController {

    @Resource
    private PaymentService paymentService;

    @PostMapping("/payment/save")
    public R create(@RequestBody Payment payment){
        int result = paymentService.save(payment);
        log.info("*******保存payment结果为："+result);
        if(result > 0){
            return new R(200,"保存成功",result);
        }else{
            return new R(500,"保存失败",null);
        }
    }

    @GetMapping("/payment/get/{id}")
    public R getPaymentById(@PathVariable("id")Long id){
        Payment payment = paymentService.getPaymentById(id);
        log.info("*******查询payment结果为："+payment);
        if(payment != null){
            return new R(200,"查询成功",payment);
        }else{
            return new R(400,"没有对应记录,查询ID: "+id,null);
        }
    }
}
