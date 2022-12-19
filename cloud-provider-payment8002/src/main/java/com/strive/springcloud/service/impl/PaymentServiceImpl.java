package com.strive.springcloud.service.impl;

import com.strive.springcloud.entities.Payment;
import org.springframework.stereotype.Service;
import com.strive.springcloud.dao.PaymentDao;
import com.strive.springcloud.service.PaymentService;


import javax.annotation.Resource;

/**
 * @author lzp moonlight
 * @create 2022-12-18 0:42
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
