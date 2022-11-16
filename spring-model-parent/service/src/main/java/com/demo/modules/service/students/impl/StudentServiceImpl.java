package com.demo.modules.service.students.impl;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.demo.modules.dao.StudentDao;
import com.demo.modules.entity.Student;
import com.demo.modules.service.students.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName: StudentServiceImpl
 * @Date: Created in 2022/11/11 16:14
 * @Version: 1.0
 * @Author: zhengyongkai
 * @Modified By:
 * @Description: TODO
 **/

@Service
public class StudentServiceImpl implements StudentService {

    private StudentDao studentDao;

    @Resource
    public void setStudentDao(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    @Override
    public void studentServiceTest() {
        System.out.println("显示...");
        System.out.println("进入StudentServiceImpl.java的studentServiceTest方法");
    }

    @Override
    public void getAllStudent() {
        System.out.println("getAllStudent()......");
        QueryWrapper<Student> qw = new QueryWrapper<>();
        List<Student> students = studentDao.selectList(qw);
        System.out.println("students.size():"+students.size());
        System.out.println("getAllStudent()结束");

        try {
            List<Student> students1 = studentDao.selectAllStudent();
            System.out.println("students1.size():"+students1.size());
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("出现异常了");
        }
    }
}
