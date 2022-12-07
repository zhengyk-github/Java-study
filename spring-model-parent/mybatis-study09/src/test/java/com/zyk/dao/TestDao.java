package com.zyk.dao;

import com.zyk.pojo.User;
import com.zyk.utils.IdUtils;
import com.zyk.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

/**
 * @ClassName: TestDao
 * @Date: Created in 2022/11/18 15:22
 * @Version: 1.0
 * @Author: zhengyongkai
 * @Modified By:
 * @Description: 小结：一级缓存默认是开启的，只有一次sqlsession中有效，也就是拿到连接到关闭连接这个区间段！一级缓存就是一个map。
 **/
public class TestDao {
	static Logger logger = Logger.getLogger(TestDao.class);

	//一级缓存
	@Test
	public void getUserById() {
		SqlSession sqlSession = MybatisUtils.getSqlSession();
		UserMapper mapper = sqlSession.getMapper(UserMapper.class);
		User user = mapper.getUserById(1);
		System.out.println("user:" + user);
		// int updateCount = mapper.updateUser(new User(4, "name更新", "pwd更新"));
		// System.out.println("updateCount:" + updateCount);
		sqlSession.clearCache();//手动清理缓存
		User user2 = mapper.getUserById(2);
		System.out.println("user2:" + user2);
		System.out.println("user == user2:" + (user == user2));
		sqlSession.close();
	}

	/*
	 * 小结
	 * 1.只要开启了二级缓存，在同一个Mapper下就有效
	 * 2.所有的数据都会先放在一级缓存中
	 * 3.只有当会话提交或者关闭的时候才会提交到二级缓存中！
	 * */
	//二级缓存 在同一个mapper下有效
	@Test
	public void getUser(){
		SqlSession sqlSession = MybatisUtils.getSqlSession();
		UserMapper mapper = sqlSession.getMapper(UserMapper.class);
		UserMapper mapper2 = sqlSession.getMapper(UserMapper.class);
		User user = mapper.getUserById(1);
		System.out.println("user:" + user);
		// int updateCount = mapper.updateUser(new User(4, "name更新", "pwd更新"));
		// System.out.println("updateCount:" + updateCount);
		//sqlSession.clearCache();//手动清理缓存
		User user2 = mapper2.getUserById(1);
		System.out.println("user2:" + user2);
		System.out.println("user == user2:" + (user == user2));
		sqlSession.close();

	}
}
