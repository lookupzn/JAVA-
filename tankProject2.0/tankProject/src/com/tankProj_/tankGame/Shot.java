package com.tankProj_.tankGame;

public class Shot implements Runnable{
    int x;
    int y;//炮弹坐标
    int direct = 0;//炮弹方向
    int speed = 10;//射击速度
    boolean isLive = true;//子弹是否被销毁
    public Shot(int x, int y, int direct) {
        this.x = x;
        this.y = y;
        this.direct = direct;
    }

    @Override
    public void run() {
        while (isLive){
            //子弹需要线程休眠达到动态效果
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            // 根据方向来改变坐标xy值
            switch (direct)
            {
                case 0:
                    y -= speed;
                    break;
                case 1:
                    x += speed;
                    break;
                case 2:
                    y += speed;
                    break;
                case 3:
                    x -= speed;
                    break;
            }
            //测试一下
//            System.out.println("x = " + x + "y = " + y);
            //炮弹到边界销毁子弹
            if(!(x >= 0 && x <=1000 && y>=0 && y<= 750 && isLive))
            {
                isLive = false;
            }
        }
    }
}
