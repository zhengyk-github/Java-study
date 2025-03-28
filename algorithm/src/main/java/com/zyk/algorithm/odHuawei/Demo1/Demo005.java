package com.zyk.algorithm.odHuawei.Demo1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

/**
 * @ClassName: Demo005
 * @Date: Created in 2025/3/6 13:57
 * @Version: 1.0
 * @Author: zhengyongkai
 * @Modified By:
 * @Description: 全量和已占用字符集、字符串统计
 **/
public class Demo005 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String in = scanner.nextLine();
		String[] splitin = in.split("@");
		if (splitin.length == 1) {
			System.out.println(splitin[0]);
		} else {
			String s1 = splitin[0];//全量字符集
			String s2 = splitin[1];//已占用字符集
			List keys = new ArrayList<>();
			HashMap<String, Integer> map1 = new HashMap<>();
			HashMap<String, Integer> map2 = new HashMap<>();
			StringBuffer sbuffer = new StringBuffer();
			String[] ss1 = s1.split(",");
			for (int i = 0; i < ss1.length; i++) {
				String[] sss1 = ss1[i].split(":");
				String key = sss1[0];
				String value = sss1[1];
				map1.put(key, Integer.valueOf(value));
				keys.add(key);
			}

			String[] ss2 = s2.split(",");
			for (int i = 0; i < ss2.length; i++) {
				String[] sss2 = ss2[i].split(":");
				String key = sss2[0];
				String value = sss2[1];
				map2.put(key, Integer.valueOf(value));
			}

			for (int i = 0; i < keys.size(); i++) {
				String ks = (String) keys.get(i);
				Integer v1 = map1.get(ks);
				Integer v2 = map2.get(ks) == null ? 0 : map2.get(ks);
				if (i == keys.size() - 1) {
					sbuffer.append(ks+":"+(v1-v2));
				} else {
					sbuffer.append(ks+":"+(v1-v2)+",");
				}
			}
			System.out.println(sbuffer.toString());

		}

	}
}
