package com.cumt.springcloud.service;

import com.cumt.springcloud.entity.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * 描述：PaymentService
 *
 * @author liuxs_s@163.com
 * @create 2020-06-29 22:04
 **/
public interface PaymentService {

    public int save(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
