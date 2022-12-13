package com.zyk.service;

/**
 * @ClassName: UserServiceImpl
 * @Date: Created in 2022/12/12 15:45
 * @Version: 1.0
 * @Author: zhengyongkai
 * @Modified By:
 * @Description: TODO
 **/
public class UserServiceImpl implements UserService {

	@Override
	public void add() {
		System.out.println("新增一个用户");
	}

	@Override
	public void delete() {
		System.out.println("删除一个用户");
	}

	@Override
	public void update() {
		System.out.println("修改一个用户");
	}

	@Override
	public void select() {
		System.out.println("查询一个用户");
	}


}
