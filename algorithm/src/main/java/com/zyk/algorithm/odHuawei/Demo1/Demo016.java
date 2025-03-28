package com.zyk.algorithm.odHuawei.Demo1;

import com.sun.org.apache.regexp.internal.RE;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @ClassName: Demo016
 * @Date: Created in 2025/3/20 13:34
 * @Version: 1.0
 * @Author: zhengyongkai
 * @Modified By:
 * @Description: 2020年年题：
 * 英雄联盟是一款十分火热的对战类游戏.每一场对战有10位玩家参与，分为两组，每组5人。每位玩家都有一个战斗力，代表着这位玩家的厉
 * 害程度.为了对战尽可能精彩，我们需要把玩家们分为实力尽量相等的两组.一组的实力可以表示为这一组5位玩家的战斗力和。现在，给你
 * 10位玩家的战斗力，请你把他们分为实力尽量相等的两组。请你输出这两组的实力差.
 * 2023年年题：
 * 部门准备举办一场王者荣耀表演赛，有10名游戏爱好者参与，分5为两队，每队5人。每位参与者都有一个评分，代表着他的游戏水平.为了
 * 表演赛尽可能精彩，我们需要把10名参赛者分为实力尽量相近的两队。一队的实力可以表示为这一队5名队员的评分总和。
 * 现在给你10名参与者的游戏水平评分，请你根据上述要求分队最后输出这两组的实力差绝对值。
 * 例：10名参赛者的评分分别为51834671092，分组为(135810)(24679)，两组实力差最小，差值为1。有多种分法，但实力差的绝对值
 * 最小为1
 **/
public class Demo016 {
	static int res = Integer.MAX_VALUE;
	static int sum = 0;

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int[] ins = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		for (int s : ins) {
			sum += s;
		}
		dfs(ins, 0, 0, 0);
		System.out.println(res);
		scanner.close();
	}

	private static void dfs(int[] nums, int idx, int count, int currentsum) {

		if (count == 5) {
			int othersum = sum - currentsum;
			res = Math.min(res, Math.abs(othersum - currentsum));
			return;
		}
		if (idx == 10) {
			return;
		}
		dfs(nums, idx + 1, count + 1, currentsum + nums[idx]);
		dfs(nums, idx + 1, count, currentsum);
	}
}
