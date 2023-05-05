package com.zyk.springcloud.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.zyk.myrule.ZykRandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName: ZykRule
 * @Date: Created in 2023/5/5 11:25
 * @Version: 1.0
 * @Author: zhengyongkai
 * @Modified By:
 * @Description: 这个方法按狂神教程上面应该放到myrule目录下，但是程序允许的时候加载不进去，按网上说的放到扫描的路径下可以
 **/
@Configuration
public class ZykRule {

	@Bean
	public IRule iRule(){
		System.out.println("进入到iRule()方法");
		return new ZykRandomRule();
	}

}
