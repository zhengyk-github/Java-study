package com.demo.modules.web01.controller;

import com.demo.modules.service.students.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: HelloWeb01Controller
 * @Date: Created in 2022/11/11 10:18
 * @Version: 1.0
 * @Author: zhengyongkai
 * @Modified By:
 * @Description: TODO
 **/
@Component
@RestController
public class HelloWeb01Controller {


    private StudentService studentService;

    @Autowired
    public void setStudentService(StudentService studentService) {
        this.studentService = studentService;
    }

    @RequestMapping(path = "/helloweb01")
    public String helloWeb01() {
        System.out.println("进入到方法里面");
        System.out.println("进入到helloWeb01()");
        //TestServiceImpl testService = new TestServiceImpl();
        //testService.testServiceFunction();


        System.out.println("进入studentServiceTest前");
        studentService.studentServiceTest();
        System.out.println("进入studentServiceTest后");
        return "helloWeb01";
    }

    @RequestMapping(path = "/getAllStudent")
    public void getAllStudent() {
        System.out.println("进入getAllStudent方法");
        studentService.getAllStudent();
        System.out.println("getAllStudent方法结束");
    }

}
