package com.strive.springcloud.service;

import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

/**
 * @author l moonlight
 * @create 2022-12-20 23:40
 */
@Service
public class PaymentService {

    /**
     * 正常访问
     * @param id
     * @return
     */
    public String paymentInfoOk(Integer id){
        return "线程池："+Thread.currentThread().getName()+"paymentInfo_Ok,id:"+id+"\t"+"zz";
    }

    public String paymentInfoTimeOut(Integer id){
        int timeNumber= 3;
        try {
            TimeUnit.SECONDS.sleep(timeNumber);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "线程池："+Thread.currentThread().getName()+"paymentInfo_Timeout,id:"+id+"\t"+"zz"+"耗时(秒)"+timeNumber;
    }

}
