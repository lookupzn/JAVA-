package com.ning.tankgame;

import javax.swing.*;

public class Game extends JFrame {
    MyPanel myPanel = null;
    public static void main(String[] args) {
        Game game = new Game();
    }

    public Game() {
        myPanel = new MyPanel();
        this.add(myPanel);//添加游戏的绘图区域
        Thread thread = new Thread(myPanel);
        thread.start();
        this.setSize(1000,750);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.addKeyListener(myPanel);
        this.setVisible(true);
    }
}
