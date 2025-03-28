package com.zyk.algorithm.odHuawei.Demo1;

import java.util.*;

/**
 * @ClassName: Demo008
 * @Date: Created in 2025/3/7 11:07
 * @Version: 1.0
 * @Author: zhengyongkai
 * @Modified By:https://zhuanlan.zhihu.com/p/8909827713
 * @Description: 最长的指定瑕疵度的元音子串
 **/
public class Demo008 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int xc = scanner.nextInt();
		scanner.nextLine();
		String sc = scanner.nextLine();
		List<Integer> indexs = new ArrayList<>();
		Set<Character> set = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));
		for (int i = 0; i < sc.length(); i++) {
			if (set.contains(sc.charAt(i))) {
				indexs.add(i);//标记元音字母的位置
			}
		}
		int l = 0, r = 0, max = 0;
		int n = indexs.size();
		while (r < n) {
			int diff = indexs.get(r) - indexs.get(l) - (r - l);
			if (diff > xc) {
				l++;
			} else {
				if (diff == xc) {
					max = Math.max(max, indexs.get(r) - indexs.get(l) + 1);
				}
				r++;
			}
		}
		System.out.println(max);

	}
}
