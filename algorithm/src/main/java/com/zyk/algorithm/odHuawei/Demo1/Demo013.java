package com.zyk.algorithm.odHuawei.Demo1;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

/**
 * @ClassName: Demo013
 * @Date: Created in 2025/3/19 10:03
 * @Version: 1.0
 * @Author: zhengyongkai
 * @Modified By:
 * @Description: 寿司店周年庆，正在举办优惠活动回馈新老客户.
 * 寿司转盘上总共有n盘寿司，价格[]是第I盘寿司的价格，
 * 如果客户选择了第i盘寿司，寿司店免费赠送客户距离第i盘寿司最近的下一盘寿司j，前提是价格[i]<价格[i]，如果没有满足条件的j，
 * 则不赠送寿司.
 * 每个价格的寿司都可无限供应
 **/
public class Demo013 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] ins = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		int n = ins.length;
		int[] insResult = new int[n];
		int[] insAddCopy = Stream.of(ins, ins).flatMapToInt(Arrays::stream).toArray();

		for (int i = 0; i < n; i++) {
			insResult[i] = ins[i];
			for (int j = i + 1; j < i + n; j++) {
				if (ins[i] > insAddCopy[j]) {
					insResult[i] = ins[i] + insAddCopy[j];
					break;
				}
			}
		}
		StringBuffer sBuffer = new StringBuffer();
		for (int i : insResult) {
			sBuffer.append(i);
			sBuffer.append(" ");
		}
		System.out.println(sBuffer.toString().trim());
	}
}
