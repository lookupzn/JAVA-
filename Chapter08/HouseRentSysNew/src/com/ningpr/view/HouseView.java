package com.ningpr.view;

/*1.显示界面
*2.接收用户输入
*3.调用HouseService方法来完成对房屋租赁的各种操作
*/

import com.ningpr.func.Utility;
import com.ningpr.service.HouseService;

public class HouseView {

    // 化繁为简 完成一个功能：1.明确功能 2.思路分析 3.代码实现

    //（1）用户打开界面，可以看到房屋租赁系统的页面，并且可以关闭页面
    //由于该功能，是关于页面的功能，所以我们设置一个mainView方法来实现这个功能

    //用一个boolean值来控制显示菜单
    //key用于接收用户输入
    private boolean loop = true;
    private char key = ' ';
    private HouseService houseService = new HouseService(10);
    //显示主菜单
    public void listHouse()
    {
        System.out.println("===========房 屋 列 表===========");
        System.out.println("编号\t\t名字\t\t电话\t\t地址\t\t租金\t\t状态");
    }
    public void mainMenu()
    {
        do{
            System.out.println("===========房屋租赁系统===========");
            System.out.println("\t\t\t1. 新 增 房 源");
            System.out.println("\t\t\t2. 查 找 房 源");
            System.out.println("\t\t\t3. 删 除 房 源");
            System.out.println("\t\t\t4. 修 改 房 源");
            System.out.println("\t\t\t5. 房 源 列 表");
            System.out.println("\t\t\t6. 退 出 系 统");
            System.out.print("输 入 选 择：（1 - 6）  ");
            key = Utility.readChar();
            switch (key)
            {
                case '1' :
                    System.out.println("新 增");
                    break;
                case '2' :
                    System.out.println("查 找");
                break;
                case '3' :
                    System.out.println("删 除");
                    break;
                case '4' :
                    System.out.println("修 改");
                    break;
                case '5' :
                    System.out.println("房 源 列 表");
                    break;
                case '6' :
                    System.out.println("退 出");
                    loop = false;
                    break;

            }
        }while(loop);
    }
}
