package com.chapter14.list_;

import java.util.LinkedHashSet;
import com.chapter14.list_.Car;

public class LinkedHashSetEx {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(new Car("奥拓", 1000));//OK
        linkedHashSet.add(new Car("奥迪", 300000));//OK
        linkedHashSet.add(new Car("法拉利", 10000000));//OK
        linkedHashSet.add(new Car("奥迪", 300000));//加入不了
        linkedHashSet.add(new Car("保时捷", 70000000));//OK
        linkedHashSet.add(new Car("奥迪", 300000));//加入不了

        System.out.println("linkedHashSet=" + linkedHashSet);
    }
}

