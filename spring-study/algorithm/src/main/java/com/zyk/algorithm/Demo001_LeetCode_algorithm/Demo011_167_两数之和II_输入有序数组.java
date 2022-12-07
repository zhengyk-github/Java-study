package com.zyk.algorithm.Demo001_LeetCode_algorithm;

import java.util.Scanner;

public class Demo011_167_两数之和II_输入有序数组 {

	public static void main(String[] args) {
		int[] nums = { 2, 7, 11, 15 };
		Scanner scanner = new Scanner(System.in);
		int[] a = twoSum(nums, scanner.nextInt());
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

	public static int[] twoSum(int[] numbers, int target) {
		for (int i = 0; i < numbers.length; i++) {
			int r = numbers.length - 1, l = i + 1;
			while (l <= r) {
				int mid = (r - l) / 2 + l;
				if (numbers[mid] == target - numbers[i]) {
					return new int[] { i + 1, mid + 1 };
				} else if (numbers[mid] > target - numbers[i]) {
					r = mid - 1;
				} else {
					l = mid + 1;
				}
			}
		}
		return new int[] { -1, -1 };
	}
}
