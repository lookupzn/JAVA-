package com.chapter17.thread_;

public class Thread03 {
    public static void main(String[] args) {
        //俩线程/
        //1. 10次helloworld -> extend Thread
        //2. 5次hi -> implements Runnable
        Hello hello = new Hello();
        hello.start();
        Hi hi = new Hi();
        Thread thread = new Thread(hi);
        thread.start();
    }
}

class Hello extends Thread{
    int times = 0;

    @Override
    public void run() {
        do {
            ++times;
            System.out.println("HelloWorld");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } while (times != 10);
    }
}

class Hi implements Runnable{
    int times = 0;
    @Override
    public void run() {
        do {
            ++times;
            System.out.println("Hi");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } while (times != 5);
    }
}

