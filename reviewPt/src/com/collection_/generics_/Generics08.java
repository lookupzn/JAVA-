package com.collection_.generics_;

import java.util.ArrayList;

public class Generics08 {
    public static void main(String[] args) {
        ArrayList<Ye> list1 = new ArrayList<>();
        ArrayList<Fu> list2 = new ArrayList<>();
        ArrayList<Ye> list3 = new ArrayList<>();

        method(list1);
        method(list2);

    }
//    public static <E> void method(ArrayList<E> list){
//        //此时泛型里面任意类型
//    }

//    public static <E> void method(ArrayList <? extends Ye> list){//此时泛型里面任意类型
//        }

    public static <E> void method(ArrayList <? super Zi> list){//此时泛型里面任意类型
    }
}
