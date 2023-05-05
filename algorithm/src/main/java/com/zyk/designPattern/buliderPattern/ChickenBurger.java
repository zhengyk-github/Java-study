package com.zyk.designPattern.buliderPattern;

/**
 * @ClassName: ChickenBurger
 * @Date: Created in 2023/4/2 22:46
 * @Version: 1.0
 * @Author: zhengyongkai
 * @Modified By:
 * @Description: TODO
 **/
public class ChickenBurger extends Burger {

	@Override
	public float price() {
		return 50.5f;
	}

	@Override
	public String name() {
		return "Chicken Burger";
	}
}