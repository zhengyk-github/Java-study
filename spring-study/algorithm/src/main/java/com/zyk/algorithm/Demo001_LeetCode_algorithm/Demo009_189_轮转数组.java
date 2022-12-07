package com.zyk.algorithm.Demo001_LeetCode_algorithm;

import java.util.Scanner;

public class Demo009_189_轮转数组 {

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5, 6, 7 };
		Scanner scanner = new Scanner(System.in);
		rotate(a, scanner.nextInt());
	}

	public static void rotate(int[] nums, int k) {
		int n = nums.length;
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.println(nums[i]);
			a[(i + k) % n] = nums[i];
		}
		System.arraycopy(a, 0, nums, 0, n);// nums = a;
		/*System.arrayCopy的源代码声明 :
		public static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length)
		其中，
		（1）src为原数组
		（2）srcPos为原数组的起始位置
		（3）dest为目标数组
		（4）destPos为目标数组的开始起始位置
		（5）length为需要copy的数组长度
		例：
		System.arraycopy(nums, 0, original, 0, nums.length); ==>把num数组中从0开始的数copy到original数组中，从下标0开始，复制的数组长度为nums.length。
		 */
		for (int i = 0; i < n; i++) {
			System.out.println(nums[i]);
		}
	}
}
