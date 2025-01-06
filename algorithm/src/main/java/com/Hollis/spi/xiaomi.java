package com.Hollis.spi;

/**
 * @ClassName: xiaomi
 * @Date: Created in 2023/11/15 9:19
 * @Version: 1.0
 * @Author: zhengyongkai
 * @Modified By:
 * @Description: TODO
 **/
public class xiaomi implements Phone{
	@Override
	public void getName() {
		System.out.println("我是小米手机");
	}
}
