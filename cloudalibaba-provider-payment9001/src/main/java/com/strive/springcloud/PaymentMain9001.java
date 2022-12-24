package com.strive.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author l moonlight
 * @create 2022-12-24 19:53
 */
@SpringBootApplication
@EnableDiscoveryClient //让注册中心能够发现，扫描到该服务。
public class PaymentMain9001 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentMain9001.class, args);
    }
}
