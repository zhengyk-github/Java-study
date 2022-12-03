package com.zyk.dao;

import com.zyk.pojo.Student;
import com.zyk.pojo.Teacher;
import com.zyk.utils.MybatisUtils;
import org.apache.ibatis.session.RowBounds;
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
	//getTeacherById
	public void getTeacherById() {
		SqlSession sqlSession = MybatisUtils.getSqlSession();
		TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
		Teacher teacherById = mapper.getTeacherById(1);
		System.out.println("teacherById:"+teacherById);
		sqlSession.close();
	}
	@Test
	//getStudent
	public void getStudent() {
		SqlSession sqlSession = MybatisUtils.getSqlSession();
		StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
		List<Student> student = mapper.getStudent();
		for (Student student1 : student) {
			System.out.println(student1);
			//System.out.println(student1.getTeacher().getName());
		}
		sqlSession.close();
	}

	@Test
	//getStudent2
	public void getStudent2() {
		SqlSession sqlSession = MybatisUtils.getSqlSession();
		StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
		List<Student> student = mapper.getStudent2();
		for (Student student2 : student) {
			System.out.println(student2);
			//System.out.println(student2.getTeacher().getName());
		}
		sqlSession.close();
	}

}
