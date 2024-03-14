package com.chapter14.list_;

import java.util.HashSet;
import java.util.Set;

public class HashSet01 {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        Set hashSet = new HashSet();
        hashSet.add(null);
        hashSet.add(null);
        System.out.println("hashSet=" + hashSet);//output: hashSet=[null]


        //老韩解读
        //1. 构造器走的源码
        /*
        public HashSet() {
        map = new HashMap<>();
        }
        2. HashSet 可以存放 null ,但是只能有一个 null,即元素不能重复
        */

        Set set = new HashSet();

        //说明
        //1. 在执行 add 方法后，会返回一个 boolean 值
        //2. 如果添加成功，返回 true, 否则返回 false,这里体现hashSet集合中元素不能重复
        //3. 可以通过 remove 指定删除哪个对象

        System.out.println(set.add("john"));//T
        System.out.println(set.add("lucy"));//T
        System.out.println(set.add("john"));//F
        System.out.println(set.add("jack"));//T
        System.out.println(set.add("Rose"));//T

        set.remove("john");
        System.out.println("set=" + set);//3 个

        //这俩结果一样，set.clear();
        set = new HashSet();
        System.out.println("set=" + set);//null

        set.add("lucy");//添加成功
        set.add("lucy");//加入不了

        System.out.println("set=" + set);//Output: set=[lucy]

        set.add(new DDog("tom"));//OK
        set.add(new DDog("tom"));//OK
        set.add(new DDog("tom"));//OK
        set.add(new String("WANG"));
        set.add(new String("WANG"));

        System.out.println("set=" + set);//OUTPUT: set=[DDog{name='tom'}, WANG, lucy, DDog{name='tom'}]
    }
}

class DDog {
    private String name;

    public DDog(String name) {
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
        return "DDog{" +
                "name='" + name + '\'' +
                '}';
    }
}
