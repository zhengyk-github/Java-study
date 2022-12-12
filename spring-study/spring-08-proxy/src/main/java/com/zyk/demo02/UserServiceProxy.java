package com.zyk.demo02;

/**
 * @ClassName: UserServiceProxy
 * @Date: Created in 2022/12/12 16:17
 * @Version: 1.0
 * @Author: zhengyongkai
 * @Modified By:
 * @Description: TODO
 **/
public class UserServiceProxy implements UserService{
	private UserService UserService;

	public void setUserService(UserService userService) {
		UserService = userService;
	}

	@Override
	public void add() {
		log("add");
		UserService.add();
	}

	@Override
	public void delete() {
		log("delete");
		UserService.delete();
	}

	@Override
	public void update() {
		log("update");
		UserService.update();
	}

	@Override
	public void query() {
		log("query");
		UserService.query();
	}

	public void log(String msg){
		System.out.println("[DEBUG] 使用了"+msg+"方法");
	}
}
