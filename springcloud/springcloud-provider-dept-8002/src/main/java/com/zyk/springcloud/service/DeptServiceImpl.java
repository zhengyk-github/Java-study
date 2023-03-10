package com.zyk.springcloud.service;

import com.zyk.springcloud.dao.DeptDao;
import com.zyk.springcloud.pojo.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName: DeptServiceImpl
 * @Date: Created in 2023/3/6 20:54
 * @Version: 1.0
 * @Author: zhengyongkai
 * @Modified By:
 * @Description: TODO
 **/
@Service
public class DeptServiceImpl implements DeptService{
	@Autowired
	public DeptDao deptdao;
	@Override
	public boolean addDept(Dept dept) {
		return deptdao.addDept(dept);
	}

	@Override
	public Dept queryById(Long id) {
		return deptdao.queryById(id);
	}

	@Override
	public List<Dept> queryAll() {
		return deptdao.queryAll();
	}
}
