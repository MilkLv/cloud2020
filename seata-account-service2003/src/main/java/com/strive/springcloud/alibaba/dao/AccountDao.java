package com.strive.springcloud.alibaba.dao;

import com.strive.springcloud.alibaba.domain.CommonResult;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;

/**
 * @author l moonlight
 * @create 2022-12-27 20:51
 */
@Mapper
public interface AccountDao {
    /**
     * 扣减账户余额
     */
    @PostMapping("/account/decrease")
    void  decrease(@Param("userId") Long userId, @Param("money") BigDecimal money);
}
