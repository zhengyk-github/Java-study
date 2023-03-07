package com.zyk.springcloud.config;

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
	@Bean
	public RestTemplate getRestTemplate(){
		return new RestTemplate();
	}

}
