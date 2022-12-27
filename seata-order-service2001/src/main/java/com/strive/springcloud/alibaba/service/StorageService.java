package com.strive.springcloud.alibaba.service;

import com.strive.springcloud.alibaba.domain.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author l moonlight
 * @create 2022-12-27 19:35
 */
@FeignClient(value = "seata-storage-service")
public interface StorageService {


    /**
     * 扣减库存
     */
    @PostMapping("/storage/decrease")
    CommonResult decrease(@RequestParam("productId") Long productId,@RequestParam("count") Integer count);
}
