package com.chapter17.homework_;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

public class H01 {



    public static void main(String[] args) {
        A a = new A();
        A a1 = new A();
        a.start();
        a1.start();

    }

}

class A extends Thread {
    // 循环随机打印100内整数
    private boolean loop = true;

    @Override
    public void run() {
        while (loop) {

            Random r = new Random();
            System.out.println(Thread.currentThread().getName() + ":" + r.nextInt(100));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public boolean isLoop() {
        return loop;
    }

    public void setLoop(boolean loop) {
        this.loop = loop;
    }

}

class B extends A implements Runnable {

    private A a;



    public B(A a) {
        this.a = a;
    }

    @Override
    public void run() {
        while (true) {
            System.out.println("Thread 01 被调用");
            break;
        }
    }


}