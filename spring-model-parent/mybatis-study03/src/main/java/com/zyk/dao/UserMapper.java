package com.zyk.dao;

import com.zyk.pojo.User;

import java.util.List;
import java.util.Map;

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

    //查询全部用户 使用
    List<User> getUserListAlias();

    //分页查询查询
    List<User> getUserByLimit(Map<String, Integer> map);

}
