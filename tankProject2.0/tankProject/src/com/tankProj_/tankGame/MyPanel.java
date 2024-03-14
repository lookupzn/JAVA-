package com.tankProj_.tankGame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Vector;

public class MyPanel extends JPanel implements KeyListener, Runnable {
    //定义我的坦克
    Hero hero = null;
    Vector<Bomb> bombs = new Vector<>();
    //定义三张爆炸图片，用于显示爆炸
    //当子弹击中坦克，bombs添加一个Bomb对象
    Image image1 = null;
    Image image2 = null;
    Image image3 = null;
    Vector<Enemy> enemies = new Vector<>();
    int enemyTankSize = 3;


    public MyPanel() {
        hero = new Hero(500, 600);//初始化自己坦克
        image1 = Toolkit.getDefaultToolkit().getImage(Panel.class.getResource("/bomb_1.gif"));
        image2 = Toolkit.getDefaultToolkit().getImage(Panel.class.getResource("/bomb_2.gif"));
        image3 = Toolkit.getDefaultToolkit().getImage(Panel.class.getResource("/bomb_3.gif"));
        for (int i = 0; i < enemyTankSize; i++) {
            //创建一个敌人的坦克
            Enemy enemy = new Enemy((100 * (i + 1)), 0);
            //设置方向
            enemy.setDirect(2);
            //启动敌人坦克线程，让他动起来
            new Thread(enemy).start();
            //给该enemyTank 加入一颗子弹
            Shot shot = new Shot(enemy.getX() + 20, enemy.getY() + 60, enemy.getDirect());
            //加入enemyTank的Vector 成员
            enemy.shots.add(shot);
            //启动 shot 对象
            new Thread(shot).start();
            //加入
            enemies.add(enemy);
        }

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
        //画出敌人的坦克, 遍历Vector
        for (int i = 0; i < enemies.size(); i++) {
            //从Vector 取出坦克
            Enemy enemy = enemies.get(i);
            //判断当前坦克是否还存活
            if (enemy.isLive) {//当敌人坦克是存活的，才画出该坦克
                drawTank(enemy.getX(), enemy.getY(), g, enemy.getDirect(), 1);
                //画出 enemyTank 所有子弹
                for (int j = 0; j < enemy.shots.size(); j++) {
                    //取出子弹
                    Shot shot = enemy.shots.get(j);
                    //绘制
                    if (shot.isLive) { //isLive == true
                        g.draw3DRect(shot.x, shot.y, 1, 1, false);
                    } else {
                        //从Vector 移除
                        enemy.shots.remove(shot);
                    }
                }
            }
        }

        if (hero.shot != null && hero.shot.isLive != false) {
            //子弹没有被销毁且不为空
            //为了让子弹不停重画，要将MyPanel做成线程
            g.fill3DRect(hero.shot.x, hero.shot.y, 3, 3, false);


        }
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
            case 2: //表示向上
                tankBodyUpDown(x, y, g);

                g.drawLine(x + 20, y + 30, x + 20, y + 60);//画出炮筒
                break;
            case 0:
                tankBodyUpDown(x, y, g);
                g.drawLine(x + 20, y + 30, x + 20, y);
                break;
            case 1:
                tankBodyLeftRight(x, y, g);
                g.drawLine(x + 30, y + 20, x + 60, y + 20);//画出炮筒
                break;
            case 3:
                tankBodyLeftRight(x, y, g);
                g.drawLine(x + 30, y + 20, x, y + 20);
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

    //编写坦克摧毁的代码
    public void hitTank(Shot s, Enemy enemyTank) {
        //判断s 击中坦克
        switch (enemyTank.getDirect()) {
            case 1: //坦克向上
            case 3: //坦克向下
                if (s.x > enemyTank.getX() && s.x < enemyTank.getX() + 40
                        && s.y > enemyTank.getY() && s.y < enemyTank.getY() + 60) {
                    s.isLive = false;
                    enemyTank.isLive = false;
                    //当我的子弹击中敌人坦克后，将enemyTank 从Vector 拿掉
                    enemies.remove(enemyTank);
                }
                break;
            case 0: //坦克向右
            case 2: //坦克向左
                if (s.x > enemyTank.getX() && s.x < enemyTank.getX() + 60
                        && s.y > enemyTank.getY() && s.y < enemyTank.getY() + 40) {
                    s.isLive = false;
                    enemyTank.isLive = false;
                    enemies.remove(enemyTank);

                }
                break;
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println(e.getKeyCode());
        if (e.getKeyCode() == KeyEvent.VK_W) {//按下 W 键
            //改变坦克的方向
            hero.setDirect(0);//
            //修改坦克的坐标 y -= 1s
            hero.moveUp();
        } else if (e.getKeyCode() == KeyEvent.VK_D) {//D 键, 向右
            hero.setDirect(1);
            hero.moveRight();
        } else if (e.getKeyCode() == KeyEvent.VK_S) {//S 键
            hero.setDirect(2);
            hero.moveDown();
        } else if (e.getKeyCode() == KeyEvent.VK_A) {//A 键
            hero.setDirect(3);
            hero.moveLeft();
        }
        //让面板重绘
        if (e.getKeyCode() == KeyEvent.VK_J) {
            hero.shotEnemy();
        }
        this.repaint();


    }

    @Override
    public void keyReleased(KeyEvent e) {

    }


    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (hero.shot != null && hero.shot.isLive != false) {
                for (int i = 0; i < enemies.size(); i++) {
                    hitTank(hero.shot,enemies.get(i));
                }
            }
            this.repaint();
        }
    }
}


