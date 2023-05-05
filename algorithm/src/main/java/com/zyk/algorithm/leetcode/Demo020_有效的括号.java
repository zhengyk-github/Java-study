package com.zyk.algorithm.leetcode;

/**
 * @ClassName: Demo020_有效的括号
 * @Date: Created in 2023/3/14 17:13
 * @Version: 1.0
 * @Author: zhengyongkai
 * @Modified By:
 * @Description: https://leetcode.cn/problems/valid-parentheses/
 **/
public class Demo020_有效的括号 {
	public static void main(String[] args) {
		System.out.println(isValid("(){}[]"));
	}

	public static boolean isValid(String s) {
		if (s.length() % 2 == 1) {
			return false;
		}
		while (s.contains("()") || s.contains("[]") || s.contains("{}")) {
			if (s.contains("()")) {
				s = s.replace("()", "");
			}
			if (s.contains("[]")) {
				s = s.replace("[]", "");
			}
			if (s.contains("{}")) {
				s = s.replace("{}", "");
			}
		}
		return s.length() == 0;
	}
}
