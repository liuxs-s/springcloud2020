package com.cumt.springcloud.service.impl;

import com.cumt.springcloud.dao.PaymentDao;
import com.cumt.springcloud.entity.Payment;
import com.cumt.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 描述：
 *
 * @author liuxs_s@163.com
 * @create 2020-06-29 22:05
 **/
@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;

    @Override
    public int save(Payment payment) {
        return paymentDao.save(payment);
    }

    @Override
    public Payment getPaymentById(String id) {
        return paymentDao.getPaymentById(id);
    }
}
