package com.Hollis.spi;

/**
 * @ClassName: Iphone
 * @Date: Created in 2023/11/15 9:19
 * @Version: 1.0
 * @Author: zhengyongkai
 * @Modified By:
 * @Description: TODO
 **/
public class iphone implements Phone {
	@Override
	public void getName() {
		System.out.println("我是苹果手机");
	}
}
