package com.zyk.algorithm.leetcode;

/**
 * @ClassName: Demo009_回文数
 * @Date: Created in 2023/3/13 16:35
 * @Version: 1.0
 * @Author: zhengyongkai
 * @Modified By:
 * @Description: https://leetcode.cn/problems/palindrome-number/description/
 **/
public class Demo009_回文数 {
	public static void main(String[] args) {
		System.out.println(isPalindrome(121));
		System.out.println(isPalindrome1(121));
	}

	//暴力解法 直接把数字全部翻转之后比较和原数字是否相等
	public static boolean isPalindrome(int x) {
		if (x < 0) {
			return false;
		}
		if (x == 0) {
			return true;
		}
		int a = x, b = 0;
		while (a > 0) {
			b = b * 10 + a % 10;
			a = a / 10;
		}
		if (x == b) {
			return true;
		}
		return false;
	}
	//只需走一半即可判断出来是不是回文数
	public static boolean isPalindrome1(int x) {
		if (x < 0 || (x % 10 == 0 && x != 0)) return false;
		if (x == 0) return true;
		int a = x, b = 0;
		while (a > b) {
			b = b * 10 + a % 10;
			a = a / 10;
		}
		return a == b || a == b / 10;  //a要么等于b,要么等于b/10
	}

}


/*
给你一个整数 x ，如果 x 是一个回文整数，返回 true ；否则，返回 false 。
回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
例如，121 是回文，而 123 不是。

示例 1：
输入：x = 121
输出：true

示例 2：
输入：x = -121
输出：false
解释：从左向右读, 为 -121 。 从右向左读, 为 121- 。因此它不是一个回文数。

示例 3：
输入：x = 10
输出：false
解释：从右向左读, 为 01 。因此它不是一个回文数。

提示：
-231 <= x <= 231 - 1
*/