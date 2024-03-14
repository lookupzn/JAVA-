package com.ning.tankgame;

import java.util.ArrayList;

public class Enemy extends Tank implements Runnable{

    public Enemy(int x, int y,int direct) {
        super(x, y, direct);
    }
    ArrayList<Shot> shots = new ArrayList<>();

    @Override
    public void run() {
        boolean loop = true;
        while (loop)
        {//   随机移动
            Shot s = null;
            if(isLive && shots.size() <= 3)
            {
                switch (getDirect())
                {
                    case 0:
                        s = new Shot(getX() + 20,getY(),0);
                        break;
                    case 1:
                        s = new Shot(getX() + 20,getY() + 60,1);
                        break;
                    case 2:
                        s = new Shot(getX(),getY() + 20,2);
                        break;
                    case 3:
                        s = new Shot(getX() + 60,getY() + 20,3);
                        break;
                }
                shots.add(s);
                new Thread(s).start();
            }
            switch (getDirect())
            {
                case 0:
                    for (int j = 0; j < 3; j++) {

                        try {moveUp();
                            Thread.sleep(300);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    break;

                case 1:
                    for (int i = 0; i < 3; i++) {

                        try {moveDown();
                            Thread.sleep(300);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    break;
                case 2:
                    for (int i = 0; i < 3; i++) {

                        try {moveLeft();
                            Thread.sleep(300);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    break;
                case 3:
                    for (int i = 0; i < 3; i++) {

                        try {
                            moveRight();
                            Thread.sleep(300);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    break;
            }
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }setDirect((int)(Math.random() * 4));
            //退出：
            //多线程一定要考虑什么时候退出（除了守护线程）
            if(!isLive)
                loop = false;
        }
    }
}
