package com.ning.thread_;

public class ObjectLock {
    private static Object lock = new Object();  // 定义一个对象锁，对象锁的名字为lock，类型为Object

    static class ThreadA implements Runnable {
        @Override
        public void run() {
            synchronized (lock) {
                for (int i = 0; i < 100; i++) {
                    System.out.println("Thread A " + i);
                }
            }
        }
    }

    static class ThreadB implements Runnable {
        @Override
        public void run() {
            synchronized (lock) {
                for (int i = 0; i < 100; i++) {
                    System.out.println("Thread B " + i);
                }
            }
        }
    }

    //这里声明了一个名字为lock的对象锁。我们在ThreadA和ThreadB内需要同步的代码块里，
    // 都是用synchronized关键字加上了同一个对象锁lock。
    //根据线程和锁的关系，同一时间只有一个线程持有一个锁，
    // 那么线程B就会等线程A执行完成后释放lock，线程B才能获得锁lock。
    public static void main(String[] args) throws InterruptedException {
        new Thread(new ThreadA()).start();
        Thread.sleep(10);
        new Thread(new ThreadB()).start();
    }
}