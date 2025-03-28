package com.zyk.algorithm.odHuawei.Demo1;

import java.util.Scanner;

/**
 * @ClassName: Demo006
 * @Date: Created in 2025/3/7 9:14
 * @Version: 1.0
 * @Author: zhengyongkai
 * @Modified By:
 * @Description: 密码输入检测
 **/
public class Demo006 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		Boolean isdigit = false;
		Boolean islower = false;
		Boolean isupper = false;
		Boolean isspec = false;

		StringBuffer sbuffer = new StringBuffer();
		for (char in : input.toCharArray()) {
			if (in == '<') {
				sbuffer.deleteCharAt(sbuffer.length() - 1);
			} else {
				sbuffer.append(in);
			}
		}

		for (int i = 0; i < sbuffer.length(); i++) {
			char c = sbuffer.charAt(i);

			if (Character.isDigit(c)) {
				//检查是否是数字
				isdigit = true;
			} else if (Character.isLowerCase(c)) {
				//检查是否是小写字母
				islower = true;
			} else if (Character.isUpperCase(c)) {
				//检查是否是大写字符
				isupper = true;
			} else {
				isspec = true;
			}
		}
		Boolean re = false;
		if (sbuffer.length() >= 8 && isdigit && islower && isupper && isspec) {
			re = true;
		}
		System.out.println(sbuffer + "," + re);
	}
}
