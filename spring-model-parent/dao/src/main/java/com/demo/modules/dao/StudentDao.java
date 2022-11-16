package com.demo.modules.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.demo.modules.entity.Student;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @ClassName: StudentDao
 * @Date: Created in 2022/11/14 14:37
 * @Version: 1.0
 * @Author: zhengyongkai
 * @Modified By:
 * @Description: TODO
 **/
@Mapper
public interface StudentDao extends BaseMapper<Student> {

    List<Student> selectAllStudent();

}
