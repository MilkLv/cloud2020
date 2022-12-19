package com.strive.springcloud.service;

import com.strive.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @author lzp moonlight
 * @create 2022-12-18 0:40
 */
public interface PaymentService {

    /**
     * 创建
     *
     * @param payment 付款
     * @return int
     */
    int create(Payment payment);

    /**
     * 通过id获取付款
     *
     * @param id id
     * @return {@link Payment}
     */
    Payment getPaymentById(@Param("id") Long id);
}
