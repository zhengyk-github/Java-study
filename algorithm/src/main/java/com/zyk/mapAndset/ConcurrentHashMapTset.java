package com.zyk.mapAndset;

import java.util.concurrent.ConcurrentHashMap;

/**
 * @ClassName: ConcurrentHashMapTset
 * @Date: Created in 2023/7/27 15:51
 * @Version: 1.0
 * @Author: zhengyongkai
 * @Modified By:
 * @Description: TODO
 **/
public class ConcurrentHashMapTset {
	public static void main(String[] args) {
		ConcurrentHashMap<Integer, String> ch = new ConcurrentHashMap<>();
		ch.put(100,"hello");
		ch.put(101,"world");
		ch.put(102,"hi");

		//ch.remove(101);//删除掉一个元素
		System.out.println(ch.toString());
		//ch.putIfAbsent(102,"hei");//如果102不存在 就添加 如果存在就不变
		ch.replace(102,"hi","hei");
		System.out.println(ch.toString());

	}
}
