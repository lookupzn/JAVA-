package com.collection_.set_;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Set01 {
    public static void main(String[] args) {
        //1.创建set集合
        Set <String> a = new HashSet<>();

        System.out.println(a.add("11"));//true
        System.out.println(a.add("11"));//false
        System.out.println(a);
        //若当前元素第一次添加，则成功，返回true。反之则失败，返回false

        //        a.get()  不可以，无序

        a.add("22");
        a.add("33");

        Iterator it = a.iterator();
        while (it.hasNext()) {
            Object next =  it.next();
        }

        for(String s: a)
        {
            System.out.println(s);
        }

        System.out.println("=======");
        a.forEach(s -> System.out.print(s + " "));
    }
}
