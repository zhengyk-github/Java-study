package com.zyk.springcloud.pojo;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @ClassName: Dept
 * @Date: Created in 2023/3/6 15:44
 * @Version: 1.0
 * @Author: zhengyongkai
 * @Modified By:
 * @Description: TODO
 **/
@Data
@NoArgsConstructor
@Accessors(chain = true) //链式写法
public class Dept implements Serializable {

	private Long dno;//主键
	private String dname;
	//这个数据存在那个数据库的字段~ 微服务，一个服务对应一个数据库，同一个信息可能存在不同的数据库
	private String db_source;

	public Dept(Long dno, String dname, String db_source) {
		this.dno = dno;
		this.dname = dname;
		this.db_source = db_source;
	}

	public Dept(String dname) {
		this.dname = dname;
	}

	/*
	链式写法
	Dept dept = new Dept();
	dept.setDno(11).setDname("ssss").setDb_source("001");
	*/
}
