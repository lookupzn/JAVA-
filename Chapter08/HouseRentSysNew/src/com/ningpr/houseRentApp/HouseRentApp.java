package com.ningpr.houseRentApp;

import com.ningpr.view.HouseView;

public class HouseRentApp {
    public static void main(String[] args) {
        //创建新HouseView对象，显示主菜单，是整个程序入口
        new HouseView().mainMenu();
        System.out.println("========退  出  系  统========");
    }
}
