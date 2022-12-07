package com.zyk.algorithm.Demo001_LeetCode_algorithm;

import java.util.Scanner;

public class Demo004_278_第一个错误的版本 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(firstBadVersion(scanner.nextInt()));
	}

	public static int firstBadVersion(int n) {
		int l = 1, r = n;
		while (l < r) {
			int mid = l + (r - l) / 2;
			if (isBadVersion(mid)) {
				r = mid;
			} else {
				l = mid + 1;
			}
		}
		return l;
	}
	public static boolean isBadVersion(int mid) {
		//此处的结果在leetcode里面有给定
		return true;
	}
}
