package com.zyk.demo02;

/**
 * @ClassName: Client
 * @Date: Created in 2022/12/12 16:29
 * @Version: 1.0
 * @Author: zhengyongkai
 * @Modified By:
 * @Description: TODO
 **/
public class Client {
	public static void main(String[] args) {
		UserServiceImpl userServiceImpl = new UserServiceImpl();
		UserServiceProxy proxy = new UserServiceProxy();
		proxy.setUserService(userServiceImpl);
		proxy.query();


	}
}
