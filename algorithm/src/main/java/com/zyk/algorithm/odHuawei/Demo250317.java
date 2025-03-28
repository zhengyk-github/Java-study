package com.zyk.algorithm.odHuawei;

import com.sun.corba.se.impl.resolver.FileResolverImpl;

import java.util.Scanner;

/**
 * @ClassName: Demo250317
 * @Date: Created in 2025/3/17 13:13
 * @Version: 1.0
 * @Author: zhengyongkai
 * @Modified By:
 * @Description: 给定一个字符串，只包含字母和数字，按要求找出字符串中的最长（连续）子串的长度，字符串本身是其最长的子串，子串要求：
 * 1、 只包含1个字母(a~z, A~Z)，其余必须是数字；
 * 2、 字母可以在子串中的任意位置；如果找不到满足要求的子串，如全是字母或全是数字，则返回-1。
 **/
public class Demo250317 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String in = scanner.nextLine();
		int n = in.length();
		int left = 0, right = 0, max = -1, letterCount = 0;
		Boolean flag = false;
		for (int i = 0; i < in.length(); i++) {
			if (Character.isDigit(in.charAt(i))) {
				flag = true;
			}
		}
		if (!flag) {
			System.out.println(-1);
			return;
		}
		while (right < n) {
			char c = in.charAt(right);
			if (Character.isLetter(c)) {
				letterCount++;
			}

			while (letterCount > 1) {
				if (Character.isLetter(in.charAt(left))) {
					letterCount--;
				}
				left++;
			}

			if (letterCount == 1) {
				max = Math.max(max, right - left + 1);
			}
			right++;
		}

		System.out.println(max);
	}

}
