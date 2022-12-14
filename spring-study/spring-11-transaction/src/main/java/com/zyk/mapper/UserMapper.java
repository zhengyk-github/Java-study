package com.zyk.mapper;

import com.zyk.pojo.User;

import java.util.List;

/**
 * @ClassName: UserMapper
 * @Date: Created in 2022/12/6 14:45
 * @Version: 1.0
 * @Author: zhengyongkai
 * @Modified By:
 * @Description: TODO
 **/
public interface UserMapper {

	List<User> getUser();

	//新增一个用户
	public int addUser(User user);
	//删除一个用户 根据id
	public int deleteUser(int id);

	List<User> selectUser();

}
