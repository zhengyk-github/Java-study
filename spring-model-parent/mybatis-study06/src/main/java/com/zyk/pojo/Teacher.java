package com.zyk.pojo;

import lombok.Data;

/**
 * @ClassName: Teacher
 * @Date: Created in 2022/12/2 15:02
 * @Version: 1.0
 * @Author: zhengyongkai
 * @Modified By:
 * @Description: TODO
 **/
@Data
public class Teacher {
	private int id;
	private String name;
}
	/*
	CREATE TABLE `teacher` (
	`id` INT(10) NOT NULL,
	`name` VARCHAR(30) DEFAULT NULL,
	PRIMARY KEY (`id`)
	) ENGINE=INNODB DEFAULT CHARSET=utf8

	INSERT INTO teacher(`id`, `name`) VALUES (1, '秦老师');
	*/

