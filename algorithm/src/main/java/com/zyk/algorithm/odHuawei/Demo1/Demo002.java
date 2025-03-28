package com.zyk.algorithm.odHuawei.Demo1;

import java.util.Scanner;

/**
 * @ClassName: Demo002
 * @Date: Created in 2025/3/6 13:52
 * @Version: 1.0
 * @Author: zhengyongkai
 * @Modified By:
 * @Description: 山脉的个数/攀登者1
 **/
public class Demo002 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String sc = scanner.nextLine();
		String[] split = sc.split(",");
		int[] ints = new int[split.length];
		for (int i = 0; i < split.length; i++) {
			ints[i] = Integer.valueOf(split[i]);
		}
		System.out.println(counttest(ints));

	}

	public static int counttest(int[] sm) {
		int count = 0;
		for (int i = 0; i < sm.length; i++) {
			if (i == 0 && sm[i] > sm[i + 1]) {
				count++;
			}
			if (i == sm.length - 1 && sm[i] > sm[i - 1]) {
				count++;
			}
			if (i > 0 && i < sm.length - 1 && sm[i] > sm[i - 1] && sm[i] > sm[i + 1]) {
				count++;
			}

		}
		return count;
	}
}
