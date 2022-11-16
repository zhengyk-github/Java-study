package listener;

import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

/**
 * @ClassName: testPanel
 * @Date: Created in 2022/11/9 16:34
 * @Version: 1.0
 * @Author: zhengyongkai
 * @Modified By:
 * @Description: TODO
 **/
public class testPanel {
    public static void main(String[] args) {
        Frame frame = new Frame("中秋节快乐");//新建一个窗体
        Panel panel = new Panel(null);//面板
        frame.setLayout(null);//设置窗体的布局

        frame.setBounds(300,300,500,500);
        frame.setBackground(new Color(0,0,255));//设置背景颜色

        panel.setBounds(50,50,300,300);
        panel.setBackground(new Color(0,255,0));

        frame.add(panel);
        frame.setVisible(true);

        frame.addWindowListener(new WindowListener() {
            @Override
            public void windowOpened(WindowEvent e) {
                
            }

            @Override
            public void windowClosing(WindowEvent e) {

            }

            @Override
            public void windowClosed(WindowEvent e) {

            }

            @Override
            public void windowIconified(WindowEvent e) {

            }

            @Override
            public void windowDeiconified(WindowEvent e) {

            }

            @Override
            public void windowActivated(WindowEvent e) {

            }

            @Override
            public void windowDeactivated(WindowEvent e) {

            }
        });
    }
}
