package com.zyk.mapAndset;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @ClassName: treeMapTest
 * @Date: Created in 2023/8/8 9:15
 * @Version: 1.0
 * @Author: zhengyongkai
 * @Modified By:
 * @Description: TreeMap
 **/
public class treeMapTest {

	public static void main(String[] args) {
		TreeMap<String, String> tm1 = new TreeMap<>();//从小到大
		TreeMap<String, String> tm2 = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);//忽略大小写
		TreeMap<String, String> tm3 = new TreeMap<>(new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o2.compareTo(o1);//从大到小
			}
		});
		TreeMap<String, String> tm4 = new TreeMap<>(Collections.reverseOrder());//返回一个逆序比较器 从大到小
		TreeMap<String, String> tm = new TreeMap<>(Collections.reverseOrder(String.CASE_INSENSITIVE_ORDER));//逆序且忽略大小写
		tm.put("abc", "123");
		tm.put("T", "1234");
		tm.put("asd", "12345");
		tm.put("bfs", "123456");
		for (Map.Entry<String, String> kv : tm.entrySet()) {
			//System.out.println("key:"+kv.getKey()+",value:"+kv.getValue());
		}

		TreeMap<String, String> tm5 = new TreeMap<>(new Comparator<String>() {
			SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");

			@Override
			public int compare(String o1, String o2) {
				//format是把日期格式转化为字符串
				//parse是把字符串转化为日期格式
				try {
					//return df.parse(o1).compareTo(df.parse(o2));//升序
					return df.parse(o2).compareTo(df.parse(o1));//降序
				} catch (ParseException e) {
					e.printStackTrace();
					return 0;
				}
			}
		});
		tm5.put("2023-06-07", "20230607");
		tm5.put("2023-06-17", "20230617");
		tm5.put("2023-08-08", "20230808");
		for (Map.Entry<String, String> kv : tm5.entrySet()) {
			System.out.println("key:" + kv.getKey() + ",value:" + kv.getValue());
		}


	}
}
