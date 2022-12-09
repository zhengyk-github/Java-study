import com.zyk.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName: MyTest
 * @Date: Created in 2022/12/9 14:53
 * @Version: 1.0
 * @Author: zhengyongkai
 * @Modified By:
 * @Description: TODO
 **/
public class MyTest {

	@Test
	public void testComponent(){
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		User user = context.getBean("user", User.class);
		System.out.println(user.name);

	}
}
