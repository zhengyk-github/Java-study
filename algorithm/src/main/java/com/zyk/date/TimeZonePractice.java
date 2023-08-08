package com.zyk.date;

import java.util.Date;
import java.util.TimeZone;

/**
 * @ClassName: TimeZone
 * @Date: Created in 2023/7/4 10:21
 * @Version: 1.0
 * @Author: zhengyongkai
 * @Modified By:
 * @Description: TODO
 **/
public class TimeZonePractice {
	public static void main(String[] args) {
		TimeZone tz = TimeZone.getDefault();
		System.out.println("tz.getID():" + tz.getID());//Asia/Shanghai
		System.out.println("uer.timezone:" + System.getProperty("user.timezone"));//Asia/Shanghai

		System.out.println("TimeZone.getTimeZone(\"US/Eastern\"):" + TimeZone.getTimeZone("US/Eastern"));
		System.out.println("TimeZone.getTimeZone(\"GMT+08:00\"):" + TimeZone.getTimeZone("GMT+08:00"));

	}
}
