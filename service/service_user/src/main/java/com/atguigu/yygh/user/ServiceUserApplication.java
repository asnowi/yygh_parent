package com.atguigu.yygh.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * 用户服务启动类
 *
 * @author gaoguanqi
 * @version 1.0
 * @date 2021/3/11 14:45
 */
@SpringBootApplication
@ComponentScan(basePackages = "com.atguigu.yygh")
@EnableDiscoveryClient
@EnableFeignClients(basePackages = "com.atguigu.yygh")
public class ServiceUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceUserApplication.class, args);
    }
}
