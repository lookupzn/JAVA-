package com.collection_.map_;

import java.util.HashMap;

public class HashMapEx {

    public static void main(String[] args) {

        Student s1 = new Student("张三", 18, "北京");
        Student s2 = new Student("李四", 20, "上海");
        Student s3 = new Student("王五", 21, "广州");
        Student s4 = new Student("钱七", 22, "深圳");
        Student s5 = new Student("钱七", 22, "成都");

        HashMap<Student,String> studentList = new HashMap<>();
        studentList.put(s1,s1.getHometown());
        studentList.put(s2,s2.getHometown());
        studentList.put(s3,s3.getHometown());
        studentList.put(s4,s4.getHometown());
        studentList.put(s5,s5.getHometown());

        studentList.forEach((k,v) -> System.out.println(k + " " + v));

    }
}
