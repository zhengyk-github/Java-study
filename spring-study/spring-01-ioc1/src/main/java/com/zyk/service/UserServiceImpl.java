package com.zyk.service;

import com.zyk.dao.UserDao;
import com.zyk.dao.UserDaoImpl;
import com.zyk.dao.UserDaoMysqlImpl;
import com.zyk.dao.UserDaoOracleImpl;

/**
 * @ClassName: UserServiceImpl
 * @Date: Created in 2022/12/7 12:18
 * @Version: 1.0
 * @Author: zhengyongkai
 * @Modified By:
 * @Description: TODO
 **/
public class UserServiceImpl implements UserService{
	private UserDao userDao ;

	//使用set进行动态实现值的注入
	/*之前程序是主动创建对象!控制权在程序猿手上!
	* 使用了set注入后，程序不在具有主动性，而是变成了被动的接受对象
	* 这种思想，从本质上解决了问题，我们程序猿不用再去管理对象的创建了。系统的耦合性大大降低，可以更加专注的在业务的是线上!这是IOC的原型!
	* */
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public void getUser() {
		userDao.getUser();
	}

}
