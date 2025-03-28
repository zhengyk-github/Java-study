package com.zyk.algorithm.odHuawei.Demo1;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

/**
 * @ClassName: Demo014
 * @Date: Created in 2025/3/19 14:54
 * @Version: 1.0
 * @Author: zhengyongkai
 * @Modified By:
 * @Description: 在学校中，N个小朋友站成一队，第I个小朋友的身高为Height[ī]，
 * 第i个小朋友可以看到的第一个比自己身高更高的小朋友，那么是的好朋友(要求j>i)。
 * 请重新生成一个列表，对应位置的输出是每个小朋友的好朋友位置，如果没有看到好朋友，请在该位置用0代替。
 * 小朋友人数范围是[0,40000]。
 **/
public class Demo014 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int n = Integer.parseInt(scanner.nextLine());
		int[] ints = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		int[] re = new int[n];
		Stack<Integer> stack = new Stack<>();
		stack.push(0);
		for (int i = 1; i < n; i++) {
			while (!stack.isEmpty() && (ints[i] > ints[stack.peek()])) {
				re[stack.pop()] = i;
			}
			stack.push(i);
		}
		StringBuffer sBuffer = new StringBuffer();

		for (int i = 0; i < n; i++) {
			sBuffer.append(re[i]).append(" ");
		}
		System.out.println(sBuffer.toString().trim());
	}
}
