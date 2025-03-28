package com.zyk.algorithm.odHuawei.Demo1;

import java.util.Scanner;

/**
 * @ClassName: Demo017
 * @Date: Created in 2025/3/20 15:03
 * @Version: 1.0
 * @Author: zhengyongkai
 * @Modified By:
 * @Description: 给定一个字符串，只包含字母和数字，按要求找出字符串中的最长（连续）子串的长度，字符串本身是其最长的子串，子串要求：
 * 1、 只包含1个字母(a~z, A~Z)，其余必须是数字；
 * 2、 字母可以在子串中的任意位置；如果找不到满足要求的子串，如全是字母或全是数字，则返回-1。
 **/
public class Demo017 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.nextLine();
		int left = 0, right = 0, re = -1, count = 0;
		Boolean flag = false;
		for (int i = 0; i < s.length(); i++) {
			if (Character.isDigit(s.charAt(i))) {
				flag = true;
			}
		}
		if (!flag) {
			System.out.println(-1);
			return;
		}
		while (right < s.length()) {
			if (Character.isLetter(s.charAt(right))) {
				count++;
			}

			while (count > 1) {
				if (Character.isLetter(s.charAt(left))) {
					count--;
				}
				left++;
			}
			if (count == 1) {
				re = Math.max(re, right - left + 1);
			}
			right++;
		}
		System.out.println(re);

	}
}
