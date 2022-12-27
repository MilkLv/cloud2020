package com.strive.springcloud.alibaba.controller;

import com.strive.springcloud.alibaba.domain.CommonResult;
import com.strive.springcloud.alibaba.domain.Order;
import com.strive.springcloud.alibaba.service.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author l moonlight
 * @create 2022-12-27 19:55
 */
@RestController
public class OrderController {
    @Resource
    private OrderService orderService;

    @GetMapping("/order/create")
    public CommonResult create(Order order){
        orderService.create(order);
        return new CommonResult(200,"订单创建成功");
    }
}
