package com.collection_.map_;

import java.util.HashMap;
import java.util.Map;

public class Map04 {
    public static void main(String[] args) {
        Map<String, String> a = new HashMap<>();
        a.put("郭靖", "黄蓉");
        a.put("宋青书", "周芷若");
        a.put("欧阳锋", "裘千尺");

        a.forEach((k, v) ->  System.out.println(k + " = " + v));//底层其实就是Map03的方法

    }
}
