package com.collection_.map_;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMap01 {
    public static void main(String[] args) {
        Production p1 = new Production("电视机");
        Production p2 = new Production("冰箱");
        Production p3 = new Production("洗衣机");
        TreeMap<Integer, Production> i = new TreeMap<Integer, Production>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });
        i.put(1,p1);
        i.put(2,p2);
        i.put(3,p3);
        System.out.println(i);



    }
}

class Production{
    private String name;

    public Production(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Production{" +
                "name='" + name + '\'' +
                '}';
    }


}

