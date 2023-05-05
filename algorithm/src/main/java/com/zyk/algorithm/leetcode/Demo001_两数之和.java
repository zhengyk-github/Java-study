package com.zyk.algorithm.leetcode;

import java.util.Arrays;
import java.util.HashMap;

/**
 * @ClassName: Demo001_两数之和
 * @Date: Created in 2023/3/13 14:46
 * @Version: 1.0
 * @Author: zhengyongkai
 * @Modified By:
 * @Description: https://leetcode.cn/problems/two-sum/
 **/
public class Demo001_两数之和 {


	public static void main(String[] args) {
		/*int[] nums = {2, 7, 11, 15};
		int target = 9;*/
		int[] nums = {3, 3};
		int target = 6;
		System.out.println(Arrays.toString(twoSum(nums, target)));
		System.out.println(Arrays.toString(twoSum1(nums, target)));
	}

	public static int[] twoSum(int[] nums, int target) {
		for (int i = 0; i < nums.length - 1; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] + nums[j] == target) {
					return new int[]{i, j};
				}
			}
		}
		return new int[0];
	}
	//放到map里面 使循环一次就可找出
	public static int[] twoSum1(int[] nums, int target) {
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			if (map.containsKey(target - nums[i])) {
				return new int[]{map.get(target - nums[i]), i};
			}
			map.put(nums[i], i);
		}
		return new int[0];
	}

	//有序数列才能使用并且不能重复  例：{3,3}就测试不通过
	public static int[] twoSumSearch(int[] nums, int target) {
		for (int i = 0; i < nums.length; i++) {
			int l = i, r = nums.length - 1;
			while (l <= r) {
				int mid = (r - l) / 2 + l;
				if (nums[i] + nums[mid] == target) {
					return new int[]{i, mid};
				} else if (nums[mid] > target - nums[i]) {
					r = mid - 1;
				} else {
					l = mid + 1;
				}
			}
		}
		return new int[0];
	}

/*给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 target  的那 两个 整数，并返回它们的数组下标。
你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。
你可以按任意顺序返回答案
示例 1：
输入：nums = [2,7,11,15], target = 9
输出：[0,1]
解释：因为 nums[0] + nums[1] == 9 ，返回 [0, 1] 。

示例 2：
输入：nums = [3,2,4], target = 6
输出：[1,2]

示例 3：
输入：nums = [3,3], target = 6
输出：[0,1]*/
}
