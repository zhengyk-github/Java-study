import com.zyk.mapper.UserMapper;
import com.zyk.mapper.UserMapperImpl;
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
}
