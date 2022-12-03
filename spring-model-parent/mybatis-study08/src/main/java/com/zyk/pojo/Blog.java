package com.zyk.pojo;

import lombok.Data;

import java.util.Date;

/**
 * @ClassName: Blog
 * @Date: Created in 2022/12/3 16:13
 * @Version: 1.0
 * @Author: zhengyongkai
 * @Modified By:
 * @Description: TODO
 **/
@Data
public class Blog {
	private String id;
	private String title;
	private String author;
	private Date createTime; //属性名和字段名不一致
	private int views;

}
