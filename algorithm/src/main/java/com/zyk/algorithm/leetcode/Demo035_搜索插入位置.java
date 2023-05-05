package com.zyk.algorithm.leetcode;

/**
 * @ClassName: Demo035_搜索插入位置
 * @Date: Created in 2023/3/15 11:14
 * @Version: 1.0
 * @Author: zhengyongkai
 * @Modified By:
 * @Description: https://leetcode.cn/problems/search-insert-position/
 **/
public class Demo035_搜索插入位置 {
	public static void main(String[] args) {
		int[] a = new int[]{1, 3, 5, 6};
		int f = 8;
		System.out.println(searchInsert(a, f));

	}

	//优化
	public static int searchInsert1(int[] nums, int target) {
		if (target < nums[0]) {
			return 0;
		}
		int l = 0, r = nums.length - 1;
		if (target > nums[nums.length-1]) {
			return nums.length;
		}
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

	//暴力解法
	public static int searchInsert(int[] nums, int target) {
		int flag = 0;
		if (target < nums[0]) {
			return 0;
		}
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == target) {
				flag = i;
				break;
			} else if (nums[i] < target) {
				if (i == nums.length - 1) {
					flag = nums.length;
					break;
				} else if (i < nums.length - 1 && nums[i + 1] > target) {
					flag = i + 1;
					break;
				}
			}
		}
		return flag;
	}
}
