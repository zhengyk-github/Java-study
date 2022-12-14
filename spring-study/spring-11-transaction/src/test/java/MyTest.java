import com.zyk.mapper.UserMapper;
import com.zyk.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @ClassName: MyTest
 * @Date: Created in 2022/12/13 15:51
 * @Version: 1.0
 * @Author: zhengyongkai
 * @Modified By:
 * @Description: TODO
 **/
public class MyTest {
	@Test
	public void getUser(){
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserMapper userMapper = context.getBean("userMapper", UserMapper.class);
		List<User> user = userMapper.getUser();
		for (User user1 : user) {
			System.out.println("user:" + user1);
		}
	}
	@Test
	public void testTransaction(){
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserMapper userMapper = context.getBean("userMapper", UserMapper.class);
		int countAdd = userMapper.addUser(new User(12, "测试12", "123"));
		System.out.println("addUser_countAdd:"+countAdd);

		int countDelete = userMapper.deleteUser(12);
		System.out.println("deleteUser_countDelete:"+countDelete);

	}
}
