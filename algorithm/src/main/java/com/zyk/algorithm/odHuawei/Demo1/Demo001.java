package com.zyk.algorithm.odHuawei.Demo1;

import java.util.Scanner;

/**
 * @ClassName: Demo001
 * @Date: Created in 2025/3/6 13:26
 * @Version: 1.0
 * @Author: zhengyongkai
 * @Modified By:
 * @Description: 字符串序列判定/最后一个有效字符
 **/
public class Demo001 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s1 = scanner.nextLine();
		String l1 = scanner.nextLine();

		int indexs1 = 0, indexl1 = 0;

		while (indexs1 < s1.length() && indexl1 < l1.length()) {
			if (s1.charAt(indexs1) == l1.charAt(indexl1)) {
				indexs1++;
			}
			indexl1++;
		}
		if (indexs1 == s1.length()) {
			System.out.println(indexl1 - 1);
		} else {
			System.out.println(-1);
		}

	}
}
