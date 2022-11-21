package com.zyk.dao;

import com.zyk.pojo.User;
import com.zyk.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @ClassName: TestDao
 * @Date: Created in 2022/11/18 15:22
 * @Version: 1.0
 * @Author: zhengyongkai
 * @Modified By:
 * @Description: TODO
 **/
public class TestDao {
    @Test
    //getUserList
    public void test() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper userDao = sqlSession.getMapper(UserMapper.class);
        List<User> userList = userDao.getUserList();
        System.out.println("获取的结果如下：");
        for (User user : userList) {
            System.out.println(user);
        }
        System.out.println("获取结束，执行close");
        sqlSession.close();

    }
    @Test
    //getUserListAlias
    public void testAlias() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper userDao = sqlSession.getMapper(UserMapper.class);
        List<User> userList = userDao.getUserListAlias();
        System.out.println("获取的结果如下：");
        for (User user : userList) {
            System.out.println(user);
        }
        System.out.println("获取结束，执行close");
        sqlSession.close();
        
    }


}
