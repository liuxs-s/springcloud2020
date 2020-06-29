package com.cumt.springcloud.dao;

import com.cumt.springcloud.entity.Payment;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * 描述：PaymentDao
 *
 * @author liuxs_s@163.com
 * @create 2020-06-29 21:56
 **/
@Mapper
public interface PaymentDao {

    //@Insert("insert into payment(serial) values(#{serial})")
    public int save(Payment payment);

    //@Select("select * from payment where id = #{id}")
    public Payment getPaymentById(@Param("id") String id);
}
