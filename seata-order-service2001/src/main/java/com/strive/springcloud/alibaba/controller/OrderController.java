package com.strive.springcloud.alibaba.controller;

import cn.hutool.core.lang.Snowflake;
import cn.hutool.core.util.IdUtil;
import com.strive.springcloud.alibaba.domain.CommonResult;
import com.strive.springcloud.alibaba.domain.Order;
import com.strive.springcloud.alibaba.service.OrderService;
import com.strive.springcloud.alibaba.util.IdGeneratorSnowflake;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.commons.util.IdUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author l moonlight
 * @create 2022-12-27 19:55
 */
@RestController
public class OrderController {
    @Resource
    private OrderService orderService;

    @Autowired
    private IdGeneratorSnowflake idGeneratorSnowflake;


    @GetMapping("/order/create")
    public CommonResult create(Order order){
        orderService.create(order);
        return new CommonResult(200,"订单创建成功");
    }

    @GetMapping("/order/snowflake")
    public String getIdBySnowFlake(){
        ExecutorService pool = Executors.newFixedThreadPool(5);

        for (int i = 0; i <= 20; i++) {
            pool.submit(()->{
                System.out.println(idGeneratorSnowflake.snowflakeId());
            });
        }
        return "hello snowflake";
    }


}
