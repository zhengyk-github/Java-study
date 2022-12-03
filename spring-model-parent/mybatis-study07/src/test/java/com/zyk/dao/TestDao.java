package com.zyk.dao;

import com.zyk.pojo.Student;
import com.zyk.pojo.Teacher;
import com.zyk.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;

import java.util.List;

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
	//getTeacher
	public void getTeacher() {
		SqlSession sqlSession = MybatisUtils.getSqlSession();
		TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
		List<Teacher> teacher = mapper.getTeacher();
		for (Teacher teacher1 : teacher) {
			System.out.println(teacher1);
		}
		sqlSession.close();
	}
	@Test
	//getTeacherById
	public void getTeacherById() {
		SqlSession sqlSession = MybatisUtils.getSqlSession();
		TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
		Teacher teacher = mapper.getTeacherById(1);
			System.out.println(teacher);
		sqlSession.close();
	}

	@Test
	//getTeacherById2
	public void getTeacherById2() {
		SqlSession sqlSession = MybatisUtils.getSqlSession();
		TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
		Teacher teacher = mapper.getTeacherById2(1);
		System.out.println(teacher);
		sqlSession.close();
	}

}
