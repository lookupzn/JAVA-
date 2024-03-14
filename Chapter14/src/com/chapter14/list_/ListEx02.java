package com.chapter14.list_;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListEx02 {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        List list = new ArrayList();

        list.add(new Book("橙红时代", 38.8 , "骁骑校"));
        list.add(new Book("铁器时代", 28.8 , "骁骑校"));
        list.add(new Book("丰乳肥臀", 69.9 , "莫言"));
        list.add(new Book("绝命毒师", 156.6 , "吉伦根哈利"));

        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println(next);

        }
        System.out.println("\n=========");
        sort(list);
        iterator = list.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println(next);

        }

    }

    private static void sort(List list) {
        int listSize = list.size();
        for (int i = 0; i < listSize - 1; i++) {
            for (int j = 0; j < listSize - 1 - i; j++) {
            //取出对象 Book
                Book book1 = (Book) list.get(j);
                Book book2 = (Book) list.get(j + 1);
                if (book1.getPrice() > book2.getPrice()) {//交换
                    list.set(j, book2);
                    list.set(j + 1, book1);
                }
            }
        }
    }
}

class Book{
    private String name;
    private double price;
    private String authorName;

    public Book(String name, double price, String authorName) {
        this.name = name;
        this.price = price;
        this.authorName = authorName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    @Override
    public String toString() {
        return "名称： " + name + "\t" + "价格： " + price + "\t" + "作者： " + authorName + "\t";
    }
}
