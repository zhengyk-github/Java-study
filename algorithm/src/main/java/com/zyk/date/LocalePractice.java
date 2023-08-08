package com.zyk.date;

import java.util.Locale;

/**
 * @ClassName: LocalePractice
 * @Date: Created in 2023/7/5 13:47
 * @Version: 1.0
 * @Author: zhengyongkai
 * @Modified By:
 * @Description: TODO
 **/
public class LocalePractice {

	/*
	Locale表示国家〈或地区）和语言，它有两个主要参数:一个是国家（或地区)﹔另一个是语言，每个参数都有一个代码，不过国家(或地区）并不是必需的。
	比如，中国内地的代码是CN，中国台湾地区的代码是TW，美国的代码是US，中文语言的代码是zh，英文语言的代码是en。

	Locale类中定义了一些静态变量，表示常见的Locale，比如:
	·Locale.US:表示美国英语。
	·Locale.ENGLISH:表示所有英语。
	·Locale.TAIWAN:表示中国台湾地区所用的中文。
	·Locale.CHINESE:表示所有中文。
	·Locale.SIMPLIFIED_CHINESE:表示中国内地所用的中文。
	*/


	public static void main(String[] args) {
		Locale locale = Locale.getDefault();
		System.out.println(locale.toString());
	}
}
