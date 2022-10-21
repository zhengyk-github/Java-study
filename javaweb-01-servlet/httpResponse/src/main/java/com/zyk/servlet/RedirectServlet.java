package com.zyk.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @ClassName: RedirectServlet
 * @Date: Created in 2022/10/11 16:48
 * @Version: 1.0
 * @Author: zhengyongkai
 * @Modified By:
 * @Description: 重定向
 **/
public class RedirectServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("req.getContextPath():"+req.getContextPath());//获取当前项目路径  req.getContextPath():/r
        resp.sendRedirect(req.getContextPath()+"/image");


    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
