package com.tankProj_.show_;

import com.tankProj_.tankGame.MyPanel;

import javax.swing.*;
import java.awt.*;

public class DrawCircle extends JFrame {//JFrame 对应窗口,可以理解成是一个画框
    //定义一个空面板
    private com.tankProj_.tankGame.MyPanel mp = null;
    /*
     * 演示如何在面板上画出圆形
     */
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        new DrawCircle();
        System.out.println("退出程序~");
    }

    public DrawCircle() {//构造器
        //初始化面板
        mp = new MyPanel();
        //把面板放入到窗口(画框)
        this.add(mp);
        //设置窗口的大小
        this.setSize(800, 800);
        //当点击窗口的小×，程序完全退出. this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);//可以显示
//        this.repaint(1,1,1,1);


    }
}



