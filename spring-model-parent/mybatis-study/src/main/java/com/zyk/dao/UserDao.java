package com.zyk.dao;

import com.zyk.pojo.User;

import java.util.List;

/**
 * @ClassName: UserDao
 * @Date: Created in 2022/11/17 10:30
 * @Version: 1.0
 * @Author: zhengyongkai
 * @Modified By:
 * @Description: TODO
 **/
public interface UserDao {
    //查询全部用户
    List<User> getUserList();
    //根据ID查user信息
    User getUserById(int id);
    //插入一条user信息
    int addUser(User user);
    //更新user信息
    int updateUser(User user);
    //删除一个user信息
    int deleteUser(User user);

}
