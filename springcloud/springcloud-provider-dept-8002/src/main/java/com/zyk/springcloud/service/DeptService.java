package com.zyk.springcloud.service;

import com.zyk.springcloud.pojo.Dept;

import java.util.List;

/**
 * @ClassName: DeptService
 * @Date: Created in 2023/3/6 20:53
 * @Version: 1.0
 * @Author: zhengyongkai
 * @Modified By:
 * @Description: TODO
 **/
public interface DeptService {
	public boolean addDept(Dept dept);

	public Dept queryById(Long id);

	public List<Dept> queryAll();
}
