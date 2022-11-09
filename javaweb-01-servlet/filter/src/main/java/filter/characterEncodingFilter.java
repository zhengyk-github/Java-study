package filter;

import javax.servlet.*;
import java.io.IOException;

/**
 * @ClassName: characterEncodingFilter
 * @Date: Created in 2022/11/9 9:17
 * @Version: 1.0
 * @Author: zhengyongkai
 * @Modified By:
 * @Description: 过滤器
 **/
public class characterEncodingFilter implements Filter {


    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("进入init初始化方法");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("进入doFilter过滤方法");
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=UTF-8");
        System.out.println("characterEncodingFilter过滤前");
        filterChain.doFilter(request,response);
        System.out.println("characterEncodingFilter过滤后");

    }

    @Override
    public void destroy() {
        System.out.println("进入destroy销毁方法");
    }
}
