package com.zyk.dao;

/**
 * @ClassName: UserDaoMysqlImpl
 * @Date: Created in 2022/12/7 15:00
 * @Version: 1.0
 * @Author: zhengyongkai
 * @Modified By:
 * @Description: TODO
 **/
public class UserDaoMysqlImpl implements UserDao{
	@Override
	public void getUser() {
		System.out.println("默认获取mysql用户的数据！");
	}
}
