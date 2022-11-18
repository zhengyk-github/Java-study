package com.zyk.dao;

import com.zyk.pojo.User;

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
    List<User> getUserList();
}
