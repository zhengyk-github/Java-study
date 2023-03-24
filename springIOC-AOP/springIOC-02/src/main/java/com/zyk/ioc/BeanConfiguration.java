package com.zyk.ioc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName: BeanConfiguration
 * @Date: Created in 2023/3/24 15:43
 * @Version: 1.0
 * @Author: zhengyongkai
 * @Modified By:
 * @Description: 通过配置类实现IOC
 **/
@Configuration
public class BeanConfiguration {

	@Bean(value = "config")
	public DataConfiguration dataConfig(){
		DataConfiguration dc = new DataConfiguration();
		dc.setDriver("Driver");
		dc.setUrl("localhost:8080");
		dc.setUsername("root");
		dc.setPwd("123456");
		return dc;
	}

}
