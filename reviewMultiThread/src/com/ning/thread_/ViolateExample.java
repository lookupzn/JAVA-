package com.ning.thread_;

public class ViolateExample {
    int a = 0;
    // volatile 关键字表示该变量可以被多个线程共享，但其值会被内存屏障强制更新到主内存中
    volatile boolean flag = false;

    public void writer() {
        a = 1; // step 1
        flag = true; // step 2
    }

    public void reader() {
        if (flag) { // step 3
            System.out.println(a); // step 4
        }
    }
}