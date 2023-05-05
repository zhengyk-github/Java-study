package com.zyk.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * @ClassName: DeptConsumer_80
 * @Date: Created in 2023/3/7 9:50
 * @Version: 1.0
 * @Author: zhengyongkai
 * @Modified By:
 * @Description: TODO
 **/
//Ribbon和Eureka整合以后，客户端可以直接调用，不用关心IP地址和端口号
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = {"com.zyk.springcloud"})
//@ComponentScan("com.zyk")
public class FeignDeptConsumer_80 {
	public static void main(String[] args) {
		SpringApplication.run(FeignDeptConsumer_80.class, args);
	}
}
