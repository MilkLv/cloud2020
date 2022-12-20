package com.strive.springcloud.controller;

import com.strive.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author l moonlight
 * @create 2022-12-20 23:46
 */
@RestController
@Slf4j
public class PaymentController {
    @Resource
    private PaymentService paymentService;
    @Value("${server.port}")
    private String serverPort;

    @GetMapping("/payment/hystrix/ok/{id}")
    public String paymentInfoOk(@PathVariable("id") Integer id){
        String infoOk = paymentService.paymentInfoOk(id);
        log.info("******result：{}",infoOk);
        return infoOk;
    }

    @GetMapping("/payment/hystrix/timeout/{id}")
    public String paymentInfoTimeout(@PathVariable("id") Integer id){
        String infoTimeOut = paymentService.paymentInfoTimeOut(id);
        log.info("******result：{}",infoTimeOut);
        return infoTimeOut;
    }
}
