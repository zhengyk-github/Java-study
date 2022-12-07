package com.zyk.algorithm.Demo001_LeetCode_algorithm;

import java.util.Arrays;

public class Demo008_977_有序数组的平方 {

	public static void main(String[] args) {
		int[] nums = { -4, -1, 0, 3, 10 };
		int[] a = new int[nums.length];
		a = sortedSquares(nums);
		for (int i = 0; i < a.length; i++) {
			System.out.println("i:" + i + ",a[" + i + "]:" + a[i]);
		}

	}

	public static int[] sortedSquares(int[] nums) {
		int[] a = new int[nums.length];
		for (int i = 0; i < nums.length; i++) {
			a[i] = nums[i] * nums[i];
		}
		Arrays.sort(a);
		return a;
	}
}
