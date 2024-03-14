package com.collection_.generics_;

public class Generics04 {
    public static void main(String[] args) {
        MyArrayList<String> stringMyArrayList = new MyArrayList<>();
        stringMyArrayList.add("aaaa");
        stringMyArrayList.add("11a");
        stringMyArrayList.add("aa42a");

        System.out.println(stringMyArrayList);

    }
}

