package com.chapter13.string_;


import java.util.Scanner;

public class StringBufferEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入价格： ");
        String price = scanner.next();
        StringBuffer sb = new StringBuffer(price);
        ToolBox toolBox = new ToolBox();
        System.out.println("价格： " + toolBox.showPrice(sb));

    }
}

class ToolBox
{
    public StringBuffer showPrice(StringBuffer sb){
        for (int i = sb.lastIndexOf(".") - 3; i > 0; i -= 3) {
            sb = sb.insert(i, ",");
        }
        return sb;
    }
}
