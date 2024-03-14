package com.collection_.map_;

import java.util.LinkedHashMap;

public class LinkedHashMap01 {
    public static void main(String[] args) {
        LinkedHashMap<Integer,String> map = new LinkedHashMap<>();
        map.put(1,"Wang");
        map.put(2,"Song");
        map.put(3,"Ma");
        map.put(3,"Ma");
        System.out.println(map);

    }
}
