import com.zyk.pojo.Student;
import com.zyk.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName: MyTest
 * @Date: Created in 2022/12/8 15:17
 * @Version: 1.0
 * @Author: zhengyongkai
 * @Modified By:
 * @Description: TODO
 **/
public class MyTest {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Student student = (Student) context.getBean("student");
		System.out.println(student.toString());
	}

	//p标签
	@Test
	public void testUser(){
		ApplicationContext context = new ClassPathXmlApplicationContext("userBeans.xml");
		User user = (User) context.getBean("user");
		System.out.println(user.toString());
	}
	//c标签
	@Test
	public void testUser2(){
		ApplicationContext context = new ClassPathXmlApplicationContext("userBeans.xml");
		User user = (User) context.getBean("user2");
		User user2 = (User) context.getBean("user2");
		System.out.println(user.toString());
		System.out.println(user==user2);
	}


}
