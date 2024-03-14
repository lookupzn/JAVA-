package com.collection_.normal_;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Iterator01 {
    public static void main(String[] args) {
        //Set 无序，无法使用正常方法遍历，寻找无索引遍历方法
        //Iterator
        Collection<String> coll = new ArrayList<>();
        coll.add("aaa");
        coll.add("bbb");

        Iterator<String> iterator = coll.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println(next);
        }

        //        iterator.next(); Exception in thread "main" java.util.NoSuchElementException

        Iterator<String> iterator1 = coll.iterator();
        while (iterator1.hasNext()) {
            Object next =  iterator.next();
            System.out.println(next);
        }
    }
}
