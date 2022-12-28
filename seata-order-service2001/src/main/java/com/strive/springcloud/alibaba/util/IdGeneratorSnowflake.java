package com.strive.springcloud.alibaba.util;

import cn.hutool.core.lang.Snowflake;
import cn.hutool.core.net.NetUtil;
import cn.hutool.core.util.IdUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * @author l moonlight
 * @create 2022-12-28 20:09
 */
@Component
@Slf4j
public class IdGeneratorSnowflake {
    private long workerId = 0 ;

    private long datacenterId =1;
    /**
     * 范围0-31
     */
    private Snowflake snowflake = IdUtil.getSnowflake(workerId,datacenterId);

    /**
     * PostConstruct注解的方法在项目启动的时候执行这个方法，
     * 也可以理解为在spring容器启动的时候执行，可作为一些数据的常规化加载，比如数据字典之类的
     * Constructor >> @Autowired >> @PostConstruct
     */
    @PostConstruct
    public void init(){
        try {
            workerId= NetUtil.ipv4ToLong(NetUtil.getLocalhostStr());
            log.info("当前机器的workerId{}",workerId);
        } catch (Exception e) {
            e.printStackTrace();
            log.warn("当前机器的workerId获取失败",e);
            workerId=NetUtil.getLocalhostStr().hashCode();
        }
    }

    public synchronized long snowflakeId(){
        return snowflake.nextId();
    }

    public synchronized long snowflakeId(long workerId,long datacenterId){
        Snowflake snowflake = IdUtil.getSnowflake(workerId, datacenterId);
        return snowflake.nextId();
    }

}
