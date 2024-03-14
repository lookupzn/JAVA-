package com.collection_.normal_;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Consumer;

public class Lambda01 {
    public static void main(String[] args) {
        Collection<String> co = new ArrayList<>();
        co.add("aaa");
        co.add("bbb");

//        co.forEach(new Consumer<String>() {
//            @Override
//            public void accept(String s) {
//                System.out.println(s);
//            }
//        });

        co.forEach(s -> System.out.println(s));
        //当只有一种类型元素在集合中，可以省略数据类型
    }
}
