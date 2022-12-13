package com.zyk.demo04;

import com.zyk.demo02.UserService;
import com.zyk.demo02.UserServiceImpl;

/**
 * @ClassName: Client
 * @Date: Created in 2022/12/13 8:34
 * @Version: 1.0
 * @Author: zhengyongkai
 * @Modified By:
 * @Description: TODO
 **/
public class Client {
	public static void main(String[] args) {
		//真实的对象
		UserServiceImpl userService = new UserServiceImpl();
		//代理角色(不存在)
		ProxyInvocationHandler pih = new ProxyInvocationHandler();
		pih.setObject(userService);//设置要代理的对象
		//动态生成代理类
		UserService proxy = (UserService) pih.getProxy();
		proxy.query();

	}
}
