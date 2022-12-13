package com.zyk.demo03;

/**
 * @ClassName: Host
 * @Date: Created in 2022/12/12 15:13
 * @Version: 1.0
 * @Author: zhengyongkai
 * @Modified By:
 * @Description: TODO
 **/
public class Host implements Rent {

	@Override
	public void rent() {
		System.out.println("房东要出租房子");
	}

}
