package com.zyk.designPattern.buliderPattern;

/**
 * @ClassName: Bottle
 * @Date: Created in 2023/4/2 22:39
 * @Version: 1.0
 * @Author: zhengyongkai
 * @Modified By:
 * @Description: TODO
 **/
public class Bottle implements Packing{
	@Override
	public String pack() {
		return "Bottle";
	}
}
