package com.ning.tankgame;
/*
1. 当发射一颗子弹时，相当于启动一个线程
*/

public class Shot implements Runnable {
    int x;// 子弹x坐标
    int y;// 子弹y坐标
    int direct = 0;// 子弹方向
    int speed = 5;//子弹速度
    boolean isLive = true;

    public Shot(int x, int y, int direct) {
        this.x = x;
        this.y = y;
        this.direct = direct;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getDirect() {
        return direct;
    }

    public void setDirect(int direct) {
        this.direct = direct;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public void run() {//射击行为

        while (isLive) {

            //让线程休眠 50 ms
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            switch (direct) {
                case 0:
                    y -= speed;
                    break;
                case 1:
                    y += speed;
                    break;
                case 2:
                    x -= speed;
                    break;
                case 3:
                    x += speed;
                    break;
            }
            //当子弹移动到面板边界和敌人坦克时都应该结束线程
            if (!(x >= 0 && x <= 1000 && y >= 0 && y <= 750 && isLive))  {
               isLive = false;
            }
        }
    }
}
