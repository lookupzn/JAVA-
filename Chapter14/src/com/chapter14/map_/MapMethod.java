package com.chapter14.map_;

import java.util.HashMap;
import java.util.Map;

public class MapMethod {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        Map map = new HashMap();
        System.out.println(map.isEmpty());

        map.put(13,"Song");
        map.put(12,"Song");
        map.put(null,"Wang");

        Map map1 = new HashMap();

        map1.putAll(map);
        System.out.println(map1);

        map.remove(12);
        System.out.println(map.size());

        System.out.println(map.get(null));

        System.out.println("结果=" + map.containsKey("h"));//结果=false
    }
}
