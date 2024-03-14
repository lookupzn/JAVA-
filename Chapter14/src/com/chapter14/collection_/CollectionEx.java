package com.chapter14.collection_;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionEx {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        Dog[] dogs = {Dog.DOG1, Dog.DOG2};
        for (Object dog :dogs) {
            System.out.println(dog);
        }




    }
}

enum Dog{
    DOG1("哈士奇",1),DOG2("柴犬",2);
    private String name;
    private int age;

    Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
