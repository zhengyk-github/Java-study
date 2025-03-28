package com.zyk.algorithm.odHuawei.Demo1;

import java.util.*;

/**
 * @ClassName: Demo004
 * @Date: Created in 2025/3/6 13:50
 * @Version: 1.0
 * @Author: zhengyongkai
 * @Modified By:
 * @Description: 用连续自然数之和来表达整数
 **/
public class Demo004 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int ta = scanner.nextInt();
		System.out.println(ta + "=" + ta);

		List<String> list = new ArrayList<>();
		for (int i = 1; i < ta; i++) {
			int sum = 0;
			StringBuffer sbuffer = new StringBuffer();
			for (int j = i; j < ta; j++) {
				sum += j;
				sbuffer.append(j).append("+");
				if (sum == ta) {
					list.add(ta + "=" + sbuffer.substring(0, sbuffer.length() - 1));
					break;
				}
			}
		}
		Collections.sort(list, Comparator.comparingInt(String::length));

		for (String ls : list) {
			System.out.println(ls);
		}

		System.out.println("Result:" + (list.size() + 1));

	}
}
