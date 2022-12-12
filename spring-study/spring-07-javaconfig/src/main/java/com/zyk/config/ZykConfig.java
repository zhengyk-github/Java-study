package com.zyk.config;

import com.zyk.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName: ZykConfig
 * @Date: Created in 2022/12/9 16:54
 * @Version: 1.0
 * @Author: zhengyongkai
 * @Modified By:
 * @Description: TODO
 **/
@Configuration
public class ZykConfig {
	@Bean
	public User getUser() {
		return new User();
	}
}
