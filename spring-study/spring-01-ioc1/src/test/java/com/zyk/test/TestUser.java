package com.zyk.test;

import com.zyk.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName: TestUser
 * @Date: Created in 2022/12/7 12:22
 * @Version: 1.0
 * @Author: zhengyongkai
 * @Modified By:
 * @Description: TODO
 **/
public class TestUser {
	public static void main(String[] args) {
		/*UserServiceImpl userService = new UserServiceImpl();
		userService.setUserDao(new UserDaoMysqlImpl());
		userService.getUser();*/
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		UserServiceImpl userServiceImpl = (UserServiceImpl) context.getBean("UserServiceImpl");

		userServiceImpl.getUser();

	}

}
