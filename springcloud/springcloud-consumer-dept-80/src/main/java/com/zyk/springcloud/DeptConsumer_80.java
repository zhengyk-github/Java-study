package com.zyk.springcloud;

import com.zyk.springcloud.config.ZykRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

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
//在微服务启动的时候就能去加载我们自定义的Ribbon类
@RibbonClient(name="SPRINGCLOUD-PROVIDER-DEPT",configuration = ZykRule.class)
public class DeptConsumer_80 {
	public static void main(String[] args) {
		SpringApplication.run(DeptConsumer_80.class, args);
	}
}
