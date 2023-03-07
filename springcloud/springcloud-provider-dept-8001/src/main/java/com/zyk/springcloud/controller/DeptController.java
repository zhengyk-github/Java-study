package com.zyk.springcloud.controller;

import com.zyk.springcloud.pojo.Dept;
import com.zyk.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
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

	@PostMapping("/dept/add")
	public boolean addDept(Dept dept){
		return deptService.addDept(dept);
	}
	@GetMapping("/dept/get/{id}")
	public Dept queryById(@PathVariable("id") Long id){
		return deptService.queryById(id);
	}
	@GetMapping("/dept/list")
	public List<Dept> queryAll(){
		return deptService.queryAll();
	}

}
