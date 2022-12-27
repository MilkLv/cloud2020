package com.strive.springcloud.alibaba.dao;

import com.strive.springcloud.alibaba.domain.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author l moonlight
 * @create 2022-12-27 19:07
 */
@Mapper
public interface OrderDao {
    /**
     * 新建订单
     * @param order 订单
     */
    void create(Order order);


    /**
     * 修改订单状态，从零改为1
     * @param userId 用户id
     * @param status 状态
     */
    void update(@Param("userId") Long userId,@Param("status") Integer status);
}
