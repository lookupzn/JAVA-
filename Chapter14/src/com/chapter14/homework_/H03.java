package com.chapter14.homework_;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class H03 {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        //1.HashMap实例化Map对象
        Map hashMap = new HashMap();
        //2.k => String v => sal
        hashMap.put("Jack",650);
        hashMap.put("Wang",1200);
        hashMap.put("Lucy",2900);
        hashMap.replace("Jack",650,2600);
        Set entrySet = hashMap.entrySet();
        Iterator iterator = entrySet.iterator();
        while (iterator.hasNext()) {
            Map.Entry next =  (Map.Entry) iterator.next();
            System.out.print(next.getKey() + " ");
            System.out.print((int)next.getValue() + 100);
            System.out.println();
        }
    }
}
