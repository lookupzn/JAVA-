package com.chapter09.designPattern.single_;

public class Template01 {
    public static void main(String[] args) {
        JobA jobA = new JobA();
        jobA.timeCal();

    }
}
//抽象类，提供抽象方法work，并提供计算模式

abstract class JobSummary {
    abstract public void work();

    public void timeCal() {
        long start = System.currentTimeMillis();
        work();
        //动态绑定机制
        //得的结束的时间
        long end = System.currentTimeMillis();
        System.out.println("任务执行时间 :" + (end - start) + "秒");
    }
}

class JobA extends JobSummary {

    @Override
    public void work() {
        long num = 0;

        for (long a = 0; a < 800000; a++) {
            num *= a;
        }

    }


}
