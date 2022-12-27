package com.strive.springcloud.alibaba.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author l moonlight
 * @create 2022-12-27 20:39
 */
@Configuration
@MapperScan({"com.strive.springcloud.alibaba.dao"})
public class MyBatisConfig {
}
