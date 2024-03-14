package com.chapter13.string_;

public class String01 {

    String a = new String("zn");
    final char[] chars= {'a','b'};
    public void change(String a , char[] chars)
    {
        a = "help";
        chars[0] = 'o';
    }
    public static void main(String[] args) {
        String s1 = "zn";
        System.out.println(s1.hashCode());
        s1 = "wang";
        System.out.println(s1.hashCode());// 输出两个不同哈希码值，说明创建了两个对象
        String s2 = " hello!";
        String s3 = s1 + s2;
        System.out.println(s3.hashCode());

        String01 string01 = new String01();
        string01.change(string01.a, string01.chars);

        System.out.print(string01.a +  " and ");
        System.out.println(string01.chars);


    }
}
