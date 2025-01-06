package com.Hollis.spi;

/**
 * @ClassName: huawei
 * @Date: Created in 2023/11/15 9:18
 * @Version: 1.0
 * @Author: zhengyongkai
 * @Modified By:
 * @Description: TODO
 **/
public class huawei implements Phone {
	@Override
	public void getName() {
		System.out.println("我是华为手机");
	}
}
