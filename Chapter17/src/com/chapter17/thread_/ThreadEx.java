package com.chapter17.thread_;

public class ThreadEx {
    public static void main(String[] args) throws InterruptedException {
        Box boxDaemon = new Box();
        Thread box = new Thread(boxDaemon);
        System.out.println(box.getName() + " 状态 " + box.getState());
        box.setDaemon(true);

        for(int i = 0;i <= 20;i++)
        {
            Thread.sleep(100);
            System.out.println("剩余票数：" + (20 - i));
            System.out.println(box.getName() + " 状态 " + box.getState());
        }
//        box.join();
        System.out.println(box.getName() + " 状态 " + box.getState());
        for(int i = 0;i <= 30;i++)
        {
            Thread.sleep(100);
            System.out.println("剩余票数：" + (30 - i));
        }
//        new Thread (new Box(100)).start();
//        new Thread (new Box(200)).start();
//        new Thread (new Box(300)).start();




    }
}

class Box implements Runnable{
    int ticketNum = 100;
    private long speed;

    public Box(long speed) {
        this.speed = speed;
    }

    public Box() {
    }

    public long getSpeed() {
        return speed;
    }

    public void setSpeed(long speed) {
        this.speed = speed;
    }

    @Override
    public void run() {
        do {
//            ticketNum--;
//            System.out.println("监视");
            try {
                Thread.sleep(speed);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("票卖完了" + Thread.currentThread().getState());
        } while (true);

    }
}
