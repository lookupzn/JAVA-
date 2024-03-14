package com.tankProj_.tankGame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Vector;

public class MyPanel extends JPanel implements KeyListener {
    //定义我的坦克
    Hero hero = null;
    Vector<Enemy> enemies = new Vector<>();
    Enemy enemy = null;  //不能加null到Vector
    Enemy enemy1 = null;
    Enemy enemy2 = null;




    public MyPanel() {
        hero = new Hero(100, 100);//初始化自己坦克
        enemy = new Enemy(600, 600);
        enemy1 = new Enemy(450, 600);
        enemy2 = new Enemy(300, 600);
        enemies.add(enemy);
        enemies.add(enemy1);
        enemies.add(enemy2);

        /*
        for (int i = 0; i < enemyTankSize;
        //创建一个敌人的坦克
        EnemyTank enemyTank = new EnemyTank((100 * (i + 1)), 0);
        //设置方向
        enemyTank.setDirect(2);
        //加入
        enemyTanks.add(enemyTank);
        * */
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillRect(0, 0, 1000, 900);//填充矩形，默认黑色
        //画出坦克-封装方法
        drawTank(hero.getX(), hero.getY(), g, hero.getDirect(), 0);
        drawTank(enemy.getX(), enemy.getY(), g, 1, 1);
        drawTank(enemy1.getX(), enemy1.getY(), g, 1, 1);
        drawTank(enemy2.getX(), enemy2.getY(), g, 1, 1);
    }

    /**
     * @param x      坦克的左上角 x 坐标
     * @param y      坦克的左上角 y 坐标
     * @param g      画笔
     * @param direct 坦克方向（上下左右）
     * @param type   坦克类型
     */

    public void drawTank(int x, int y, Graphics g, int direct, int type) {
//根据不同类型坦克，设置不同颜色
        switch (type) {
            case 0: //我们的坦克
                g.setColor(Color.cyan);
                break;
            case 1: //敌人的坦克
                g.setColor(Color.yellow);
                break;
        }
        switch (direct) {
            case 0: //表示向上
                tankBodyUpDown(x, y, g);

                g.drawLine(x + 20, y + 30, x + 20, y + 60);//画出炮筒
                break;
            case 1:
                tankBodyUpDown(x, y, g);
                g.drawLine(x + 20, y + 30, x + 20, y);
                break;
            case 2:
                tankBodyLeftRight(x, y, g);
                g.drawLine(x + 30, y + 20, x + 60, y + 20);//画出炮筒
                break;
            case 3:
                tankBodyLeftRight(x, y, g);
                g.drawLine(x + 30,y + 20,x,y + 20);
                break;
            default:
                System.out.println("暂时没有处理");
        }
    }

    public void tankBodyLeftRight(int x, int y, Graphics g) {
        g.fill3DRect(x, y, 60, 10, false);//画出坦克上边轮子
        g.fill3DRect(x, y + 30, 60, 10, false);//画出坦克下边轮子
        g.fill3DRect(x + 10, y + 10, 40, 20, false);//画出坦克盖子
        g.fillOval(x + 20, y + 10, 20, 20);//画出圆形盖子

    }

    public void tankBodyUpDown(int x, int y, Graphics g) {
        g.fill3DRect(x, y, 10, 60, false);//画出坦克左边轮子
        g.fill3DRect(x + 30, y, 10, 60, false);//画出坦克右边轮子
        g.fill3DRect(x + 10, y + 10, 20, 40, false);//画出坦克盖子
        g.fillOval(x + 10, y + 20, 20, 20);//画出圆形盖子
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println(e.getKeyCode());
        if (e.getKeyCode() == KeyEvent.VK_W) {//按下 W 键
        //改变坦克的方向
            hero.setDirect(1);//
        //修改坦克的坐标 y -= 1s
            hero.moveUp();
        } else if (e.getKeyCode() == KeyEvent.VK_D) {//D 键, 向右
            hero.setDirect(2);
            hero.moveRight();
        } else if (e.getKeyCode() == KeyEvent.VK_S) {//S 键
            hero.setDirect(0);
            hero.moveDown();
        } else if (e.getKeyCode() == KeyEvent.VK_A) {//A 键
            hero.setDirect(3);
            hero.moveLeft();
        }
        //让面板重绘
        this.repaint();


        }

    @Override
    public void keyReleased(KeyEvent e) {

    }


}


