package com.chapter14.map_;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class Collections01 {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        for(int i = 0; i< 8;i++)
        {
            linkedList.add(i,i);
        }
        linkedList.add(7,0);
        System.out.println(linkedList);
        Collections.reverse(linkedList);
        System.out.println(linkedList);
        Collections.sort(linkedList);
        System.out.println(linkedList);

        Collections.swap(linkedList,0,8);
        System.out.println(linkedList);
        System.out.println(Collections.max(linkedList));
        System.out.println(Collections.frequency(linkedList,0));

        LinkedList linkedList1 = new LinkedList();
        for(int i = 0; i < linkedList.size(); i++) {
            linkedList1.add("");
        }
        Collections.copy(linkedList1,linkedList);//第一个是目的集合，第二个是被复制的

        System.out.println(linkedList1);

        Collections.replaceAll(linkedList, 7, "汤姆");
        System.out.println(linkedList);

    }
}
