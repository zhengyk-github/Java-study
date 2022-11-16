package listener;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * @ClassName: OnlineCountListener
 * @Date: Created in 2022/11/9 10:32
 * @Version: 1.0
 * @Author: zhengyongkai
 * @Modified By:
 * @Description: 监听器
 **/
public class OnlineCountListener implements HttpSessionListener {
    //创建一个Session就会触发这个事件
    @Override
    public void sessionCreated(HttpSessionEvent se) {
        ServletContext ctx = se.getSession().getServletContext();
        Integer onlineCount = (Integer) ctx.getAttribute("OnlineCount");
        if (onlineCount == null) {
            onlineCount = new Integer(1);
        } else {
            int count = onlineCount.intValue();
            onlineCount = new Integer(count + 1);
        }
        ctx.setAttribute("onlineCount", onlineCount);
    }

    //销毁一个Session就会触发这个事件
    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        {
            ServletContext ctx = se.getSession().getServletContext();
            Integer onlineCount = (Integer) ctx.getAttribute("OnlineCount");
            if (onlineCount == null) {
                onlineCount = new Integer(0);
            } else {
                int count = onlineCount.intValue();
                onlineCount = new Integer(count - 1);
            }
            ctx.setAttribute("onlineCount", onlineCount);
        }
    }
}
