package com.chapter14.homework_;

import java.util.TreeSet;

public class H05 {
    public static void main(String[] args) {
        TreeSet treeSet = new TreeSet();
        treeSet.add(new P());
    }
}

class P implements Comparable{
    @Override
    public int compareTo(Object o) {
        return 0;
    }
//Exception in thread "main" java.lang.ClassCastException: com.chapter14.homework_.P cannot be cast to java.lang.Comparable

//本质是没有实现comparable接口
}
