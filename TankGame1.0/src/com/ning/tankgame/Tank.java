package com.ning.tankgame;

public class Tank {
    private int x;
    private int y;
    private int direct;
    private int speed = 5;
    boolean isLive = true;

    public Tank(int x, int y, int direct) {
        this.x = x;
        this.y = y;
        this.direct = direct;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void moveUp() {
        if (getY() >= 0) y = y - speed;
    }

    public void moveDown() {
        // 如果对象当前的 Y 坐标小于等于 630（屏幕的高度），则将 Y 坐标增加 speed（速度）
        if (getY() <= 630) {
            y = y + speed;
        }
    }

    public void moveRight() {
        if (getX() <= 910) x = x + speed;
    }

    public void moveLeft() {
        if (getX() >= 0) x = x - speed;
    }


    public int getDirect() {
        return direct;
    }

    public void setDirect(int direct) {
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
}
