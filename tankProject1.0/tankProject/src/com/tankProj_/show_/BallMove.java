package com.tankProj_.show_;//演示小球通过键盘控制上下左右的移动-> 讲解 Java 的事件

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class BallMove extends JFrame {
    MyyPanel mmp = null;

    public static void main(String[] args) {
        BallMove ballMove = new BallMove();
    }

    public BallMove() {
        mmp = new MyyPanel();
        this.add(mmp);
        this.setSize(800, 800);
        //窗口 JFrame 对象可以监听键盘事件, 即可以监听到面板发生的键盘事件
        this.addKeyListener(mmp);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}

class MyyPanel extends JPanel implements KeyListener {

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {//System.out.println((char)e.getKeyCode() + "被按下..");
        //根据用户按下的不同键，来处理小球的移动 (上下左右的键)
        //在 java 中，会给每一个键，分配一个值(eint)
        switch (e.getKeyCode()) {
            case KeyEvent.VK_DOWN:
                y += 10;
                break;
            case KeyEvent.VK_UP:
                y -= 10;
                break;
            case KeyEvent.VK_LEFT:
                x -= 10;
                break;
            case KeyEvent.VK_RIGHT:
                x += 10;
                break;
            default:
                break;
        }
//让面板重绘
        this.repaint();

    }

    //为了让小球可以移动, 把他的左上角的坐标(x,y)设置变量
    int x = 10;
    int y = 10;

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillOval(x, y, 20, 20);
        //System.out.println("dddddd"); 可以证明repaint方法会调用paint
        //默认黑色
    }
}