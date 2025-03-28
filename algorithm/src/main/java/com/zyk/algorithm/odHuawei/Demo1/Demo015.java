package com.zyk.algorithm.odHuawei.Demo1;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @ClassName: Demo015
 * @Date: Created in 2025/3/19 16:27
 * @Version: 1.0
 * @Author: zhengyongkai
 * @Modified By:
 * @Description: 孙悟空爱吃蟠桃，有一天趁着蟠桃园守卫不在来偷吃.已知蟠桃园有N棵桃树，每颗树上都有桃子，守卫将在H小时后回来.
 * 孙悟空可以决定他吃蟠桃的速度K(个/小时)，每个小时选一颗桃树，并从树上吃掉K个，如果树上的桃子少于K个，则全部吃掉，并且这)
 * 一小时剩余的时间里不再吃桃.
 * 孙悟空喜欢慢慢吃，但又想在守卫回来前吃完桃子.
 * 请返回孙悟空可以在H小时内吃掉所有桃子的最小速度K(K为整数)。如果以任何速度都吃不完所有桃子，则返回0。
 **/
public class Demo015 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] ins = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		int h = Integer.parseInt(scanner.nextLine());
		int n = ins.length;
		if (n == 0 || h <= 0 || n >= 10000 || h >= 10000 || n > h) {
			System.out.println(0);
			return;
		}
		int left = 0, right = Integer.MAX_VALUE;
		while (left < right) {
			int mid = left + (right - left) / 2;
			if (serchb(ins, h, mid)) {
				right = mid;
			} else {
				left = mid + 1;
			}
		}
		System.out.println(left);

	}

	private static boolean serchb(int[] ins, int h, int mid) {
		int sum = 0;
		for (int in : ins) {
			sum += Math.ceil((in * 1.0) / mid);
		}
		return sum <= h;
	}
}
