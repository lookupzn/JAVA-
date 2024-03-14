package com.ning.tankgame;

import java.util.ArrayList;

public class Hero extends Tank{
    public Hero(int x, int y,int direct) {
        super(x, y, direct);

    }

    Shot shot = null;
    private int bulletSet;

    public int getBulletSet() {
        return bulletSet;
    }

    public void setBulletSet(int bulletSet) {
        this.bulletSet = bulletSet;
    }

    ArrayList<Shot> shots = new ArrayList<>();

    public void shotEnemy()
    {

        //子弹数量 《= 5
        if(shots.size() > bulletSet)
            return;
        //2. 创建Shot对象，根据当前hero对象的方向来创建Shot
        switch (getDirect())
        {
            case 0:
                shot = new Shot(getX()+20 , getY(),0);
                break;
            case 1:
                shot = new Shot(getX()+20 , getY() + 60,1);
                break;
            case 2:
                shot = new Shot(getX() , getY() + 20,2);
                break;
            case 3:
                shot = new Shot(getX() + 60 , getY() + 20,3);
                break;
        }


        shots.add(shot);
        //启动线程
        new Thread(shot).start();
    }

}
