package com.chapter15.generic_;

public class Generic02 {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        //注意，特别强调： E 具体的数据类型在定义 Person 对象的时候指定,即在编译期间，就确定 E 是什么类型
//        Person<String> person = new Person<String>("韩顺平");
        System.out.print(new Person<String>().f("hsp"));
    }
}
class Person<E> {
//    E s ;//E 表示 s 的数据类型, 该数据类型在定义 Person 对象的时候指定,即在编译期间，就确定 E 是什么类型
//    public Person(E s) {//E 也可以是参数类型
//        this.s = s;
//    }
    public E f(E e) {//返回类型使用 E
        return e;
    }
    public void show(E e) {
        System.out.println(e.getClass());//显示 s 的运行类型
    }}
