package com.chapter13.wrapperClass_;

public class WrapperVSString {
    public static void main(String[] args) {
        Integer i = 200;
        //从Integer转换到String
        //方式 1
        String str1 = i + "";
        //方式 2
        String str2 = i.toString();
        //方式 3
        String str3 = String.valueOf(i);

        //从String转换到Integer
        String str4 = "12345";
        Integer i2 = Integer.parseInt(str4);//使用到自动装箱
        Integer i3 = new Integer(str4);//构造器
    }
}
