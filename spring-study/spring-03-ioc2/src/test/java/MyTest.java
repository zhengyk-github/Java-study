import com.zyk.pojo.UserT;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName: MyTest
 * @Date: Created in 2022/12/7 22:28
 * @Version: 1.0
 * @Author: zhengyongkai
 * @Modified By:
 * @Description: 总结：在配置文件加载的时候，容器中管理的对象就已经初始化了！
 **/
public class MyTest {
	/*public static void main(String[] args) {
		*//*User user = new User();
		user.setName("郑永凯");
		user.show();*//*
		*//*ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		UserT user = (UserT) context.getBean("userT2");
		user.show();*//*
		*//*User user2 = (User) context.getBean("user");
		System.out.println("user==user2:" + (user == user2));*//*
	}*/


	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		/*User user = (User) context.getBean("userT1");
		user.show();*/
		UserT user = (UserT) context.getBean("userT4");
		user.show();
	}
}
