package com.zzw.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author zzw
 * @Date 2020/10/23 16:09
 * @Version 1.0
 */
//启动类
@SpringBootApplication
@EnableEurekaClient //自动在服务启动后自动注册到Eureka
@EnableDiscoveryClient //服务发现
public class DeptProvider_8003 {
    public static void main(String[] args) {
        SpringApplication.run(DeptProvider_8003.class,args);
    }
}
