package com.zyk.algorithm.Demo001_LeetCode_algorithm;

import java.util.Scanner;

public class Demo018_231_2的幂 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(isPowerOfTwo(scanner.nextInt()));

	}

	public static boolean isPowerOfTwo(int n) {
		return n>0&&(n&(n-1))==0;
	}
}
