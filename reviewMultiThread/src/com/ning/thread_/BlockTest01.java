package com.ning.thread_;

import org.junit.jupiter.api.Test;
//初看之下，大家可能会觉得线程a会先调用同步方法，同步方法内又调用了Thread.sleep()方法，
// 必然会输出TIMED_WAITING，而线程b因为等待线程a释放锁所以必然会输出BLOCKED。
//
//其实不然，有两点需要值得大家注意，一是在测试方法blockedTest()内还有一个main线程，二
// 是启动线程后执行run方法还是需要消耗一定时间的。不打断点的情况下，上面代码中都应该输出RUNNABLE。

//测试方法的main线程只保证了a，b两个线程调用start()方法（转化为RUNNABLE状态），
// 还没等两个线程真正开始争夺锁，就已经打印此时两个线程的状态（RUNNABLE）了。
public class BlockTest01 {
    @Test
    public void blockedTest01() throws InterruptedException {

        Thread a = new Thread(() -> testMethod(), "a");
        Thread b = new Thread(() -> testMethod(), "b");

        a.start();
//        Thread.sleep(1000L);  //此时输出：a:TIMED_WAITING  b:BLOCKED
        b.start();
        // 不管加不加断点，b的run（）都不执行
        //因为a的testMethod执行后，开始sleep，进入TIME_WAITING，b被BLOCKED
        //而非断点时，JVM启用线程，但操作系统没启用，所以虽然显示RUNNABLE，但是本质还是有断点的情况

//        a.start();
//        a.join();
//        b.start();

        System.out.println(a.getName() + ":" + a.getState()); // 输出？
        System.out.println(b.getName() + ":" + b.getState()); // 输出？
    }

    // 同步方法争夺锁
    private synchronized void testMethod() {
        try {
//            System.out.println(Thread.currentThread().getName() +  "被执行");
            Thread.sleep(2000L);
            System.out.println(Thread.currentThread().getName() +  "被执行");
        } catch (InterruptedException e) {
            e.printStackTrace();
            //a:RUNNABLE
            //b:RUNNABLE
            //a
            //b
            //不加断点时，输出如下，说明此时testMethod没有被调用
        }
    }
}
