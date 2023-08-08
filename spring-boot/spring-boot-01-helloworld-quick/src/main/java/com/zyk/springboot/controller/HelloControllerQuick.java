package com.zyk.springboot.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: HelloController
 * @Date: Created in 2023/7/5 21:17
 * @Version: 1.0
 * @Author: zhengyongkai
 * @Modified By:
 * @Description: TODO
 **/
/*@Controller
@ResponseBody*/
@RestController
public class HelloControllerQuick {
	Logger logger = LoggerFactory.getLogger(HelloControllerQuick.class);

	@RequestMapping("/hello")
	public String hello(){
		//日志优先级从低到高 可以通过application.properties配置logging.level.com.zyk=trace
		logger.trace("这是trace信息");
		logger.debug("这是debug信息");
		logger.info("这是info信息");
		logger.warn("这是warn信息");
		logger.error("这是error信息");

		logger.info("这是info日志");
		return "Hello World Quick";
	}



}
