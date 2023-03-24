package com.zyk;

import com.zyk.ioc.DataConfig;
import com.zyk.ioc.GlobalConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @ClassName: test
 * @Date: Created in 2023/3/24 16:12
 * @Version: 1.0
 * @Author: zhengyongkai
 * @Modified By:
 * @Description: TODO
 **/
public class test {
	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext("com.zyk.ioc");
		//System.out.println(context.getBean(DataConfig.class));
		// System.out.println(context.getBean(GlobalConfig.class));
		System.out.println(context.getBean("config"));
	}
}
