package com.zyk.dao;

import com.zyk.pojo.User;
import com.zyk.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @ClassName: TestDao
 * @Date: Created in 2022/11/17 10:37
 * @Version: 1.0
 * @Author: zhengyongkai
 * @Modified By:
 * @Description: bilibili.com/video/BV1NE411Q7Nx/?p=2&vd_source=2098b2d038738a1989d69e4e4c2f2621  【狂神说Java】Mybatis最新完整教程IDEA版通俗易懂
 **/
public class TestDao {
    @Test
    public void test() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserDao userDao = sqlSession.getMapper(UserDao.class);
        List<User> userList = userDao.getUserList();
        System.out.println("获取的结果如下：");
        for (User user : userList) {
            System.out.println(user);
        }
        System.out.println("获取结束，执行close");
        sqlSession.close();

    }

    @Test
    public void getUserById() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserDao userDao = sqlSession.getMapper(UserDao.class);
        int id = 2;
        User user = userDao.getUserById(id);
        System.out.println("获取的结果如下：");
        System.out.println(user);
        System.out.println("获取结束，执行close");
        sqlSession.close();
    }
    @Test
    public void addUser(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserDao userDao = sqlSession.getMapper(UserDao.class);
        User user = new User();
        user.setId(4);
        user.setName("郑永凯");
        user.setPwd("123456");
        int count = userDao.addUser(user);
        System.out.println("获取的结果如下：");
        System.out.println(count);
        sqlSession.commit();
        System.out.println("获取结束，执行close");
        sqlSession.close();
    }
    @Test
    public void updateUser(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserDao userDao = sqlSession.getMapper(UserDao.class);
        int count = userDao.updateUser(new User(4, "哈哈", "123321"));
        System.out.println(count);
        sqlSession.commit();
        sqlSession.close();
    }
    @Test
    public void deleteUser(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserDao userDao = sqlSession.getMapper(UserDao.class);
        int count = userDao.deleteUser(new User(4, "", ""));
        System.out.println(count);
        sqlSession.commit();
        sqlSession.close();
    }

}
