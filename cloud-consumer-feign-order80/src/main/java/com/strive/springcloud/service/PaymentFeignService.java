package com.strive.springcloud.service;

import com.strive.springcloud.entities.CommonResult;
import com.strive.springcloud.entities.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


/**
 * @author l moonlight
 * @create 2022-12-20 21:40
 */
@FeignClient(value = "CLOUD-PAYMENT-SERVICE")
@Component
public interface PaymentFeignService{

    @GetMapping(value = "/payment/get/{id}")
    CommonResult<Payment> getPaymentById( @PathVariable("id") Long id);

    @GetMapping("/payment/feign/timeout")
    String paymentFeignTimeout();
}
