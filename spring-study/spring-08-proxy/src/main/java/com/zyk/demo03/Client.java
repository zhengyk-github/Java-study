package com.zyk.demo03;

/**
 * @ClassName: Client
 * @Date: Created in 2022/12/12 17:57
 * @Version: 1.0
 * @Author: zhengyongkai
 * @Modified By:
 * @Description: TODO
 **/
public class Client {
	public static void main(String[] args) {
		//真实角色
		Host host = new Host();
		//代理角色：现在没有
		ProxyInvocationHandler pih = new ProxyInvocationHandler();
		//通过调用程序处理角色来处理我们要调用的接口对象
		pih.setRent(host);
		Rent proxy = (Rent) pih.getProxy();
		proxy.rent();

	}
}
