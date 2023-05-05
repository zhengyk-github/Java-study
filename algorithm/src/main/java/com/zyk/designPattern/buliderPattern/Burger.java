package com.zyk.designPattern.buliderPattern;

/**
 * @ClassName: Burger
 * @Date: Created in 2023/4/2 22:41
 * @Version: 1.0
 * @Author: zhengyongkai
 * @Modified By:
 * @Description: TODO
 **/
public abstract class Burger implements Item {

	@Override
	public Packing packing() {
		return new Wrapper();
	}

	@Override
	public abstract float price();
}
