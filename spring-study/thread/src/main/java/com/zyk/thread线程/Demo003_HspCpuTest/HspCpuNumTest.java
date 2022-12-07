package com.zyk.thread线程.Demo003_HspCpuTest;

/**
 * @ClassName: HspCpuNumTest
 * @Date: Created in 2022/7/29 9:29
 * @Version: 1.0
 * @Author: zhengyongkai
 * @Modified By:
 * @Description: 韩顺平 cpu测试 获取当前电脑的cpu数量
 **/
//链接 02_并发并行 https://www.bilibili.com/video/BV1zB4y1A7rb?p=2&spm_id_from=pageDriver&vd_source=2098b2d038738a1989d69e4e4c2f2621
public class HspCpuNumTest {

    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        //获取当前电脑的cpu数量
        int cpuNums = runtime.availableProcessors();
        System.out.println("当前电脑的cpu数量cpuNums = " + cpuNums);
    }
}
