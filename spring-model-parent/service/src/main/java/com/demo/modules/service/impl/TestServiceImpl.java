package com.demo.modules.service.impl;

import com.demo.modules.dao.TestDao;
import org.springframework.beans.factory.annotation.Autowired;
import com.demo.modules.service.TestService;
import com.demo.modules.utils.TestUtils;

/**
 * @ClassName: TestServiceImpl
 * @Date: Created in 2022/11/11 13:30
 * @Version: 1.0
 * @Author: zhengyongkai
 * @Modified By:
 * @Description: TODO
 **/

public class TestServiceImpl implements TestService {
    @Autowired
    private TestDao testDao;

    @Override
    public void testServiceFunction() {
        //testDao.testDaoFunction();

        System.out.println("我是service的方法testServiceFunction(),我处理业务逻辑。。。。。。");
        TestUtils.testUtils();
    }



}
