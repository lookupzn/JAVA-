package com.chapter14.homework_;
import com.chapter14.homework_.News;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class H01 {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {

        ArrayList newsList = new ArrayList();
        newsList.add(new News("新冠确诊超千万，数百万印度教教徒奔赴恒河圣裕引人担忧"));
        newsList.add(new News("男子突然发现2个月前钓的鱼还在网兜，捞起一看赶紧放生"));

        Iterator iterator = newsList.iterator();
        Collections.reverse(newsList);
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println(next);
        }

    }
}


