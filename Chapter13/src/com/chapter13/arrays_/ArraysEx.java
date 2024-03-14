package com.chapter13.arrays_;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysEx {
    public static void main(String[] args) {
        //自定义Book类 属性有name，price --> 枚举
        //按price排序
        //使用两种方式排序
        //有一个Book【】 books = 4本书对象；
//        System.exit(0);程序退出，0表示正常状态

        Book[] books = {Book.BOOK1,Book.BOOK2,Book.BOOK3,Book.BOOK4};

        Arrays.sort(books, new Comparator()
        {

            @Override
            public int compare(Object o1, Object o2) {
               Book book1 = (Book) o1;
               Book book2 = (Book) o2;
               double priceCal = book1.getPrice() - book2.getPrice();
               return (int) priceCal;//如果反向排的话，直接return -(int)priceCal;
                // 我的这个方法不够严谨，差值为1算不出来，实际可以用一个if else输出int值让比较器return回去
            }
        });

        System.out.println(Arrays.toString(books));
        System.out.println("=============================");
        //按照名字长短，输入内容：
        Arrays.sort(books, new Comparator()
        {

            @Override
            public int compare(Object o1, Object o2) {
                Book book1 = (Book) o1;
                Book book2 = (Book) o2;

                return book1.getName().length() - book2.getName().length();
            }
        });

        System.out.println(Arrays.toString(books));
    }
}

enum Book{
    BOOK1("红楼梦",99.9),BOOK2("赤脚医生",39.9),BOOK3("西厢记",69.9),BOOK4("java入门到放弃",29.9);

    private String name;
    private double price;

    Book(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "《" + name + "》" +
                "  价格：" + price;
    }
}
