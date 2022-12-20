package com.strive.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * @author lzp moonlight
 * @create 2022-12-20 20:08
 */

public interface LoadBalancer {

    ServiceInstance instances(List<ServiceInstance> serviceInstances);
}
