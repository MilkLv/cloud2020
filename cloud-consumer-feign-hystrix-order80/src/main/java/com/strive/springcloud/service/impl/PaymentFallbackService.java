package com.strive.springcloud.service.impl;

import com.strive.springcloud.service.PaymentHystrixService;
import org.springframework.stereotype.Component;

/**
 * @author l moonlight
 * @create 2022-12-21 20:29
 */
@Component
public class PaymentFallbackService implements PaymentHystrixService {
    @Override
    public String paymentInfoOk(Integer id) {
        return "PaymentFallbackService fall bake ok ........";
    }

    @Override
    public String paymentInfoTimeout(Integer id) {
        return "PaymentFallbackService fall bake timeout ........";
    }
}
