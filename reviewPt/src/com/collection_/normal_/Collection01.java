package com.collection_.normal_;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Collection01 {
    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<>();

        //1.添加元素
        //list 添加数据永远返回true，因为list允许添加重复数据
        //而set不行，在输入重复元素后会返回false

        coll.add("aaa");

        //2.清空 coll.clear();

        //3.删除
        //1.因为Collection是定义共性方法，所以不能通过索引删除，只能用元素本身内容
        //2.方法返回布尔值，删除成功则true反之元素不存在则false
        System.out.println(coll.remove("bbb")); //false
        System.out.println(coll.remove("aaa")); //true

        //
    }
}
