package com.zyk.designPattern.buliderPattern;

/**
 * @ClassName: Pepsi
 * @Date: Created in 2023/4/2 22:47
 * @Version: 1.0
 * @Author: zhengyongkai
 * @Modified By:
 * @Description: TODO
 **/
public class Pepsi extends ColdDrink {

	@Override
	public float price() {
		return 35.0f;
	}

	@Override
	public String name() {
		return "Pepsi";
	}
}