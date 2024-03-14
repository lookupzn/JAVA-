package rentSys.service;

import rentSys.houseData.House;
import rentSys.view.HouseView;

import java.util.Scanner;

public class SysFunction {
    public House test = new House(1,"WANG","198","32 Peter St",600.0,true);
    public House[] houses = {test};
    Scanner scanner = new Scanner(System.in);
    public boolean rentStatus;

    public void addHouse() {
        //房屋信息（包括：姓名，电话，地址，租金，状态）
        System.out.println("==========添加房间信息==========");
        System.out.print("姓名： ");
        String name = scanner.next();
        System.out.print("电话： ");
        String telNum = scanner.next();
        System.out.print("地址： ");
        String addressInfo = scanner.next();
        System.out.print("租金： ");
        double rentPrice = scanner.nextDouble();
        House[] arrNew = new House[houses.length + 1];

        if (houses.length != 0) {
            System.arraycopy(houses, 0, arrNew, 0, houses.length);
        }
        arrNew[houses.length] = new House(houses.length + 1, name, telNum, addressInfo, rentPrice, rentStatus);
        houses = arrNew;
        backToMenu();
    }

    public void deleteHouse() {
        //房屋信息（包括：姓名，电话，地址，租金，状态）
        System.out.println("==========删除房间信息==========");
        System.out.print("请输入要删除的房产编号： ");
        int indexHouse = scanner.nextInt();
        House[] arrNew = new House[houses.length - 1];
        if ((indexHouse - 1) >= arrNew.length && (indexHouse - 1) < houses.length)//即删除的是旧房子数列的最后一个元素
        {
            if (arrNew.length >= 0) System.arraycopy(houses, 0, arrNew, 0, arrNew.length);
            houses = arrNew;
        } else if ((indexHouse - 1) > 0 && (indexHouse - 1) < arrNew.length) {
            System.arraycopy(houses, 0, arrNew, 0, indexHouse - 1);
            for (int i = 0; (i >= (indexHouse - 1)) && (i < arrNew.length); i++) {
                arrNew[i] = houses[i + 1];
            }

            houses = arrNew;
        }
        backToMenu();

    }

    public void changeHouseInfo() {
        System.out.println("==========更改房间信息==========");
        System.out.print("请输入要更改信息的房产编号： ");
        int indexHouse = scanner.nextInt();
        System.out.print("请输入要更改的房产信息：(1-6) ");
        String choice = scanner.next();
        boolean loop = true;
        //switch-case结构完成修改信息选择
        do {
            switch (choice) {
                case "1":
                    System.out.print("请输入要更改的房产名称： ");
                    houses[indexHouse - 1].name = scanner.next();
                    backToMenu();
                    break;
                case "2":
                    System.out.print("请输入要更改的房主电话： ");
                    houses[indexHouse - 1].telNum = scanner.next();
                    backToMenu();
                    break;
                case "3":
                    System.out.print("请输入要更改的房产地址： ");
                    houses[indexHouse - 1].addressInfo = scanner.next();
                    backToMenu();
                    break;
                case "4":
                    System.out.print("请输入要更改的房产租金： ");
                    houses[indexHouse - 1].rentPrice = scanner.nextDouble();
                    backToMenu();
                    break;
                case "5":
                    System.out.print("请输入要更改的房产租赁状态：(1or2) ");
                    String status = scanner.next();
                    while (true) {
                        if (status.equals("1")) {
                            houses[indexHouse - 1].statusRental = true;
                            break;
                        } else if (status.equals("2")) {
                            houses[indexHouse - 1].statusRental = false;
                            break;
                        } else {
                            System.out.println("请输入正确格式");
                        }
                    }
                    backToMenu();
                    break;
                case "6":
                    System.out.println("退出该页面");
                    loop = false;
                    backToMenu();
                    break;
                default:
                    System.out.println("Wrong Format!!!");


            }

        } while (loop);

    }

    private void backToMenu() {
        HouseView houseView = new HouseView();
        houseView.showMenu();
        houseView.makeChoice();
    }

    public void listHouseDetail(){
        System.out.println("==========房产信息一览============");
        for(int i = 0;i < houses.length;i++)
        {
            System.out.println(houses[i].info());
        }
        backToMenu();
    }

    public void checkHouseDetail(){
        System.out.println("请输入要查询的房产编号： ");
        int index = scanner.nextInt();
        if(index > houses.length || index < 1 )
        {
            System.out.println("Wrong information!!!");
            checkHouseDetail();
        }
        else
        {
            System.out.println(houses[index - 1].info());
        }
        backToMenu();
    }

}
