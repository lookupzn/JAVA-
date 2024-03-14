package smallchange;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SmallChangeSys {
    //化繁为简
    //1.先完成显示菜单，并且可以选择菜单，给出对应提示
    //2.完成零钱通明细设计
    //（1）收益入账和消费保存到数组
    //（2）使用对象
    //（3）使用String拼接
    //3.收益入账（完成功能驱动程序员完成新成员变量）
    //（1）新变量：1.收益 2.时间 3.余额
    //4.消费功能
    //新变量：1.消费地点
    //设置if条件时先写要求条件少的

    //属性

    boolean loop = true;
    Scanner scanner = new Scanner(System.in);
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
    double money = 0;
    double balance = 0;
    Date date = null;
    String note = " ";
    String details = "=========零钱通明细===========";
    String key = " ";


    public void mainMenu() {
        System.out.println("=========零钱通菜单===========");
        System.out.println("\t\t\t1 零钱通明细");
        System.out.println("\t\t\t2 收益入账");
        System.out.println("\t\t\t3 消费");
        System.out.println("\t\t\t4 退出零钱通");
        System.out.print("请选择（1 - 4）： ");
        key = scanner.next();
    }

    public void detail() {
        System.out.println(details);

    }

    public void income() {
        System.out.print("收益入账金额： ");
        money = scanner.nextDouble();
        if (money > 0) {
            balance += money;
            //拼接收益入账信息到details
            date = new Date();
            //处理格式
            details += "\n收益入账:\t" + "+" + money + "\t" + sdf.format(date) + "\t" + balance;
            System.out.println("记录完成");
            return;
        } else {
            System.out.println("收益格式错误");
            return;
        }
    }

    public void pay() {
        System.out.print("消费金额： ");
        //有一个范围校验
        money = scanner.nextDouble();
        if (money > 0) {
            if (balance - money >= 0) {
                balance -= money;
                System.out.print("消费原因： ");
                note = scanner.next();
                details += "\n" + note + ":\t" + "-" + money + "\t" + sdf.format(date) + "\t" + balance;
                System.out.println("记录完成");
                return;
            } else {
                System.out.println("余额不足");
                return;
            }

        } else {
            System.out.println("消费金额格式错误");
            return;
        }
    }

    public void exitSuspend() {
        while (true) {
            System.out.print("你是否退出？ y/n  ");
            String choice = scanner.next();
            if (choice.equals("y")) {
                loop = false;
                break;
            } else if (choice.equals("n")) {
                break;
            } else {
                System.out.println("重新输入！！！  ");
            }
        }
    }

    public void lingQianTong() {
        do {
            mainMenu();
            this.key = key;
            switch (key) {
                case "1":
                    detail();
                    break;
                case "2":
                    income();
                    break;
                case "3":
                    pay();
                    break;
                case "4":
                    exitSuspend();
                    break;
                default:
                    System.out.println("请重新输入");
                    break;
            }
        } while (loop);
    }
    public static void main(String[] args) {
        SmallChangeSys smallChangeSys = new SmallChangeSys();
        smallChangeSys.lingQianTong();
    }
}
