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

	//加事务 执行语句失败之后进行回滚
	/*为什么需要事务？
	如果不配置事务，可能存在数据提交不一致的情况
	如果我们不在spring中去配置声明式事务，我们就需要在代码中手动配置事务
	事务在项目的开发中十分重要，涉及到数据的一致性和完整性问题，不容马虎*/
	@Test
	public void testTransaction(){
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserMapper userMapper = context.getBean("userMapper", UserMapper.class);
		List<User> user = userMapper.selectUser();
		for (User user1 : user) {
			System.out.println("user:" + user1);
		}
	}
}
