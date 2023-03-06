package com.zyk.annotation;

import javax.lang.model.element.VariableElement;
import java.util.HashSet;
import java.util.Set;

/**
 * @ClassName: 分析类初始化
 * @Date: Created in 2023/2/25 16:06
 * @Version: 1.0
 * @Author: zhengyongkai
 * @Modified By:
 * @Description: P10 分析类初始化
 **/
//测试类什么时候会初始化
public class 分析类初始化 {
	static {
		System.out.println("main类被加载");
	}

	public static void main(String[] args) throws ClassNotFoundException {
		//1.主动引用
		//Son son = new Son();

		//反射也会产生主动引用
		//Class<?> aClass = Class.forName("com.zyk.annotation.Son");

		//不会产生类的引用的方法
		//System.out.println(Son.b);
		//Son[] array = new Son[5];//定义一个数组
		System.out.println(Son.M);

		Set s = new HashSet();
		s.add(null);



	}
}

class Father {
	static int b = 2;

	static {
		System.out.println("父类被加载");
	}
}

class Son extends Father {
	static {
		System.out.println("子类被加载");
		m = 300;
	}

	static int m = 100;
	static final int M = 1;
}

