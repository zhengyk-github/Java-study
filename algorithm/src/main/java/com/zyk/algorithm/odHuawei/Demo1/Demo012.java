package com.zyk.algorithm.odHuawei.Demo1;

import java.util.Scanner;

/**
 * @ClassName: Demo012
 * @Date: Created in 2025/3/19 9:46
 * @Version: 1.0
 * @Author: zhengyongkai
 * @Modified By:
 * @Description: 在一个大型体育场内举办了一场大型活动，由于疫情防控的需要，要求每位观众的必须间隔至少一个空位才允许落座.
 * 现在给出一排观众座位分布图，座位中存在已落座的观众，请计算出，在不移动现有观众座位的情况下，最多还能坐下多少名观众.
 * 输入描述
 * 一个数组，用来标识某一排座位中，每个座位是否已经坐人.0表示该座位没有坐人，1表示该座位已经坐人
 **/
public class Demo012 {
	public static void main(String[] args) {
		char[] cs = new Scanner(System.in).nextLine().toCharArray();
		int sum = 0;
		for (int i = 0; i < cs.length; i++) {
			if (cs[i] == '0' && (i == 0 || cs[i - 1] == '0') && (i == cs.length - 1 || cs[i + 1] == '0')) {
				sum++;
				cs[i] = '1';
				i++;
			}
		}
		System.out.println(sum);
	}
}
