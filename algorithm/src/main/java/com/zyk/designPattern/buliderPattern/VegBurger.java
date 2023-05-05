package com.zyk.designPattern.buliderPattern;

/**
 * @ClassName: VegBurger
 * @Date: Created in 2023/4/2 22:45
 * @Version: 1.0
 * @Author: zhengyongkai
 * @Modified By:
 * @Description: TODO
 **/
public class VegBurger extends Burger {

	@Override
	public float price() {
		return 25.0f;
	}

	@Override
	public String name() {
		return "Veg Burger";
	}
}
