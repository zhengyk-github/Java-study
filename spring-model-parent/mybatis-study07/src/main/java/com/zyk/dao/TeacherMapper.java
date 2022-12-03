package com.zyk.dao;

import com.zyk.pojo.Teacher;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @ClassName: TeacherMapper
 * @Date: Created in 2022/12/2 15:17
 * @Version: 1.0
 * @Author: zhengyongkai
 * @Modified By:
 * @Description: TODO
 **/
public interface TeacherMapper {

	List<Teacher> getTeacher();

	Teacher getTeacherById(@Param("tid")int id);

	Teacher getTeacherById2(@Param("tid")int id);
}
