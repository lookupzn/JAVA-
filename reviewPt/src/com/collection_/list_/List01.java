package com.collection_.list_;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class List01 {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");

        list.add(1,"dddd");//其他元素依次向后移
        System.out.println(list);

        list.remove(1);
        //等价于list.remove("dddd");
        System.out.println(list);

        list.set(0,"love");

        System.out.println(list);

        System.out.println(list.get(2));

    }
}
