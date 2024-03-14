package com.chapter14.list_;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListEx {
    public static void main(String[] args) {
        //添加10个以上的元素
        List list = new ArrayList();
        for (int i = 0; i < 12; i++) {
            list.add("hello" + i);
        }
        System.out.println("list=" + list);
        //2号位插入一个元素
        list.add(2,"HelloWorld");
        //获得第五个元素
        System.out.println("第五个元素=" + list.get(4));
        //移除第六个元素
        list.remove(5);
        System.out.println("list=" + list);
        //修改第七个元素
        list.set(6,"NingZhang");
        System.out.println("list=" + list);

        System.out.println("=============");

        Iterator iterator = list.iterator();
        int i = 0;
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.print(++i + " " + next + " ");
        }


    }
}
