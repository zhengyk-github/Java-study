package com.zyk;

import com.zyk.aop.Cal;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName: Test
 * @Date: Created in 2023/3/24 22:52
 * @Version: 1.0
 * @Author: zhengyongkai
 * @Modified By:
 * @Description: https://www.bilibili.com/video/BV1w3411s7ur/?p=6&spm_id_from=333.1007.top_right_bar_window_history.content.click&vd_source=2098b2d038738a1989d69e4e4c2f2621
 **/
public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Cal bean = context.getBean(Cal.class);
		System.out.println(bean.add(8, 4));
		System.out.println(bean.dul(8, 4));
		System.out.println(bean.mul(8, 4));
		System.out.println(bean.div(8, 4));

	}
}
