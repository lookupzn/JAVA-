package com.tankProj_.tankGame;

import com.tankProj_.tankGame.MyPanel;

import javax.swing.*;
import java.util.Vector;

public class TankGame01 extends JFrame{
    @SuppressWarnings({"all"})
    MyPanel mp = null;//空画板
    public static void main(String[] args) {


        TankGame01 hspTankGame01 = new TankGame01();
    }

    public TankGame01() {
        mp = new MyPanel();
        this.add(mp);//把面板(就是游戏的绘图区域)
        this.setSize(1000, 900);
        this.addKeyListener(mp);//让 JFrame 监听 mp 的键盘事件
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}

