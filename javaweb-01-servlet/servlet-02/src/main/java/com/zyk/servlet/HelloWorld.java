package com.zyk.servlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @ClassName: HelloWorld
 * @Date: Created in 2022/9/25 21:39
 * @Version: 1.0
 * @Author: zhengyongkai
 * @Modified By:
 * @Description: TODO
 **/
public class HelloWorld extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        this.getInitParameter() //初始化参数
//        this.getServletConfig() //servlet配置
//        this.getServletContext() //servlet上下文

        //ServletContext:web容器在启动的时候，它会为每个web程序都创建一个对应的ServletContext对象，它代表了当前的web应用。
        // 共享数据 ：在这个Servlet中保存的数据，可以在另外一个servlet中拿到
        ServletContext context = this.getServletContext();
        context.setAttribute("username","郑永凯");

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
