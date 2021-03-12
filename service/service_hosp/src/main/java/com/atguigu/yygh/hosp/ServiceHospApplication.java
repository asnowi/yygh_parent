package com.atguigu.yygh.hosp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * 医院服务启动类
 *
 * @author gaoguanqi
 * @version 1.0
 * @date 2021/3/12 08:45
 */
@SpringBootApplication
@ComponentScan(basePackages = "com.atguigu.yygh")
@EnableDiscoveryClient
@EnableFeignClients(basePackages = "com.atguigu.yygh")
public class ServiceHospApplication {
    public static void main(String[] args) {
        SpringApplication.run(ServiceHospApplication.class, args);
    }
}
