package com.zyk.algorithm.leetcode;

/**
 * @ClassName: Demo069_x的平方根
 * @Date: Created in 2023/3/13 13:40
 * @Version: 1.0
 * @Author: zhengyongkai
 * @Modified By:
 * @Description: https://leetcode.cn/problems/sqrtx/
 **/
public class Demo069_x的平方根 {
	/*
	给你一个非负整数 x ，计算并返回 x 的 算术平方根 。
	由于返回类型是整数，结果只保留 整数部分 ，小数部分将被 舍去 。
	注意：不允许使用任何内置指数函数和算符，例如 pow(x, 0.5) 或者 x ** 0.5 。
	*/

	public static void main(String[] args) {

		System.out.println(mySqrt(2147302921));//46339*46339

		System.out.println(newtwo(2147302921));
	}

	public static int mySqrt(int x) {
		if (x == 0) {
			return 0;
		}
		if (x == 1) {
			return 1;
		}
		int index = -1, l = 0, r = x;
		while (l <= r) {
			int mid = l + (r - l) / 2;
			if (mid <= x / mid) {
				l = mid + 1;
				index = mid;
			} else {
				r = mid - 1;
			}
		}
		return index;
	}

	//牛顿迭代
	public static int newtwo(int x) {
		return (int) sqrt(x, x);
	}

	public static double sqrt(double i, int x) {
		double res = (x / i + i) / 2;
		if (res == i) {
			return res;
		} else {
			return sqrt(res, x);
		}
	}


}
