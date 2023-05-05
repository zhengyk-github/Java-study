package com.zyk.myrule;

import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.AbstractLoadBalancerRule;
import com.netflix.loadbalancer.ILoadBalancer;
import com.netflix.loadbalancer.Server;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

/**
 * @ClassName: ZykRandomRule
 * @Date: Created in 2023/5/5 11:46
 * @Version: 1.0
 * @Author: zhengyongkai
 * @Modified By:
 * @Description: TODO
 **/
public class ZykRandomRule extends AbstractLoadBalancerRule {
	//每个服务访问5次，换下一个服务(假设总共有三个服务)
	//total=0，默认=0 如果=5 我们指向下一个服务节点
	//currentIndex 默认=0，如果totale=5 则currentIndex+1
	private int total = 0;//被调用的次数
	private int currentIndex = 0;//当前是谁在提供服务

	public Server choose(ILoadBalancer lb, Object key) {
		if (lb == null) {
			return null;
		}
		Server server = null;

		while (server == null) {
			if (Thread.interrupted()) {
				return null;
			}
			List<Server> upList = lb.getReachableServers();//获取活着的服务
			List<Server> allList = lb.getAllServers();//获取全部的服务

			int serverCount = allList.size();
			if (serverCount == 0) {
				return null;
			}
			/*int index = chooseRandomInt(serverCount);//生成区间随机数
			server = upList.get(index);//从活着的服务中随机获取*/
			if (total < 5) {
				server = upList.get(currentIndex);
				total++;
			} else {
				total = 0;
				currentIndex++;
				if (currentIndex >= upList.size()) {
					currentIndex = 0;
				}
				server = upList.get(currentIndex);
			}
			System.out.println("total:"+total);
			System.out.println("currentIndex:"+currentIndex);
			if (server == null) {

				Thread.yield();
				continue;
			}
			if (server.isAlive()) {
				return (server);
			}
			server = null;
			Thread.yield();
		}

		return server;

	}

	protected int chooseRandomInt(int serverCount) {
		return ThreadLocalRandom.current().nextInt(serverCount);
	}

	@Override
	public Server choose(Object key) {
		return choose(getLoadBalancer(), key);
	}

	@Override
	public void initWithNiwsConfig(IClientConfig clientConfig) {
		// TODO Auto-generated method stub

	}
}
