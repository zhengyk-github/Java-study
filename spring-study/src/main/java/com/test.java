package com;

import com.spring.ZykApplicationContext;

/**
 * @ClassName: test
 * @Date: Created in 2022/9/21 20:48
 * @Version: 1.0
 * @Author: zhengyongkai
 * @Modified By:
 * @Description: TODO
 **/
public class test {
    public static void main(String[] args) {
        ZykApplicationContext zykApplicationContext = new ZykApplicationContext(AppConfig.class);
        Object userService = zykApplicationContext.getBean("UserService");



    }
}
