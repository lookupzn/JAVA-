package com.collection_.normal_;

import java.util.ArrayList;
import java.util.Collection;

public class for01 {
    public static void main(String[] args) {
        //增强for -> 只有单列集合（collection）和数组才可以，map不可以

        Collection<String> co = new ArrayList<>();
        co.add("aaa");
        co.add("bbb");

        for(String str : co) //此处str为第三方变量，str即便被赋值仍旧不会影响循环的输出结果（即集合中元素不会因为这个被改变而改变
        {
            System.out.println(str);
        }
    }
}
