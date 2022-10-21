package com.zyk.servlet;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URLEncoder;

/**
 * @ClassName: FileServlet
 * @Date: Created in 2022/9/26 14:36
 * @Version: 1.0
 * @Author: zhengyongkai
 * @Modified By:
 * @Description: 文件下载
 **/
public class FileServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //String realPath = this.getServletContext().getRealPath("/1.png");
        String realPath ="D:\\Zyk-Java-Study\\Java-study\\javaweb-01-servlet\\httpResponse\\target\\classes\\1.png";
        System.out.println("文件的下载路径："+realPath);
        String fileName = realPath.substring(realPath.lastIndexOf("/") + 1);
        resp.setHeader("Content-Disposition","attachment;filename="+ URLEncoder.encode(fileName,"UTF-8"));
        FileInputStream in = new FileInputStream(realPath);
        int len = 0;
        byte[] buffer = new byte[1024];
        ServletOutputStream out = resp.getOutputStream();
        while((len=in.read(buffer))>0){
            out.write(buffer,0,len);
        }
        in.close();
        out.close();

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
