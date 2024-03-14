package com.collection_.set_;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet01 {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>();

        ts.add(1);
        ts.add(4);
        ts.add(3);
        ts.add(2);

        System.out.println(ts);//[1, 2, 3, 4]

        Iterator it = ts.iterator();

        while (it.hasNext()) { Object next =  it.next(); System.out.println(next);}

        ts.forEach(integer -> System.out.println(integer));

        for(Integer i : ts) { System.out.println(i); }
    }
}
