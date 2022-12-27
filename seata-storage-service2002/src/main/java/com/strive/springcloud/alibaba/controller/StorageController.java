package com.strive.springcloud.alibaba.controller;

import com.strive.springcloud.alibaba.domain.CommonResult;
import com.strive.springcloud.alibaba.service.StorageService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author l moonlight
 * @create 2022-12-27 20:37
 */
@RestController
public class StorageController {
    @Resource
    private StorageService storageService;

    /**
     * 扣减库存
     * 如果浏览器报错，可以使用postman，或者改为@RequestMapping
     */
    @PostMapping("/storage/decrease")
    public CommonResult decrease(@RequestParam("productId") Long productId, @RequestParam("count") Integer count){
        storageService.decrease(productId,count);
        return new CommonResult(200,"扣减库存成功！");
    }
}
