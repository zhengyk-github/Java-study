package com.zyk.mapper;

import com.zyk.pojo.User;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

/**
 * @ClassName: UserMapperImpl
 * @Date: Created in 2022/12/14 10:57
 * @Version: 1.0
 * @Author: zhengyongkai
 * @Modified By:
 * @Description: TODO
 **/
public class UserMapperImpl extends SqlSessionDaoSupport implements UserMapper{
	@Override
	public List<User> getUser() {
		return getSqlSession().getMapper(UserMapper.class).getUser();
	}

	@Override
	public int addUser(User user) {
		return getSqlSession().getMapper(UserMapper.class).addUser(user);
	}

	@Override
	public int deleteUser(int id) {
		return getSqlSession().getMapper(UserMapper.class).deleteUser(id);
	}
}