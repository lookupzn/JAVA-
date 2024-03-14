package com.chapter14.collection_;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class CollectionEx01 {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        List fuckit = new ArrayList();
        fuckit.add(new DJ("老王",40));
        fuckit.add(new DJ("Jackie",46));
        Iterator iterator = fuckit.iterator();
        while (iterator.hasNext()) {
            Object obj = iterator.next();
            System.out.println("obj=" + obj);
        }
        System.out.println("======");
        for (Object dj111 :fuckit) {
            System.out.println("obj=" +dj111);
        }

    }
}

class DJ
{
    private String name;
    private int age;

    public DJ(String name, int age) {
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
    public String toString() {
        return "DJ{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
