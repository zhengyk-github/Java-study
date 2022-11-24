package com.zyk.dao;

import com.zyk.pojo.User;
import com.zyk.utils.MybatisUtils;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ClassName: TestDao
 * @Date: Created in 2022/11/18 15:22
 * @Version: 1.0
 * @Author: zhengyongkai
 * @Modified By:
 * @Description: TODO
 **/
public class TestDao {
	static Logger logger = Logger.getLogger(TestDao.class);

	@Test
	//getUserList
	public void test() {
		SqlSession sqlSession = MybatisUtils.getSqlSession();
		UserMapper userDao = sqlSession.getMapper(UserMapper.class);
		List<User> userList = userDao.getUserList();
		System.out.println("获取的结果如下：");
		for (User user : userList) {
			System.out.println(user);
		}
		System.out.println("获取结束，执行close");
		sqlSession.close();

	}

	@Test
	//testlog4j
	public void testlog4j() {
		logger.info("info:进入testlog4j()");
		logger.debug("debug:进入testlog4j()");
		logger.error("error:进入testlog4j()");

	}

	@Test
	//getUserByLimit
	public void getUserByLimit() {
		SqlSession sqlSession = MybatisUtils.getSqlSession();
		UserMapper userDao = sqlSession.getMapper(UserMapper.class);
		Map<String, Integer> map = new HashMap<>();
		map.put("startIndex", 0);
		map.put("pageSize", 4);

		List<User> userList = userDao.getUserByLimit(map);
		System.out.println("获取的结果如下：");
		for (User user : userList) {
			System.out.println(user);
		}
		System.out.println("获取结束，执行close");
		sqlSession.close();
	}

	@Test
	//getUserByRowBounds1
	public void getUserByRowBounds1() {
		SqlSession sqlSession = MybatisUtils.getSqlSession();
		List<User> userList = sqlSession.selectList("com.zyk.dao.UserMapper.getUserByRowBounds");
		System.out.println("获取的结果如下：");
		for (User user : userList) {
			System.out.println(user);
		}
		System.out.println("获取结束，执行close");
		sqlSession.close();
	}

	@Test
	//getUserByRowBounds2
	public void getUserByRowBounds2() {
		SqlSession sqlSession = MybatisUtils.getSqlSession();
		RowBounds rowBounds = new RowBounds(1, 4);
		List<User> userList = sqlSession.selectList("com.zyk.dao.UserMapper.getUserByRowBounds", null, rowBounds);
		System.out.println("获取的结果如下：");
		for (User user : userList) {
			System.out.println(user);
		}
		System.out.println("获取结束，执行close");
		sqlSession.close();
	}

}
