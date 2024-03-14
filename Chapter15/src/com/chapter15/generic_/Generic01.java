package com.chapter15.generic_;

import java.util.ArrayList;

public class Generic01 {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        ArrayList<Dog> arrayList = new ArrayList();
        arrayList.add(new Dog(3,"Jack"));
        arrayList.add(new Dog(4,"Black"));
//        arrayList.add(new Cat(1,"Skyler"));  使用泛型后，限制加入类型

        for (Object o : arrayList) {
//向下转型 Object ->Dog
            Dog dog = (Dog) o;
            System.out.println(dog.getName() + "-" + dog.getAge());
            //Exception in thread "main" java.lang.ClassCastException: com.chapter15.generic_.Cat cannot be cast to com.chapter15.generic_.Dog
            //	at com.chapter15.generic_.Generic01.main(Generic01.java:15)
            //因为不小心放了只猫
        }
    }
}
class Animal{
    private int age;
    private String name;

    public Animal(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}

class Cat extends Animal{

    public Cat(int age, String name) {
        super(age, name);
    }

    @Override
    public String toString() {
        return "Cat" + super.toString();
    }
}

class Dog extends Animal{
    public Dog(int age, String name) {
        super(age, name);
    }

    @Override
    public String toString() {
        return "Dog" + super.toString();
    }
}
