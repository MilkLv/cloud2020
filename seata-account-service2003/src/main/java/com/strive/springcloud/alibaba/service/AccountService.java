package com.strive.springcloud.alibaba.service;

import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;

/**
 * @author l moonlight
 * @create 2022-12-27 20:55
 */

public interface AccountService {
    /**
     * 扣减账户余额
     */
    void  decrease(@RequestParam("userId") Long userId, @RequestParam("money") BigDecimal money);
}
