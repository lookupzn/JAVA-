package rentSys.view;

import java.util.Scanner;

import rentSys.service.*;

public class HouseView {

    Scanner scanner = new Scanner(System.in);

    public void showMenu() {
        System.out.println("==========房产租赁系统============");
        System.out.println("\t\t\t1    添加房产信息");
        System.out.println("\t\t\t2    修改房产信息");
        System.out.println("\t\t\t3    删除房产信息");
        System.out.println("\t\t\t4    浏览房产信息");
        System.out.println("\t\t\t5    查找特定房产");
        System.out.println("\t\t\t6    退出系统");

    }

    public void makeChoice() {
        System.out.print("\t\t\tchoice ?: (1 - 6)");
        String choice = scanner.next();
        boolean loop = true;
        SysFunction sysFunction = new SysFunction();
        do {
            switch (choice) {
                case "1":
                    sysFunction.addHouse();
                    break;
                case "2":
                    sysFunction.changeHouseInfo();
                    break;
                case "3":
                    sysFunction.deleteHouse();
                    break;
                case "4":
                    sysFunction.listHouseDetail();
                    break;
                case "5":
                    sysFunction.checkHouseDetail();
                    break;
                case "6":
                    loop = false;
                    break;
            }
        } while (loop);

    }
}
