package com.zyk.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @ClassName: DeptConsumerDashboard_9001
 * @Date: Created in 2023/5/5 21:05
 * @Version: 1.0
 * @Author: zhengyongkai
 * @Modified By:
 * @Description: TODO
 **/
@SpringBootApplication
@EnableHystrixDashboard //开启监控
public class DeptConsumerDashboard_9001 {
	public static void main(String[] args) {
		SpringApplication.run(DeptConsumerDashboard_9001.class,args);
		//访问 http://localhost:9001/hystrix
		//在出现的网址框内输入 http://localhost:8001/actuator/hystrix.stream
	}
}
