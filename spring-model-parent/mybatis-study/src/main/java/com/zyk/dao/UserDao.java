package com.zyk.dao;

import com.zyk.pojo.User;

import java.util.List;
import java.util.Map;

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
    //根据ID查user信息 通过map形式
    User getUserByIdByMap(Map<String,Object> map);
    //根据ID查user信息 模糊查询 %拼接
    List<User> getUserByIdLike(String name);
    //根据ID查user信息 模糊查询 concat拼接
    List<User> getUserByIdLike2(String name);
    //插入一条user信息
    int addUser(User user);
    //插入一条user信息 通过map形式
    int addUserByMap(Map<String,Object> map);
    //更新user信息
    int updateUser(User user);
    //删除一个user信息
    int deleteUser(User user);


}
