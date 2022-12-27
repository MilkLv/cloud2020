package com.strive.cloud.alibaba.service;

import com.strive.springcloud.entities.CommonResult;
import com.strive.springcloud.entities.Payment;
import org.springframework.stereotype.Component;

/**
 * @author l moonlight
 * @create 2022-12-26 21:33
 */
@Component
public class PaymentFallbackService implements PaymentService{
    @Override
    public CommonResult<Payment> paymentSQL(Long id) {
        return new CommonResult<>(44444,"服务降级返回...PaymentFallbackService",new Payment(id,"errorSerial"));
    }
}
