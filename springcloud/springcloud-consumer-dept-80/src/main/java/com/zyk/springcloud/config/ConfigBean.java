package com.zyk.springcloud.config;

import com.netflix.loadbalancer.IRule;
import com.zyk.myrule.ZykRandomRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName: ConfigBean
 * @Date: Created in 2023/3/7 8:59
 * @Version: 1.0
 * @Author: zhengyongkai
 * @Modified By:
 * @Description: TODO
 **/

@Configuration
public class ConfigBean {//@Configuration  相当于 spring中的 applicationContext.xml
	/*@Bean
	public RestTemplate getRestTemplate(){
		return new RestTemplate();
	}*/

	//配置负载均衡实现RestTemplate
	//IRule
	//RoundRobinRule 轮询
	//RandomRule 随机
	//AvailabilityFilteringRule 会先过滤掉(跳闸)访问故障的服务,对剩下的进行轮询
	//RetryRule 会先按照轮询获取服务，如果服务获取失败，则会在指定的时间内进行重试
	@Bean
	@LoadBalanced //Ribbon
	public RestTemplate getRestTemplate(){
		return new RestTemplate();
	}

	/*@Bean
	public IRule iRule(){
		System.out.println("进入到iRule()方法");
		return new ZykRandomRule();
	}*/
}
