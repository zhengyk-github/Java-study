package test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName: TestIOC
 * @Date: Created in 2023/3/24 15:24
 * @Version: 1.0
 * @Author: zhengyongkai
 * @Modified By:
 * @Description: 使用xml配置的方式实现IOC
 **/
public class TestIOC {

	@Test
	public void testIOC() {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		System.out.println(context.getBean("dataConfig"));


	}

}
