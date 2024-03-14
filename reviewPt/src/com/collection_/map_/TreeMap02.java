package com.collection_.map_;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMap02 {
    public static void main(String[] args) {
        People p1 = new People("张三", 18);
        People p2 = new People("李四", 20);
        People p3 = new People("王五", 21);
        TreeMap<People, String> p = new TreeMap<>();
        p.put(p1,"Beijing");
        p.put(p2,"Beijing");
        p.put(p3,"Beijing");
        Set<Map.Entry<People, String>> entries = p.entrySet();
        Iterator<Map.Entry<People, String>> iterator = entries.iterator();
        while (iterator.hasNext()) {
            Map.Entry<People, String> next = iterator.next();
            System.out.println(next.getKey() + " " + next.getValue());
        }
    }
}

class People implements Comparable<People>{
    private String name;
    private int age;

    public People(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(People o) {
        if(this.getAge() != o.getAge())
        {
            return  - this.getAge() + o.getAge();
        }
        else
            return o.getName().compareTo(this.getName());
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
