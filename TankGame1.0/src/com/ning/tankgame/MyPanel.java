package com.ning.tankgame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Iterator;

//tankGame绘图区域
//为实现监听键盘事件功能 implements keyListener
//为了让Panel不停重绘子弹，需要使MyPanel实现Runnable接口
public class MyPanel extends JPanel implements KeyListener, Runnable {
    Hero hero;
    ArrayList<Enemy> enemies = new ArrayList<>(4);
    Enemy ghost = null;

    int enemyTankSize = 3;
    int distance = 200;
    ArrayList<Bomb> bombs = new ArrayList<>();
    //定义三张爆炸图片显示爆炸效果
    Image i1, i2, i3;

    //什么时候加炸弹：当子弹击中坦克时就加入一个bomb对象到bombs


    public MyPanel() {
        hero = new Hero(700, 100, 1);//初始化自己坦克
        hero.setBulletSet(5);

        for (int i = 0; i < enemyTankSize; i++) {
            enemies.add(new Enemy(100 + distance * i, 500, 0));
            //加入一颗子弹
            Shot shot = new Shot(enemies.get(i).getX() + 20, enemies.get(i).getY() + 60, enemies.get(i).getDirect());
            //加入Enemy的集合成员
            enemies.get(i).shots.add(shot);
            new Thread(shot).start();

        }

        enemies.forEach(enemy -> new Thread(enemy).start());

        //初始化图片
        i1 = Toolkit.getDefaultToolkit().getImage(Panel.class.getResource("/bomb_3.gif"));
        i2 = Toolkit.getDefaultToolkit().getImage(Panel.class.getResource("/bomb_2.gif"));
        i3 = Toolkit.getDefaultToolkit().getImage(Panel.class.getResource("/bomb_1.gif"));
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillRect(0, 0, 1000, 750);//填充矩形，默认为黑色
        if (hero != null &&  hero.isLive) {
            drawTank(hero.getX(), hero.getY(), g, hero.getDirect(), 0);
        }
        for (Enemy enemy : enemies) {
            if (enemy.isLive) {
                drawTank(enemy.getX(), enemy.getY(), g, enemy.getDirect(), 1);
            }
        }

        Iterator<Shot> iterator2 = hero.shots.iterator();
        while (iterator2.hasNext()) {
            Shot shot1 = iterator2.next();
            if ((shot1 != null && shot1.isLive)) {//
                g.fill3DRect(shot1.getX(), shot1.getY(), 3, 3, false);
            } else {
                iterator2.remove();
            }
        }

        //给敌人坦克添加子弹

        //画出子弹
        //Hero的Shot对象不为空
        //子弹存在条件判断

        //bombs有对象则画出
        Iterator<Bomb> iterator = bombs.iterator();
        while (iterator.hasNext()) {
            Bomb bomb = iterator.next();
            if (bomb.life > 6) {
                g.drawImage(i1, bomb.x, bomb.y, 60, 60, this);
            } else if (bomb.life > 3) {
                g.drawImage(i2, bomb.x, bomb.y, 60, 60, this);
            } else {
                g.drawImage(i3, bomb.x, bomb.y, 60, 60, this);
            }
            // 让炸弹生命减少
            bomb.lifeDown();
            // life = 0，就从 bombs 把该 bomb 删除
            if (bomb.life == 0) {
                enemies.removeIf(enemy -> {
                    return bomb.isLive && bomb.x == enemy.getX() && bomb.y == enemy.getY();
                });
                iterator.remove(); // 删除 bomb
            }
        }


        for (int j = 0; j < enemies.size(); j++) {
            Enemy enemy = enemies.get(j);
            Iterator<Shot> iterator1 = enemy.shots.iterator();
            while (iterator1.hasNext()) {
                Shot shot = iterator1.next();
                if (shot != null && shot.isLive) {
                    g.fill3DRect(shot.getX(), shot.getY(), 3, 3, false);
                } else {
                    iterator1.remove();
                }
            }
        }

    }

    //drawTank（）方法

    /**
     * @param x      坦克左上角横坐标
     * @param y      坦克左上角纵坐标
     * @param g      画笔
     * @param direct 坦克方向
     * @param type   坦克类型
     */
    public void drawTank(int x, int y, Graphics g, int direct, int type) {
        switch (type) {
            case 0://设置自己的坦克
                g.setColor(Color.cyan);
                break;
            case 1:
                g.setColor(Color.yellow);
                break;
        }

        switch (direct) {
            case 0://向上方向
                tankBodyUpright(x, y, g);
                g.fill3DRect(x + 20, y, 1, 30, false);//炮筒
                break;
            case 1://下
                tankBodyUpright(x, y, g);
                g.fill3DRect(x + 20, y + 30, 1, 30, false);//炮筒
                break;
            case 2://左
                tankBodyHorizontal(x, y, g);
                g.fill3DRect(x, y + 20, 30, 1, false);//炮筒
                break;
            case 3://右
                tankBodyHorizontal(x, y, g);
                g.fill3DRect(x + 30, y + 20, 30, 1, false);//炮筒
                break;
            default:
                System.out.println("暂时未处理");
        }
    }

    public void tankBodyHorizontal(int x, int y, Graphics g) {
        g.fill3DRect(x, y, 60, 10, false);
        g.fill3DRect(x, y + 30, 60, 10, false);//轮子
        g.fill3DRect(x + 10, y + 10, 40, 20, false);//底盘
        g.fillOval(x + 20, y + 10, 20, 20);//炮塔
    }

    public void tankBodyUpright(int x, int y, Graphics g) {
        g.fill3DRect(x, y, 10, 60, false);
        g.fill3DRect(x + 30, y, 10, 60, false);//轮子
        g.fill3DRect(x + 10, y + 10, 20, 40, false);//底盘
        g.fillOval(x + 10, y + 20, 20, 20);//炮塔
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    //处理wdsa键位按下的情况
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_W) {
            hero.setDirect(0);
            hero.moveUp();
        } else if (e.getKeyCode() == KeyEvent.VK_S) {
            hero.setDirect(1);
            hero.moveDown();
        } else if (e.getKeyCode() == KeyEvent.VK_A) {
            hero.setDirect(2);
            hero.moveLeft();
        } else if (e.getKeyCode() == KeyEvent.VK_D) {
            hero.setDirect(3);
            hero.moveRight();
        }

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
                Thread.sleep(50);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            //判断是否击中坦克

            if (hero.shot != null && hero.shot.isLive) {
                //遍历敌人所有坦克
                enemies.forEach(enemy -> hitTank(hero.shot, enemy));
            }
            hitEnemy();
            hitHero();
            this.repaint();
        }
    }

    public synchronized void hitEnemy() {
        Iterator<Shot> iterator = hero.shots.iterator();
        while (iterator.hasNext()) {
            Shot next = iterator.next();
            if (next != null && next.isLive) {
                //遍历敌人坦克
                enemies.forEach(enemy -> hitTank(next, enemy));
            }
        }

    }

    //判断子弹是否击中坦克
    // 什么时候判断，持续判断，放到run方法中
    public synchronized void hitTank(Shot s, Tank tank) {
        //判断s 击中坦克
        switch (tank.getDirect()) {
            case 0:
            case 1:
                if ((s.getX() >= tank.getX() && s.getX() <= tank.getX() + 40) && (s.getY() >= tank.getY() && s.getY() <= s.getY() + 60)) {
                    s.isLive = false;
                    tank.isLive = false;
                    //创建Bomb对象，加入bombs集合
                    Bomb bomb = new Bomb(tank.getX(), tank.getY());
                    bombs.add(bomb);

                }
                break;
            case 2:
            case 3:
                if ((s.getY() >= tank.getY() && s.getY() <= tank.getY() + 40) && (s.getX() >= tank.getX() && s.getX() <= s.getX() + 60)) {
                    s.isLive = false;
                    tank.isLive = false;
                    //创建Bomb对象，加入bombs集合
                    Bomb bomb = new Bomb(tank.getX(), tank.getY());
                    bombs.add(bomb);
                }
                break;
        }
    }

    public synchronized void hitHero() {
        for (Enemy enemy : enemies) {
            for (Shot shot : enemy.shots) {
                //取出子弹,判断是否击中
                if (hero.isLive && shot.isLive) {
                    hitTank(shot, hero);
                }
            }
        }
    }
}
