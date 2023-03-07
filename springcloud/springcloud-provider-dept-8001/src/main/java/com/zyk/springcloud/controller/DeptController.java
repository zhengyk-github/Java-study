package com.zyk.springcloud.controller;

import com.zyk.springcloud.pojo.Dept;
import com.zyk.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @ClassName: DeptController
 * @Date: Created in 2023/3/6 21:14
 * @Version: 1.0
 * @Author: zhengyongkai
 * @Modified By:
 * @Description: TODO
 **/
//提供Restful服务
@RestController
public class DeptController {
	@Autowired
	private DeptService deptService;
	//获取一些配置的信息，得到具体的微服务
	@Autowired
	private DiscoveryClient client;


	@PostMapping("/dept/add")
	public boolean addDept(Dept dept) {
		return deptService.addDept(dept);
	}

	@GetMapping("/dept/get/{id}")
	public Dept queryById(@PathVariable("id") Long id) {
		return deptService.queryById(id);
	}

	@GetMapping("/dept/list")
	public List<Dept> queryAll() {
		return deptService.queryAll();
	}

	//注册进来的微服务 获取一些消息
	@GetMapping("/dept/discovery")
	public Object discovery() {
		//获取微服务列表的清单
		List<String> services = client.getServices();
		System.out.println("discovery.services:" + services);
		//得到一个具体的微服务信息，通过具体的微服务id applicationName
		List<ServiceInstance> instances = client.getInstances("springcloud-provider-dept");
		for (ServiceInstance instance : instances) {
			System.out.println("instance.getHost():" + instance.getHost() + ",instance.getPort():" + instance.getPort() +
				",instance.getUri():" + instance.getUri() + ",instance.getServiceId():" + instance.getServiceId());
		}
		return this.client;
	}

}
