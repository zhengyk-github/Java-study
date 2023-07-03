package com.zyk.designPattern.flyweight.webSiteFactory;

import java.util.HashMap;

/**
 * @ClassName: WebSiteFactory
 * @Date: Created in 2023/6/21 10:17
 * @Version: 1.0
 * @Author: zyk
 * @Modified By:
 * @Description: 享元模式
 **/
public class WebSiteFactory {
	private HashMap<String, ConcreteWebSite> pool = new HashMap<>();

	public WebSite getWebSiteCategory(String key) {
		if (!pool.containsKey(key)) {
			pool.put(key, new ConcreteWebSite(key));
		}
		return (WebSite) pool.get(key);
	}

	public int getWebSiteCount() {
		return pool.size();
	}

}
