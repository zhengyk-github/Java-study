package com.zyk.mapper;

import com.zyk.pojo.User;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

/**
 * @ClassName: UserMapperImpl2
 * @Date: Created in 2022/12/14 13:43
 * @Version: 1.0
 * @Author: zhengyongkai
 * @Modified By:
 * @Description: TODO
 **/
public class UserMapperImpl2 extends SqlSessionDaoSupport implements UserMapper{
	@Override
	public List<User> getUser() {
		return getSqlSession().getMapper(UserMapper.class).getUser();
	}
}
