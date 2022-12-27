package com.strive.springcloud.alibaba.myhandler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.strive.springcloud.entities.CommonResult;

/**
 * @author l moonlight
 * @create 2022-12-26 20:08
 */
public class CustomerBlockHandler {
    public static CommonResult handleException(BlockException exception){
        return new CommonResult(2020,"自定义的限流处理信息......CustomerBlockHandler");
    }

    public static CommonResult handleException2(BlockException exception){
        return new CommonResult(2020,"自定义的限流处理信息......CustomerBlockHandler2");
    }
}
