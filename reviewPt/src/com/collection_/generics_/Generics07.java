package com.collection_.generics_;

import java.util.ArrayList;

public class Generics07 {
    public static void main(String[] args) {
        //泛型不具有继承性，但是数据有继承性
        ArrayList<Ye> list1 = new ArrayList<>();
        ArrayList<Fu> list2 = new ArrayList<>();
        ArrayList<Ye> list3 = new ArrayList<>();

        method(list1);
//        method(list2);
        list1.add(new Fu());
        list1.add(new Zi());

    }

    public static void method(ArrayList<Ye> list){
        //此时泛型里面写的是什么类型，只能传递什么类型
    }
}

class Ye{}
class Fu extends Ye{}
class Zi extends Fu{}