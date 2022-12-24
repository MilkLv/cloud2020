package com.strive.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author l moonlight
 * @create 2022-12-24 20:33
 */
@SpringBootApplication
@EnableDiscoveryClient
public class OrderNacosMain83 {
    public static void main(String[] args){
        SpringApplication.run(OrderNacosMain83.class,args);
    }
}
