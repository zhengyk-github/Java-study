package com.zyk.algorithm.Demo001_LeetCode_algorithm;

public class Demo020_136_只出现一次的数字 {

	public static void main(String[] args) {
		int[] a = { 4, 1, 2, 1, 2 };
		System.out.println(singleNumber(a));
	}

	public static int singleNumber(int[] nums) {
		int t = 0;
		for (int num : nums) {
			t ^= num;
		}
		return t;
	}
}
