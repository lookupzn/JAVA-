package com.collection_.generics_;

import java.util.ArrayList;

public class Generics05 {
    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<>();
        ListUtil.addAll(a,"aaa","bbb","ccc","cdd");
        System.out.println(a);

        ArrayList<Integer> b = new ArrayList<>();
        ListUtil.addAll(b,1,2,3,4);
        System.out.println(b);
    }
}



