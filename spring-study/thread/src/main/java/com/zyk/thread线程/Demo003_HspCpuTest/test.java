package com.zyk.thread线程.Demo003_HspCpuTest;

public class test {
//使用cmd命令行来执行编译后的java文件 javac -encoding UTF-8 test.java         java test  
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        //获取当前电脑的cpu数量
        int cpuNums = runtime.availableProcessors();
        System.out.println("当前电脑的cpu数量cpuNums = " + cpuNums);
    }
}
