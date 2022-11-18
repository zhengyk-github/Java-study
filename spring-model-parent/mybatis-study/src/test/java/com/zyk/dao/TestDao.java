package com.zyk.dao;

import com.zyk.pojo.User;
import com.zyk.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
    //getUserList
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
    //getUserById
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
    //getUserByIdByMap
    public void getUserByIdByMap(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserDao userDao = sqlSession.getMapper(UserDao.class);
        Map<String, Object> map = new HashMap<>();
        map.put("userid",5);
        User user = userDao.getUserByIdByMap(map);
        System.out.println(user);
        sqlSession.close();
    }

    @Test
    //%拼接
    public void getUserByIdLike() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserDao userDao = sqlSession.getMapper(UserDao.class);
        List<User> user = userDao.getUserByIdLike("测");
        System.out.println("获取的结果如下：");
        for (User user1 : user) {
            System.out.println(user1);
        }
        System.out.println("获取结束，执行close");
        sqlSession.close();
    }

    @Test
    //concat拼接
    public void getUserByIdLike2() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserDao userDao = sqlSession.getMapper(UserDao.class);
        List<User> user = userDao.getUserByIdLike2("测");
        System.out.println("获取的结果如下：");
        for (User user1 : user) {
            System.out.println(user1);
        }
        System.out.println("获取结束，执行close");
        sqlSession.close();
    }

    @Test
    //addUser
    public void addUser(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserDao userDao = sqlSession.getMapper(UserDao.class);
        User user = new User();
        user.setId(4);
        user.setName("郑永凯");
        user.setPwd("123456");
        int count = userDao.addUser(user);
        System.out.println(count);
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    //addUserByMap
    public void addUserByMap(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserDao userDao = sqlSession.getMapper(UserDao.class);
        HashMap<String, Object> map = new HashMap<>();
        map.put("username","测试1");
        map.put("userpassword","123654");
        int count = userDao.addUserByMap(map);
        System.out.println(count);
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    //updateUser
    public void updateUser(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserDao userDao = sqlSession.getMapper(UserDao.class);
        int count = userDao.updateUser(new User(4, "哈哈", "123321"));
        System.out.println(count);
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    //deleteUser
    public void deleteUser(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserDao userDao = sqlSession.getMapper(UserDao.class);
        int count = userDao.deleteUser(new User(4, "", ""));
        System.out.println(count);
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    //testeq
    public void testeq(){
        String Zjlb = "5";
        if(!Zjlb.equals("0") && !Zjlb.equals("4") && !Zjlb.equals("15") && !Zjlb.equals("27")){
            System.out.println("进入if");
        }

    }




}
