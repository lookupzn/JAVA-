package com.chapter14.list_;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetEx02 {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        Set set = new HashSet();
        set.add(new Employeee("Wang",new MyDate(1999,3,18),15000.0));
        set.add(new Employeee("Wang",new MyDate(1999,3,18),15000.0));
        set.add(new Employeee("Xiang",new MyDate(1999,3,18),15000.0));
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println(next);
        }
    }
}

class Employeee {
    private String name;
    private MyDate birthday;
    private double sal;

    public Employeee(String name, MyDate birthday, double sal) {
        this.name = name;
        this.birthday = birthday;
        this.sal = sal;
    }

    @Override
    public boolean equals(Object obj) {
        Employeee tester = (Employeee) obj;
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
        return name.hashCode() + birthday.hashCode();
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", birthday=" + birthday +
                ", sal=" + sal +
                '}';
    }
}

class MyDate{
    private int year;
    private int month;
    private int date;

    public MyDate(int year, int month, int date) {
        this.year = year;
        this.month = month;
        this.date = date;
    }

    @Override
    public int hashCode() {
        return year + month + date;
    }

    @Override
    public String toString() {
        return "MyDate{" +
                "year=" + year +
                ", month=" + month +
                ", date=" + date +
                '}';
    }
}