package com.zyk.algorithm.leetcode;

import java.util.Arrays;

/**
 * @ClassName: Demo628_三个数的最大乘积
 * @Date: Created in 2023/3/13 16:55
 * @Version: 1.0
 * @Author: zhengyongkai
 * @Modified By:
 * @Description: https://leetcode.cn/problems/maximum-product-of-three-numbers/description/
 **/
public class Demo628_三个数的最大乘积 {

	public static void main(String[] args) {
		int[] a = new int[]{1, 2, 3, 4, 5, 6};
		System.out.println(maximumProduct(a));
		System.out.println(maximumProduct1(a));
	}


	public static int maximumProduct(int[] nums) {
		Arrays.sort(nums);
		int n = nums.length;
		return Math.max(nums[0] * nums[1] * nums[n - 1], nums[n - 1] * nums[n - 2] * nums[n - 3]);
	}
	//不排序 通过比较得出三个最大值和两个最小值
	public static int maximumProduct1(int[] nums) {
		int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;
		int max1 = Integer.MIN_VALUE, max2 = Integer.MAX_VALUE, max3 = Integer.MAX_VALUE;
		for (int num : nums) {
			if (num < min1) {
				min2 = min1;
				min1 = num;
			} else if (num < min2) {
				min2 = num;
			}
			if (num > max1) {
				max3 = max2;
				max2 = max1;
				max1 = num;
			} else if (num > max2) {
				max3 = max2;
				max2 = num;
			} else if (num > max3) {
				max3 = num;
			}
		}
		return Math.max(min1 * min2 * max1, max1 * max2 * max3);
	}
}
