package com.zyk.thread线程;

/**
 * @ClassName: Testtest
 * @Date: Created in 2022/8/22 10:02
 * @Version: 1.0
 * @Author: zhengyongkai
 * @Modified By:
 * @Description: TODO
 **/
public class Testtest {

    public static void main(String[] args) {
        String cxywqx = ""; //指定属性
        if (cxywqx.contains("f")) {
            System.out.println("包含f");
        }
        if (!cxywqx.contains("f")||"".equals(cxywqx)) {
            System.out.println("不包含f");
        }

        System.out.println("结束");

    }
}
