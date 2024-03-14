package com.chapter13.wrapperClass_;

public class WrapperType01 {
    public static void main(String[] args) {
    int n1 = 100;
    Integer integer = new Integer(n1);
    Integer integer1 = Integer.valueOf(n1);
    //以上是手动装箱，jdk5之前的用法
    int n2 = 200;
    Integer integer2 = n2;
    //jdk 5 后自动装箱，底层为Integer.valueOf(n2)
    int n3 = integer2;
    //jdk 5 后自动拆箱，底层为intValue()
    }
}


