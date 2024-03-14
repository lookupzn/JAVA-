package com.ning.reflection_;

public class Reflection01 {
    public static void main(String[] args) throws ClassNotFoundException {
        Class clazz = Class.forName("com.ning.reflection_.BigStar");
        //最常用
        System.out.println(clazz);

        Class clazzz = BigStar.class;
        //作为参数使用
        System.out.println(clazzz);

        Class clazzzz = new BigStar("sfvs").getClass();
        //当已经有该类对象时才可以用
        System.out.println(clazzzz);
    }
}
