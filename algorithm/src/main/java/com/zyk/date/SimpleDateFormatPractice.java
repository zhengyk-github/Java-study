package com.zyk.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @ClassName: SimpleDateFormat
 * @Date: Created in 2023/7/14 14:04
 * @Version: 1.0
 * @Author: zhengyongkai
 * @Modified By:
 * @Description: TODO
 **/
public class SimpleDateFormatPractice {
	public static void main(String[] args) {
		String str = "2016-08-15 14:15:20.456";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
		try {
			Date date = sdf.parse(str);
			System.out.println("date:"+date.toString());
			SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy年M月d h:m:s.S a");
			System.out.println(sdf2.format(date));
			SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy年M月d H:m:s.S");
			System.out.println(sdf3.format(date));
		} catch (ParseException e) {
			e.printStackTrace();
		}


	}
}
