package com.zyk.designPattern.flyweight.webSiteFactory;

import javax.security.auth.login.Configuration;

/**
 * @ClassName: ConcreteWebSite
 * @Date: Created in 2023/6/21 10:17
 * @Version: 1.0
 * @Author: zhengyongkai
 * @Modified By:
 * @Description: TODO
 **/
public class ConcreteWebSite extends WebSite{
	private String name = "";

	public ConcreteWebSite(String name){
		this.name = name;
	}

	@Override
	public void use() {
		System.out.println("网站分类:"+ name);
	}
}
