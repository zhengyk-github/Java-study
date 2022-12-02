package com.zyk.dao;

import com.zyk.pojo.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @ClassName: UserMapper
 * @Date: Created in 2022/11/18 15:23
 * @Version: 1.0
 * @Author: zhengyongkai
 * @Modified By:
 * @Description: TODO
 **/
public interface UserMapper {
	//查询全部用户
	@Select("select * from user")
	List<User> getAllUserList();

	@Select("select * from user where id = #{uid}")
	User getUserById(@Param("uid") int id);

	@Insert("insert into user values(#{id},#{name},#{pwd})")
	int insertUser(User user);

	@Update("update user set name = #{name},pwd = #{pwd} where id = #{id}")
	int updateUser(User user);

	@Delete("delete from user where id = #{uid}")
	int deleteById(@Param("uid") int id);

}
