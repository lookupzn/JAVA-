package com.chapter14.list_;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetEx {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        //Empolyee 类：name，age
        //3个对象
        //当俩对象的name和age都相同，就会被认为是相同员工，不添加到hashSet

        /*我的思路
        * 1.重写hashCode方法，利用重写的方法作为两个Employee类的对象是否相同的条件
        * 2.重写equals方法，改变衡量对象相等的方法
        * */
        Set set = new HashSet();
        Employee employee = new Employee("1", 11);
        set.add(new Employee("老王", 35));
        set.add(new Employee("老王", 35));
        set.add(new Employee("老宋", 35));
        set.add(employee);
        set.add(employee);
        System.out.println(set);

        //遍历
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            Object next = iterator.next();
            System.out.println(next);
        }

    }
}

class Employee {
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }


//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Employee employee = (Employee) o;
//        return age == employee.age &&
//                Objects.equals(name, employee.name);
//
//    /*
//        *if (this == o) return true;：
//        * 如果当前对象（this）和参数对象（o）是同一个对象（即，它们在内存中的地址相同），那么方法返回true。
//
//        if (o == null || getClass() != o.getClass()) return false;：
//        * 如果参数对象（o）是null，或者参数对象的类和当前对象的类不同，那么方法返回false。
//
//        Employee employee = (Employee) o;：
//        * 将参数对象（o）强制转换为Employee类型，并赋值给employee变量。
//
//        return age == employee.age && Objects.equals(name, employee.name);：
//        * 如果当前对象和employee对象的age属性相等，并且它们的name属性也相等（使用Objects.equals()方法来比较，
//        * 这个方法可以正确处理null值），那么方法返回true；否则，返回false。
//    * */
//    }


    @Override
    public boolean equals(Object obj) {
        Employee tester = (Employee) obj;
         if ((obj == null) || (this.getClass() != obj.getClass()))//null和非同类对象元素不参与判断
            return false;
        else if (this.hashCode() == tester.hashCode()) {//通过重写的hashCode方法来判断，原方法不进行判断
             return true;
         }
        else
            return false;
    }

    @Override
    public int hashCode() {
        return name.hashCode() + age;
    }
}

