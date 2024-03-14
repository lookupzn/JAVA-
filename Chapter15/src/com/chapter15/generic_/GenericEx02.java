package com.chapter15.generic_;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

public class GenericEx02 {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        Employee wang = new Employee("Wang", 15000.0, new MyDate(1999, 1, 15));
        Employee zhang = new Employee("Zhang", 5000.0, new MyDate(1989, 11, 25));
        Employee liang = new Employee("Liang", 6200.0, new MyDate(1991, 6, 12));
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(wang);
        employees.add(zhang);
        employees.add(liang);


        employees.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {

                if (o1.getName().length() == o2.getName().length())
                {
                   return o1.getBirthday().dateNum() - o2.getBirthday().dateNum();
                }
                else
                    return o1.getName().length() - o2.getName().length();
            }
        });

        Iterator<Employee> iterator = employees.iterator();
        while (iterator.hasNext()) {
            Employee next =  iterator.next();
            System.out.println(next);

        }

    }
}

class Employee
{
    private String name;
    private double sal;
    private MyDate birthday;

    public Employee(String name, double sal, MyDate birthday) {
        this.name = name;
        this.sal = sal;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public MyDate getBirthday() {
        return birthday;
    }

    public void setBirthday(MyDate birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name: '" + name + '\'' +
                " sal: " + sal +
                " birthday: " + birthday +
                '}';
    }
}

class MyDate{
    private int year;
    private int month;
    private int day;

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    @Override
    public String toString() {
        if(month < 10)
        return year + ":0" + month + ":" + day;
        else
        return year + ":" + month + ":" + day;
    }

    public int dateNum()
    {
        return year*10000 + month*100 + day;
    }

}

