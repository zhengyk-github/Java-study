import com.zyk.ioc.BeanConfiguration;
import com.zyk.ioc.DataConfiguration;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @ClassName: test
 * @Date: Created in 2023/3/24 15:46
 * @Version: 1.0
 * @Author: zhengyongkai
 * @Modified By:
 * @Description: TODO
 **/
public class test {
	@Test
	public void testBeanConfiguration(){
		//AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext("com.zyk.ioc");//扫描com.zyk.ioc包下的
		//System.out.println(ac.getBean(DataConfiguration.class));
		//System.out.println(ac.getBean("dataConfig"));
		System.out.println(ac.getBean("config"));//在@Bean上加Value或name
	}
}
