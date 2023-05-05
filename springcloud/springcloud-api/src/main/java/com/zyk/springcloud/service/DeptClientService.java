package com.zyk.springcloud.service;

import com.zyk.springcloud.pojo.Dept;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

/**
 * @ClassName: DeptClientService
 * @Date: Created in 2023/5/5 16:09
 * @Version: 1.0
 * @Author: zhengyongkai
 * @Modified By:
 * @Description: TODO
 **/
@Component
@FeignClient(value = "SPRINGCLOUD-PROVIDER-DEPT",fallbackFactory = DeptClientServiceFallbackFactory.class)
public interface DeptClientService {
	@GetMapping("/dept/get/{id}")
	public Dept queryById(@PathVariable("id") Long id);

	@GetMapping("/dept/list")
	public List<Dept> queryAll();

	@PostMapping("/dept/add")
	public boolean addDept(Dept dept);
}
