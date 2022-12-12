package com.zyk.demo01;

/**
 * @ClassName: Client
 * @Date: Created in 2022/12/12 15:13
 * @Version: 1.0
 * @Author: zhengyongkai
 * @Modified By:
 * @Description: TODO
 **/
public class Client {
	public static void main(String[] args) {
		Proxy proxy = new Proxy(new Host());
		proxy.rent();
	}
}
