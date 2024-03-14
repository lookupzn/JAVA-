package com.ning.thread_;

public class Runnable_ {
    public static class MyThread implements Runnable {
        @Override
        public void run() {
            System.out.println("MyThread");
        }
    }

    public static void main(String[] args) {

        // Java 8 函数式编程，可以省略MyThread类
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Java 8 匿名内部类");
            }
        }).start();

//        new Thread(()->System.out.println("Java 8 函数式编程")).start();

        Thread myThread = new Thread(new MyThread());
        myThread.start();
    }
}
