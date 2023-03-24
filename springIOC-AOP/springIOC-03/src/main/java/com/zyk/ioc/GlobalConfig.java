package com.zyk.ioc;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @ClassName: GlobalConfig
 * @Date: Created in 2023/3/24 16:21
 * @Version: 1.0
 * @Author: zhengyongkai
 * @Modified By:
 * @Description: TODO
 **/
@Data
@Component
public class GlobalConfig {
	@Value("80")
	private String port;
	@Value("/")
	private String path;
	@Autowired
	@Qualifier("config") //@Qualifier：必须配合Autowired使用，实体类上面的注解@Component("config")需要指定名字
	private DataConfig dataconfig;
}
