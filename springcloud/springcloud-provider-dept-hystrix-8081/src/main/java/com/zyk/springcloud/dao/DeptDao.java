package com.zyk.springcloud.dao;

import com.zyk.springcloud.pojo.Dept;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @ClassName: DeptDao
 * @Date: Created in 2023/3/6 20:40
 * @Version: 1.0
 * @Author: zhengyongkai
 * @Modified By:
 * @Description: TODO
 **/
@Mapper
@Repository
public interface DeptDao {
	public boolean addDept(Dept dept);

	public Dept queryById(Long id);

	public List<Dept> queryAll();

}
