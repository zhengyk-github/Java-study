package com.zyk.dao;

import com.zyk.pojo.Teacher;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * @ClassName: TeacherMapper
 * @Date: Created in 2022/12/2 15:17
 * @Version: 1.0
 * @Author: zhengyongkai
 * @Modified By:
 * @Description: TODO
 **/
public interface TeacherMapper {
	@Select("select * from teacher where id = #{tid}")
	Teacher getTeacherById(@Param("tid") int id);

}
