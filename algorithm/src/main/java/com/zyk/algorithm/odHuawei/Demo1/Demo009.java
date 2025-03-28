package com.zyk.algorithm.odHuawei.Demo1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * @ClassName: Demo009
 * @Date: Created in 2025/3/7 14:30
 * @Version: 1.0
 * @Author: zhengyongkai
 * @Modified By:
 * @Description: 整数对最小和
 **/
public class Demo009 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		List<Integer> list1 = new ArrayList<>();
		int s1 = scanner.nextInt();
		for (int i = 0; i < s1; i++) {
			list1.add(scanner.nextInt());
		}
		List<Integer> list2 = new ArrayList<>();
		int s2 = scanner.nextInt();
		for (int i = 0; i < s2; i++) {
			list2.add(scanner.nextInt());
		}
		int count = scanner.nextInt();
		List<Integer> listsum = new ArrayList<>();
		for (int l1 : list1) {
			for (int l2 : list2) {
				listsum.add(l1 + l2);
			}
		}
		Collections.sort(listsum);
		int sum = 0;
		for (int i = 0; i < count; i++) {
			sum += listsum.get(i);
		}
		System.out.println(sum);

	}
}
