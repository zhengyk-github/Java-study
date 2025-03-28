package com.zyk.algorithm.odHuawei.Demo1;

import java.util.*;

/**
 * @ClassName: Demo007
 * @Date: Created in 2025/3/7 9:35
 * @Version: 1.0
 * @Author: zhengyongkai
 * @Modified By:
 * @Description: 查找众数及中位数
 **/
public class Demo007 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String sc = scanner.nextLine();

		List<Integer> list = new ArrayList<>();
		for (String scc : sc.split(" ")) {
			list.add(Integer.valueOf(scc));
		}
		List list1 = getMode(list);
		System.out.println(list1.toString());

		double median = getMedian(list);
		System.out.println(median);

	}

	public static List getMode(List<Integer> list) {
		List<Integer> list1 = new ArrayList<>();

		HashMap<Integer, Integer> maps = new HashMap<>();
		int max = 0;
		for (Integer li : list) {
			int count = maps.getOrDefault(li, 0) + 1;
			maps.put(li, count);
			max = Math.max(max, count);
		}

		for (Map.Entry<Integer, Integer> map : maps.entrySet()) {
			Integer value = map.getValue();
			if (max == value) {
				list1.add(map.getKey());
			}
		}

		return list1;
	}

	public static double getMedian(List<Integer> list) {
		Arrays.sort(list.toArray());
		int length = list.size();
		if (length % 2 == 0) {
			return (list.get(length / 2) + list.get(length / 2 - 1)) / 2.0;

		} else {
			return list.get(length/2);
		}


	}


}
