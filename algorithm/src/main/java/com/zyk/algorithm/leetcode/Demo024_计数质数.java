package com.zyk.algorithm.leetcode;

/**
 * @ClassName: Demo024_计数质数
 * @Date: Created in 2023/3/14 12:32
 * @Version: 1.0
 * @Author: zhengyongkai
 * @Modified By:
 * @Description: https://leetcode.cn/problems/count-primes/description/
 **/
public class Demo024_计数质数 {

	public static void main(String[] args) {
		System.out.println(countPrimes(499979));
		System.out.println(countPrimes1(11));
	}

	//埃氏筛选
	public static int countPrimes1(int n) {
		boolean[] isPrime = new boolean[n];
		int count = 0;
		for (int i = 2; i < n; i++) {
			if (!isPrime[i]) {
				count++;
				for (int j = i * 2; j < n; j+=i) {
					isPrime[j] = true;
				}
			}
		}
		return count;
	}


	//暴力算法 leetcode上面超时
	public static int countPrimes(int n) {
		int count = 0;
		for (int i = 2; i < n; i++) {
			count += isprime(i) ? 1 : 0;
		}
		return count;
	}

	private static boolean isprime(int x) {
		for (int j = 2; j * j <= x; j++) {  //循环结束条件 j < x 时遍历全部,优化为 j*j < x
			if (x % j == 0) {
				return false;
			}
		}
		return true;
	}

}
