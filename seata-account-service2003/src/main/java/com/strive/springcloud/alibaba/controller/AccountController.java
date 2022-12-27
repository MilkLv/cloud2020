package com.strive.springcloud.alibaba.controller;

import com.strive.springcloud.alibaba.domain.CommonResult;
import com.strive.springcloud.alibaba.service.AccountService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.math.BigDecimal;

/**
 * @author l moonlight
 * @create 2022-12-27 20:59
 */
@RestController
public class AccountController {
    @Resource
    private AccountService accountService;
    /**
     * 扣减账户余额
     * 如果浏览器报错，可以使用postman，或者改为@RequestMapping
     */
    @PostMapping("/account/decrease")
    public CommonResult decrease(@RequestParam("userId") Long userId, @RequestParam("money") BigDecimal money){
        accountService.decrease(userId,money);
        return new CommonResult(200,"扣减账户余额成功！");
    }
}
