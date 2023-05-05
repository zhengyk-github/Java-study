package com.zyk.springcloud.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
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


	/*@PostMapping("/dept/add")
	public boolean addDept(Dept dept) {
		return deptService.addDept(dept);
	}*/

	@GetMapping("/dept/get/{id}")
	@HystrixCommand(fallbackMethod = "hystrixQueryById")
	public Dept queryById(@PathVariable("id") Long id) {
		Dept dept = deptService.queryById(id);
		if(dept==null){
			throw new RuntimeException("id:"+id+",不存在该用户，信息无法找到");
		}
		return dept;
	}
	//备选方法
	public Dept hystrixQueryById(@PathVariable("id") Long id) {
		return new Dept().setDno(id).setDname("id:"+id+"没有对应的信息：null--@hystrix").setDb_source("no this database in MySQL");
	}



	/*@GetMapping("/dept/list")
	public List<Dept> queryAll() {
		return deptService.queryAll();
	}*/



}
