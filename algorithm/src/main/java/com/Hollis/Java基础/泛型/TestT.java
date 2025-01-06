package com.Hollis.Java基础.泛型;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: TestT
 * @Date: Created in 2023/11/14 15:23
 * @Version: 1.0
 * @Author: zhengyongkai
 * @Modified By:
 * @Description: 泛型方法
 **/
public class TestT {
	public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
		TestT t1 = new TestT();
		t1.f(666);
		t1.f("zzz");

		//在泛型为Integer的ArrayList中存放一个String类型的对象
		List<Integer> list = new ArrayList<Integer>();
		Method method = list.getClass().getMethod("add", Object.class);
		method.invoke(list,"test");
		System.out.println(list.get(0));
		list.add(999);
		System.out.println(list.get(1));
	}

	public <T> void f(T t) {
		//System.out.println(t.getClass());
		System.out.println(t.getClass().getName());

	}
}
