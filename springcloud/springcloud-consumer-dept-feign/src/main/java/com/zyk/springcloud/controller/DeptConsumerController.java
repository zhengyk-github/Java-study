package com.zyk.springcloud.controller;

import com.zyk.springcloud.pojo.Dept;
import com.zyk.springcloud.service.DeptClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @ClassName: DeptConsumerController
 * @Date: Created in 2023/3/6 22:36
 * @Version: 1.0
 * @Author: zhengyongkai
 * @Modified By:
 * @Description: TODO
 **/
@RestController
public class DeptConsumerController {
	@Autowired
	private DeptClientService service;

	@RequestMapping("/consumer/dept/add")
	public boolean addDept(Dept dept) {
		return this.service.addDept(dept);
	}

	@RequestMapping("/consumer/dept/get/{id}")
	public Dept queryById(@PathVariable("id") Long id) {
		return this.service.queryById(id);
	}

	@RequestMapping("/consumer/dept/list")
	public List<Dept> queryAll() {
		return this.service.queryAll();
	} //http://localhost/consumer/dept/list 浏览器访问


}
