package com.zyk.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * @ClassName: SessionDeom01
 * @Date: Created in 2022/10/13 14:57
 * @Version: 1.0
 * @Author: zhengyongkai
 * @Modified By:
 * @Description: 给session赋值
 **/
public class SessionDeom01 extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //解决乱码问题
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charset=utf-8");
        //得到session
        HttpSession session = req.getSession();
        //给session中存数据
        session.setAttribute("name", "郑永凯");
        //获取session的id
        String sessionId = session.getId();

        //判断session是否是新建
        if (session.isNew()) {
            resp.getWriter().write("session新建成功，ID:" + sessionId);
        } else {
            resp.getWriter().write("session已存在，ID:" + sessionId);
        }

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
