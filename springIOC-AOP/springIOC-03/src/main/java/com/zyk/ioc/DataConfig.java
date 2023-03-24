package com.zyk.ioc;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @ClassName: config
 * @Date: Created in 2023/3/24 16:05
 * @Version: 1.0
 * @Author: zhengyongkai
 * @Modified By:
 * @Description: 通过注解+扫包实现IOC
 **/
@Data
// @Component //把类交给spring管理
@Component("config") //和@Qualifier("config")一起使用
public class DataConfig {
	@Value("localhost:8080")
	private String url;
	@Value("root")
	private String username;
	@Value("123456")
	private String pwd;
	@Value("Driver")
	private String driver;
}
