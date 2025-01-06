package com.Hollis.Java基础;

import com.sun.javafx.collections.ImmutableObservableList;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @ClassName: Lambda
 * @Date: Created in 2023/11/14 14:28
 * @Version: 1.0
 * @Author: zhengyongkai
 * @Modified By:
 * @Description: lambda表达式的实现其实是依赖了一些底层的pi，在编译阶段，编译器会把lambda表达式进行解耦，转换成调用内部api的方式
 **/
public class Lambda {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("zyk");
		list.add("zyk_test");
		list.add("20231114");
		list.add("lambda");
		/*list.forEach(s -> {
			System.out.println(s);
		});*/

		List listzyk = list.stream().filter(string -> string.contains("zyk")).collect(Collectors.toList());
		listzyk.forEach(s -> {
			System.out.println(s);
		});

	}
}
