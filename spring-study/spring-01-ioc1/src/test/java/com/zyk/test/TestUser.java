package com.zyk.test;

import com.zyk.dao.UserDaoImpl;
import com.zyk.dao.UserDaoMysqlImpl;
import com.zyk.dao.UserDaoOracleImpl;
import com.zyk.service.UserService;
import com.zyk.service.UserServiceImpl;

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
		UserServiceImpl userService = new UserServiceImpl();
		userService.setUserDao(new UserDaoMysqlImpl());
		userService.getUser();
	}

}
