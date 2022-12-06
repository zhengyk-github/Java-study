package com.zyk.dao;

import com.zyk.pojo.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;
import java.util.Map;

/**
 * @ClassName: UserMapper
 * @Date: Created in 2022/12/6 14:45
 * @Version: 1.0
 * @Author: zhengyongkai
 * @Modified By:
 * @Description: TODO
 **/
public interface UserMapper {
	@Select("select * from User where id = #{id}")
	User getUserById(@Param("id")int id);

	@Update("update user set name = #{name},pwd = #{pwd} where id = #{id}")
	int updateUser(User user);

}
