package com.strive.springcloud.alibaba.service;

/**
 * @author l moonlight
 * @create 2022-12-27 20:33
 */

public interface StorageService {
    /**
     * 扣减库存
     */
    void decrease(Long productId, Integer count);
}
