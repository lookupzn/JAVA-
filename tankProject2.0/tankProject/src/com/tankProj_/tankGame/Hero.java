package com.tankProj_.tankGame;

public class Hero extends Tank {
    public Hero(int x, int y) {
        super(x, y);
    }

    //真正触发按J射击行为 - hero

    //定义一个Shot对象
    Shot shot = null;

    public void shotEnemy(){
        //要根据坦克hero方向坐标创建shot
        switch (getDirect()){
            case 0://up
                shot = new Shot(getX()+20,getY(),0);
                break;
            case 1://right
                shot = new Shot(getX()+60,getY() +  20 ,1);
                break;
            case 2://down
                shot = new Shot(getX()+20,getY()  + 60,2);
                break;
            case 3://left
                shot = new Shot(getX(),getY()  + 20,3);
                break;
        }
        //启动Shot线程
        new Thread(shot).start();
    }
}
