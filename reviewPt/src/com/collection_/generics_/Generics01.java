package com.collection_.generics_;

import java.util.ArrayList;
import java.util.Iterator;

//入宫我们没给集合指定类型。默认为所有数据类型object
//此时可以添加任意类型数据
//无法获取数据特征

public class Generics01 {
    public static void main(String[] args) {
        //1, 创建集合对象
        ArrayList arrayList = new ArrayList();
        arrayList.add(123);
        arrayList.add("Hi");
        arrayList.add('c');

        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next =  it.next();//如果强转可能会出现ClassCastException有的类型不能转
            //多态的弊端 -》 无法访问子类特征如长度等
//            next.length();
            System.out.println(next);
        }
    }
}
