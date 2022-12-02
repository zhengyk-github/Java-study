package com.zyk.pojo;

import lombok.Data;

/**
 * @ClassName: Student
 * @Date: Created in 2022/12/2 15:01
 * @Version: 1.0
 * @Author: zhengyongkai
 * @Modified By:
 * @Description: TODO
 **/
@Data
public class Student {
	private int id;
	private String name;
	//学生关联一个老师
	private Teacher teacher;
}
	/*
	CREATE TABLE `student` (
	`id` INT(10) NOT NULL,
	`name` VARCHAR(30) DEFAULT NULL,
	`tid` INT(10) DEFAULT NULL,
	PRIMARY KEY (`id`),
	KEY `fktid` (`tid`),
	CONSTRAINT `fktid` FOREIGN KEY (`tid`) REFERENCES `teacher` (`id`)
	) ENGINE=INNODB DEFAULT CHARSET=utf8

	INSERT INTO `student` (`id`, `name`, `tid`) VALUES ('1', '小明', '1');
	INSERT INTO `student` (`id`, `name`, `tid`) VALUES ('2', '小红', '1');
	INSERT INTO `student` (`id`, `name`, `tid`) VALUES ('3', '小张', '1');
	INSERT INTO `student` (`id`, `name`, `tid`) VALUES ('4', '小李', '1');
	INSERT INTO `student` (`id`, `name`, `tid`) VALUES ('5', '小王', '1');
	*/
