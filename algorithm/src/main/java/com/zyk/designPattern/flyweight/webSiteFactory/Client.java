package com.zyk.designPattern.flyweight.webSiteFactory;

import lombok.experimental.var;

/**
 * @ClassName: Client
 * @Date: Created in 2023/6/21 10:17
 * @Version: 1.0
 * @Author: zhengyongkai
 * @Modified By:
 * @Description: TODO
 **/
public class Client {
	public static void main(String[] args) {
		WebSiteFactory factory = new WebSiteFactory();
		WebSite f1 = factory.getWebSiteCategory("博客");
		f1.use();
		WebSite f2 = factory.getWebSiteCategory("博客");
		f2.use();
		WebSite f3 = factory.getWebSiteCategory("博客");
		f3.use();
		WebSite f4 = factory.getWebSiteCategory("bilibili");
		f4.use();
		WebSite f5 = factory.getWebSiteCategory("bilibili");
		f5.use();
		WebSite f6 = factory.getWebSiteCategory("bilibili");
		f6.use();
		System.out.println("网站分类总数："+factory.getWebSiteCount());
	}

}
