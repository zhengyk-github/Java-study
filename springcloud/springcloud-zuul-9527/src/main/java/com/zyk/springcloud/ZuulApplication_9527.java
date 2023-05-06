package com.zyk.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @ClassName: ZuulApplication_9527
 * @Date: Created in 2023/5/6 10:13
 * @Version: 1.0
 * @Author: zhengyongkai
 * @Modified By:
 * @Description: TODO
 **/

@SpringBootApplication
@EnableZuulProxy //开启
public class ZuulApplication_9527 {
	public static void main(String[] args) {
		SpringApplication.run(ZuulApplication_9527.class, args);
	}
	//http://www.zyk.com:9527/springcloud-provider-dept/dept/get/1
}
