package com.zyk.dao;

import com.zyk.pojo.Student;
import com.zyk.pojo.Teacher;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @ClassName: StudentMapper
 * @Date: Created in 2022/12/2 15:16
 * @Version: 1.0
 * @Author: zhengyongkai
 * @Modified By:
 * @Description: TODO
 **/
public interface StudentMapper {

	List<Student> getStudent();

	List<Student> getStudent2();
}
