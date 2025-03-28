package com.zyk.algorithm.odHuawei.Demo1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 * @ClassName: Demo010
 * @Date: Created in 2025/3/7 15:23
 * @Version: 1.0
 * @Author: zhengyongkai
 * @Modified By:
 * @Description: 找出作弊的人
 **/
public class Demo010 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		List<int[]> list = new ArrayList<>();
		int count = scanner.nextInt();
		for (int i = 0; i < count; i++) {
			int s1 = scanner.nextInt();
			int s2 = scanner.nextInt();
			list.add(new int[]{s1, s2});
		}
		list.sort(Comparator.comparingInt(a -> a[1]));

		int mindiff = Integer.MAX_VALUE;
		List<int[]> result = new ArrayList<>();
		for (int i = 1; i < count; i++) {
			int diff = list.get(i)[1] - list.get(i - 1)[1];
			if (diff < mindiff) {
				result.clear();
				mindiff = diff;
				result.add(new int[]{list.get(i - 1)[0], list.get(i)[0]});
			} else if (diff == mindiff) {
				result.add(new int[]{list.get(i - 1)[0], list.get(i)[0]});
			}
		}
		result.sort(Comparator.comparingInt(a -> a[0]));

		for (int[] re : result) {
			System.out.println(re[0] + " " + re[1]);
		}
	}
}
