import com.zyk.config.ZykConfig;
import com.zyk.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @ClassName: NyTest
 * @Date: Created in 2022/12/9 16:49
 * @Version: 1.0
 * @Author: zhengyongkai
 * @Modified By:
 * @Description: TODO
 **/
public class MyTest {

	@Test
	public void test1() {
		ApplicationContext context = new AnnotationConfigApplicationContext(ZykConfig.class);
		User getUser = context.getBean("getUser", User.class);
		System.out.println(getUser.getName());

	}
}
