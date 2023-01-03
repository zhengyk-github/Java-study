package com.zyk.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @ClassName: com.zyk.servlet.HelloServlet
 * @Date: Created in 2022/12/20 16:10
 * @Version: 1.0
 * @Author: zhengyongkai
 * @Modified By:
 * @Description: TODO
 **/
public class HelloServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String parameter = req.getParameter("method");
		if("add".equals(parameter)){
			req.getSession().setAttribute("msg","执行add方法");
		}else if("delete".equals(parameter)){
			req.getSession().setAttribute("msg","执行delete方法");
		}
		req.getRequestDispatcher("/WEB-INF/jsp/test.jsp").forward(req,resp);

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
}
