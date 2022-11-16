package com.demo.modules.entrance;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @ClassName: EntranceApplication
 * @Date: Created in 2022/11/11 10:10
 * @Version: 1.0
 * @Author: zhengyongkai
 * @Modified By:
 * @Description: TODO
 **/
@SpringBootApplication
@ComponentScan(value = "com.demo.modules")
@MapperScan(basePackages = "com.demo.modules.dao")
public class EntranceApplication {
    public static void main(String[] args) {
        SpringApplication.run(EntranceApplication.class, args);
    }
}
