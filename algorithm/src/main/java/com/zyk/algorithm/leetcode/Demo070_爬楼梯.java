package com.zyk.algorithm.leetcode;

/**
 * @ClassName: Demo070_爬楼梯
 * @Date: Created in 2023/3/15 17:47
 * @Version: 1.0
 * @Author: zhengyongkai
 * @Modified By:
 * @Description: https://leetcode.cn/problems/climbing-stairs/description/
 **/
public class Demo070_爬楼梯 {
	public static void main(String[] args) {
		System.out.println(climbStairs(10));
	}
	//斐波那锲数列  fn = f(n-1) + f(n-2)
	public static int climbStairs(int n) {
		if (n < 3)
			return (n == 1) ? 1 : 2;
		int a = 1, b = 2, sum = 3;
		for (int i = 3; i <= n; i++) {
			sum = a + b;
			a = b;
			b = sum;
		}
		return sum;
	}

}
