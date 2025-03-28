package com.zyk.algorithm.odHuawei.Demo1;

import java.util.Scanner;

/**
 * @ClassName: Demo011
 * @Date: Created in 2025/3/19 9:36
 * @Version: 1.0
 * @Author: zhengyongkai
 * @Modified By:
 * @Description: 给你一个字符串S，字符串S首尾相连成一个环形，请你在环中找出‘字符出现了偶数次最长子字符串的长度
 **/
public class Demo011 {
	public static void main(String[] args) {
		String ins = new Scanner(System.in).nextLine();
		char[] chars = ins.toCharArray();
		int sum = 0;

		for (char c : chars) {
			if (c == 'o') {
				sum++;
			}
		}

		if (sum % 2 == 0) {
			System.out.println(chars.length);
		} else {
			System.out.println(chars.length - 1);
		}

	}
}
