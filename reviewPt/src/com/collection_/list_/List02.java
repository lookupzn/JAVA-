package com.collection_.list_;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class List02 {
    public static void main(String[] args) {
        //List的遍历方式
        //1.iterator
        //2.增强for
        //3.lambda
        //4.列表迭代器
        //5.普通for

        List<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        System.out.println("======Iterator======");
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println(next);
        }
        System.out.println("======增强for======");
        for(Object o : list)
        {
            System.out.println(o);
        }
        System.out.println("======Lambda======");
        list.forEach(o -> System.out.println(o));


        System.out.println("======for======");
        for(int i = 0;i < list.size();i++)
        {
            System.out.println(list.get(i));
        }
        System.out.println("====ListIterator====");
        ListIterator<String> stringListIterator = list.listIterator();

        while (stringListIterator.hasNext()) {
            String next =  stringListIterator.next();
            System.out.println(next);
        }
    }
}
