package com.strive.springcloud.controller;

import com.strive.springcloud.entities.CommonResult;
import com.strive.springcloud.entities.Payment;
import com.strive.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;


import javax.annotation.Resource;

/**
 * @author lzp moonlight
 * @create 2022-12-18 0:51
 */
@RestController
@Slf4j
public class PaymentController {

    @Resource
    private PaymentService paymentService;

    /**
     * 新增
     * @param payment
     * @return
     */
    @PostMapping("/payment/create")
    public CommonResult create(@RequestBody Payment payment){
        int result = paymentService.create(payment);
        log.info("******插入结果：{}",result);

        if (result > 0){
            return new CommonResult(200,"插入数据库成功",result);
        }else {
            return new CommonResult(444,"插入失败",null);
        }
    }

    /**
     * 查询
     * @param id
     * @return
     */
    @GetMapping ("/payment/get/{id}")
    public CommonResult seleteByid(@PathVariable("id") Long id){
        Payment payment = paymentService.getPaymentById(id);
        log.info("******查询结果：{}",payment);

        if (payment!=null){
            return new CommonResult(200,"查询成功了",payment);
        }else {
            return new CommonResult(444,"没有对应记录，查询id："+id,null);
        }
    }
}
