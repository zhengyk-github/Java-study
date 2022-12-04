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
	/*CREATE TABLE `blog`(
	`id` VARCHAR(50) NOT NULL COMMENT '博客id',
	`title` VARCHAR(100) NOT NULL COMMENT '博客标题',
	`author` VARCHAR(30) NOT NULL COMMENT '博客作者',
	`create_time` DATETIME NOT NULL COMMENT '创建时间',
	`views` INT(30) NOT NULL COMMENT '浏览量'
	)ENGINE=INNODB DEFAULT CHARSET=utf8*/