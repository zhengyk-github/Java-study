package com.zyk.springcloud.controller;

import com.zyk.springcloud.pojo.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

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
	//理解：消费者，不应该有service层~
	//RestTemplate 供我们直接调用就可以了！注册到spring中

	@Autowired
	private RestTemplate restTemplate;//提供多种便携访问远程http服务的方法，简单的Restful服务模板~

	//private static final String REST_URL_PREFIX = "http://localhost:8001";
	//Ribbon 我们这里的地址，应该是一个变量，通过服务名来访问
	private static final String REST_URL_PREFIX = "http://springcloud-provider-dept";

	@RequestMapping("/consumer/dept/add")
	public boolean addDept(Dept dept){
		return restTemplate.postForObject(REST_URL_PREFIX+"/dept/add",dept,Boolean.class);
	}
	@RequestMapping("/consumer/dept/get/{id}")
	public Dept queryById(@PathVariable("id") Long id){
		return restTemplate.getForObject(REST_URL_PREFIX+"/dept/get/"+id,Dept.class);
	}
	@RequestMapping("/consumer/dept/list")
	public List<Dept> queryAll(){
		return restTemplate.getForObject(REST_URL_PREFIX+"/dept/list",List.class);
	} //http://localhost/consumer/dept/list 浏览器访问




}
