package com.strive.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author lzp moonlight
 * @create 2022-12-17 23:24
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {

    private Integer code;

    private String message;

    private  T data;

    public CommonResult(Integer code, String message){
        this(code,message,null);
    }
}
