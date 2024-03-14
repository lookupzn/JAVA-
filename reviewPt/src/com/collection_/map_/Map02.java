package com.collection_.map_;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Map02 {
    public static void main(String[] args) {

        Map<String,String> a = new HashMap<>();
        a.put("郭靖","黄蓉");
        a.put("宋青书","周芷若");
        a.put("欧阳锋","裘千尺");

        //获取所有的k
        Set<String> keys = a.keySet();

        //2. 遍历单列集合，得到每一个k
        for(String key : keys)
        {
            String value = a.get(key);
            System.out.println(key + " = " + value);
        }

        Iterator it = keys.iterator();

        while (it.hasNext()) {
            Object next =  it.next();
            String value = a.get(next);
            System.out.println(next + " = " + value);
        }

        keys.forEach(k -> {
            String value = a.get(k);
            System.out.println(k + " = " + value);
        });

    }
}
