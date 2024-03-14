package com.collection_.map_;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Map03 {
    public static void main(String[] args) {
        Map<String,String> a = new HashMap<>();
        a.put("郭靖","黄蓉");
        a.put("宋青书","周芷若");
        a.put("欧阳锋","裘千尺");

        //通过键值对对象进行遍历
        //1. 通过一个方法返回所有键值对对象，返回到一个Set集合 -> entrySet（）

        Set<Map.Entry<String, String>> entries = a.entrySet();

        //遍历entries这个集合

        for(Map.Entry<String,String> entry : entries)
        {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + " = " + value);
        }

        Iterator<Map.Entry<String, String>> iterator = entries.iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> next =  iterator.next();
            String key = next.getKey();
            String value = next.getValue();
            System.out.println(key + " = " + value);
        }

        entries.forEach(entry -> {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + " = " + value);
        });
    }
}
