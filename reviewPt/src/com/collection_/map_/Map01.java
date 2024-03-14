package com.collection_.map_;

import com.collection_.set_.HashSet01;

import java.util.HashMap;
import java.util.Map;

public class Map01 {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();

        map.put(1,"Wang");
        map.put(2,"Song");
        map.put(3,"Ma");
        String value = map.put(4,"Ma");
        String value1 = map.put(4,"WANG");

        //put细节：
        //添加数据时，k不存在，要么直接把键值对对象添加到map集合中，方法返回null
        //反之，若k已经存在，则把原有键值对对象覆盖，返回被覆盖的值
        System.out.println(map);
        System.out.println(value1);//Ma
        System.out.println("=======");
        map.remove(3);
        System.out.println(map);
        System.out.println(map.containsKey(5));
        System.out.println(map.containsValue("Song"));
        System.out.println(map.size());
    }
}
