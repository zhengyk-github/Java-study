package com.zyk.designPattern.buliderPattern;

/**
 * @ClassName: Coke
 * @Date: Created in 2023/4/2 22:46
 * @Version: 1.0
 * @Author: zhengyongkai
 * @Modified By:
 * @Description: TODO
 **/
public class Coke extends ColdDrink {

	@Override
	public float price() {
		return 30.0f;
	}

	@Override
	public String name() {
		return "Coke";
	}
}