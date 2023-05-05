package com.zyk.designPattern.buliderPattern;

/**
 * @ClassName: ColdDrink
 * @Date: Created in 2023/4/2 22:42
 * @Version: 1.0
 * @Author: zhengyongkai
 * @Modified By:
 * @Description: TODO
 **/
public abstract class ColdDrink implements Item{
	@Override
	public Packing packing() {
		return new Bottle();
	}

	@Override
	public abstract float price();
}
