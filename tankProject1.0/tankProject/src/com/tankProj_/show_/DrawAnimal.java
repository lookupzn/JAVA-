package com.tankProj_.show_;

import javax.swing.*;
import java.awt.*;

public class DrawAnimal extends JFrame {
    @SuppressWarnings({"all"})
    PPanel p = null;

    public DrawAnimal() {
        this.p = new PPanel();
        this.add(p);//把面板(就是游戏的绘图区域)
        this.setSize(1000, 900);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        DrawAnimal drawAnimal = new DrawAnimal();
    }
}

class PPanel extends JPanel {

    Head head = new Head(400, 130);
    Body body = new Body(325, 200);
    Neck neck = new Neck(410, 155);

    @Override
    public void paint(Graphics g) {
        super.paint(g);
//        g.fillRect(0, 0, 1000, 900);
        createTail(g);
        arm(g);
        animalBody(g);
        createEyes(g);

    }

    public void createEyes(Graphics g) {
        g.setColor(Color.BLACK);
        g.fillRect(410, 140, 10, 10);
        g.fillRect(430, 140, 10, 10);
    }

    public void animalBody(Graphics g) {
        createCircle(head.getX(), head.getY(), g, 0, 0);
        createCircle(body.getX(), body.getY(), g, 1, 1);
        createCircle(neck.getX(), neck.getY(), g, 2, 2);

    }

    public void arm(Graphics g) {
        g.setColor(Color.GREEN);
        g.fillArc(320, 220, 50, 50, 15, 170);
        g.fillArc(310, 360, 50, 50, 15, 170);
        g.fillArc(480, 220, 50, 50, 5, 160);
        g.fillArc(490, 360, 50, 50, 5, 160);
    }

    public void createTail(Graphics g) {
        g.setColor(Color.BLACK);
        g.drawArc(420, 377, 105, 105, -15, -180);
        g.drawArc(450, 447, 35, 35, 0, 360);
    }

    /**
     * @param x      坦克的左上角 x 坐标
     * @param y      坦克的左上角 y 坐标
     * @param g      画笔
     * @param direct circle大小
     * @param type   circle类型
     */


    public void createCircle(int x, int y, Graphics g, int direct, int type) {

        switch (type) {
            case 0: //我们的坦克
                g.setColor(Color.white);
                break;
            case 1: //敌人的坦克
                g.setColor(Color.yellow);
                break;
            case 2:
                break;
        }
        switch (direct) {
            case 0:
                g.setColor(Color.GREEN);
                g.fillOval(x, y, 50, 50);

                break;
            case 1:
                g.setColor(Color.RED);
                g.fillOval(x, y, 200, 230);
                break;
            case 2:
                g.setColor(Color.GREEN);
                g.fillRect(x, y, 30, 50);
            default:
                System.out.println("暂时没有处理");
        }
    }
}

class Neck extends CircleView_ {
    public Neck(int x, int y) {
        super(x, y);
    }
}
