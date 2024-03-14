package com.chapter15.generic_;

import java.util.*;

public class GenericEx {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        Set<Student> hashSet = new HashSet();
        Student jack = new Student("Jack", 1);
        Student lee = new Student("Lee", 2);
        Student macee = new Student("Macee", 3);
        hashSet.add(jack);
        hashSet.add(lee);
        hashSet.add(macee);

        Iterator iterator01 = hashSet.iterator();

        while (iterator01.hasNext()) {
            Object next =  iterator01.next();
            System.out.println(next);
        }

        System.out.println("=======hashMap=======");

        HashMap hashMap = new HashMap();
        hashMap.put(jack.getId(),jack);
        hashMap.put(lee.getId(),lee);
        hashMap.put(macee.getId(),macee);
//
//        Set entrySet = hashMap.entrySet();
//        Iterator iterator02 = entrySet.iterator();
//
//        while (iterator02.hasNext()) {
//            Map.Entry next = (Map.Entry) iterator02.next();
//            System.out.println(next);
//        }

        Set<Map.Entry<String, Student>> entries = hashMap.entrySet();
        Iterator<Map.Entry<String, Student>> iterator03 = entries.iterator();

        while (iterator03.hasNext()) {
            Map.Entry<String, Student> next = (Map.Entry) iterator03.next();
            System.out.println(next);
        }
    }
}

class Student{
    private String name;
    private int id;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
