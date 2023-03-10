package com.zyk.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @ClassName: DeptProvider_8001
 * @Date: Created in 2023/3/6 22:19
 * @Version: 1.0
 * @Author: zhengyongkai
 * @Modified By:
 * @Description: TODO
 **/
//启动类
@SpringBootApplication
@EnableEurekaClient //在服务启动之后自动注册到Eureka中
@EnableDiscoveryClient //服务发现
public class DeptProvider_8003 {
	public static void main(String[] args) {
		SpringApplication.run(DeptProvider_8003.class,args);

	}
}
