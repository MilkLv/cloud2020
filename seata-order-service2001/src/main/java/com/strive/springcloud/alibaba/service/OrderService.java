package com.strive.springcloud.alibaba.service;

import com.strive.springcloud.alibaba.domain.Order;

/**
 * @author l moonlight
 * @create 2022-12-27 19:30
 */
public interface OrderService {

    /**
     * 创建订单
     *
     * @param order 订单
     */
    void create(Order order);


}
