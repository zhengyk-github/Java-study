package com.spring;

import org.apache.catalina.core.ApplicationContext;

import java.io.File;
import java.net.URL;

/**
 * @ClassName: ZykApplicationContext
 * @Date: Created in 2022/9/21 20:49
 * @Version: 1.0
 * @Author: zhengyongkai
 * @Modified By:
 * @Description: TODO
 **/
public class ZykApplicationContext {

    private Class configClass;

    public ZykApplicationContext(Class configClass) {
        this.configClass = configClass;
        //解析配置类
        //ComponentScan注解-->扫描路径-->扫描
        ComponentScan componentScanAnnotation = (ComponentScan) configClass.getDeclaredAnnotation(ComponentScan.class);
        String path = componentScanAnnotation.value();//扫描路径
        System.out.println("path:"+path);
        //扫描 包下的类
        //Bootstrap -->jre/lib
        //Ext -->jre/ext/lib
        //App -->calsspath
        ClassLoader classLoader = ZykApplicationContext.class.getClassLoader(); //App 应用类加载器
        URL resource = classLoader.getResource("com/zyk/service");
        File file = new File(resource.getFile());
        System.out.println(file.isDirectory());

        if (file.isDirectory()) {
            File[] files = file.listFiles();
            for (File f : files) {
                System.out.println(f);
            }
        }


    }

    public ZykApplicationContext() {

    }


    public Object getBean(String beanName) {
        return null;
    }
}
