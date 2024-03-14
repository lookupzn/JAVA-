package com.ning.threadgroup_;

import java.util.stream.IntStream;
import org.junit.jupiter.api.Test;

public class Priority01 {
    public static class T1 extends Thread {
        @Override
        public void run() {
            super.run();
            System.out.println(String.format("当前执行的线程是：%s，优先级：%d",
                    Thread.currentThread().getName(),
                    Thread.currentThread().getPriority()));
        }
    }



    @Test
    public void test_1() {
        ThreadGroup threadGroup = new ThreadGroup("t1");
        threadGroup.setMaxPriority(6);
        Thread thread = new Thread(threadGroup, "thread");
        thread.setPriority(9);
        System.out.println("我是线程组的优先级" + threadGroup.getMaxPriority());
        System.out.println("我是线程的优先级" + thread.getPriority());
        //我是线程组的优先级6
        //我是线程的优先级6
    }


    public static void main(String[] args) {
        IntStream.range(1, 10).forEach(i -> {
            Thread thread = new Thread(new T1());
            thread.setPriority(i);
            thread.start();

            /*输出结果：当前执行的线程是：Thread-9，优先级：5
            当前执行的线程是：Thread-17，优先级：9
            当前执行的线程是：Thread-3，优先级：2
            当前执行的线程是：Thread-13，优先级：7
            当前执行的线程是：Thread-11，优先级：6
            当前执行的线程是：Thread-5，优先级：3
            当前执行的线程是：Thread-15，优先级：8
            当前执行的线程是：Thread-1，优先级：1
            当前执行的线程是：Thread-7，优先级：4* */
        });
    }
}