import com.zyk.mapper.UserMapper;
import com.zyk.pojo.User;
import com.zyk.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

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
		SqlSession sqlSession = MybatisUtils.getSqlSession();
		UserMapper mapper = sqlSession.getMapper(UserMapper.class);
		List<User> user = mapper.getUser();
		for (User user1 : user) {
			System.out.println("user:" + user1);
		}
		sqlSession.close();
	}
}
