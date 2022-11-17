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

    List<User> getUserList();
}
