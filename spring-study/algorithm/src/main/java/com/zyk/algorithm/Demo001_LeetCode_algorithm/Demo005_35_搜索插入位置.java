package com.zyk.algorithm.Demo001_LeetCode_algorithm;

import java.util.Scanner;

public class Demo005_35_搜索插入位置 {

	public static void main(String[] args) {
		int[] a = { 1, 3, 5, 6 };
		Scanner scanner = new Scanner(System.in);
		System.out.println(searchInsert(a, scanner.nextInt()));
	}

	public static int searchInsert(int[] nums, int target) {
		int l = 0, r = nums.length - 1;
		if (target < nums[0])
			return 0;
		if (target > nums[r])
			return nums.length;
		while (l < r) {
			int mid = l + (r - l) / 2;
			if (target > nums[mid]) {
				l = mid + 1;
			} else {
				r = mid;
			}
		}
		return l;
	}
}
