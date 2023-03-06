package com.zyk.annotation;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: 内置注解
 * @Date: Created in 2023/2/22 10:13
 * @Version: 1.0
 * @Author: zhengyongkai
 * @Modified By:
 * @Description: P2 内置注解
 **/
public class 内置注解 extends Object{
	//@Override 重写的注解
	@Override
	public String toString(){
		return super.toString();
	}

	//@Deprecated  不推荐程序员使用，但是可以使用 或者有很好的方式
	@Deprecated
	public static void testDeprecated(){
		System.out.println("testDeprecated");
	}

	//@SuppressWarnings("all") 抑制警告
	@SuppressWarnings("all")
	public void testSuppressWarnings(){
		List list = new ArrayList();
	}


	public static void main(String[] args) {
		testDeprecated();
	}


}
