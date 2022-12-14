package com.zyk.mapper;

import com.zyk.pojo.User;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;

/**
 * @ClassName: UserMapperImpl
 * @Date: Created in 2022/12/14 10:57
 * @Version: 1.0
 * @Author: zhengyongkai
 * @Modified By:
 * @Description: TODO
 **/
public class UserMapperImpl implements UserMapper{
	/*我们的所有操作，都使用sqlSession来执行，在原来 现在都使用SqlSessionTemplate*/
	private SqlSessionTemplate sqlSession;

	public void setSqlSession(SqlSessionTemplate sqlSession) {
		this.sqlSession = sqlSession;
	}

	@Override
	public List<User> getUser() {
		UserMapper mapper = sqlSession.getMapper(UserMapper.class);
		return mapper.getUser();
	}
}
