package com.chapter09.homework;

import java.util.Scanner;

public class H06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请告诉我你选择的颜色：");
        String choice = scanner.next();
        switch (choice) {
            case "红":
                Color.RED.show();
                break;
            case "蓝":
                Color.BLUE.show();
                break;
            case "黑":
                Color.BLACK.show();
                break;
            case "黄":
                Color.YELLOW.show();
                break;
            case "绿":
                Color.GREEN.show();
                break;
            default:
                System.out.println("你选择的颜色格式错误！");

        }
    }
}
enum Color implements H05implement {
    RED(255, 0, 0), BLUE(0, 0, 255), BLACK(0, 0, 0),
    YELLOW(255, 255, 0), GREEN(0, 255, 0);
    private int redValue;
    private int greenValue;
    private int blueValue;


    Color(int redValue, int greenValue, int blueValue) {
        this.redValue = redValue;
        this.greenValue = greenValue;
        this.blueValue = blueValue;
    }


    @Override
    public void show() {
        System.out.println(toString());
    }


    @Override
    public String toString() {
        return "Color{" +
                "redValue=" + redValue +
                ", greenValue=" + greenValue +
                ", blueValue=" + blueValue +
                '}';
    }
    }

