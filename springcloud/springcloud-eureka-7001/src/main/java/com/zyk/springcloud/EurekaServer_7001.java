package com.zyk.springcloud;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @ClassName: EurekaServer_7001
 * @Date: Created in 2023/3/7 14:37
 * @Version: 1.0
 * @Author: zhengyongkai
 * @Modified By:
 * @Description: TODO
 **/
@SpringBootApplication
@EnableEurekaServer //@EnableEurekaServer 服务端的启动类，可以接受别人注册进来
public class EurekaServer_7001 {
	public static void main(String[] args) {
		SpringApplication.run(EurekaServer_7001.class,args);
	}
	//启动之后访问 http://localhost:7001/

	/*
    做集群的时候修改hosts文件
	C:\Windows\System32\drivers\etc

	127.0.0.1 eureka7001.com
	127.0.0.1 eureka7002.com
	127.0.0.1 eureka7003.com
	*/
}
