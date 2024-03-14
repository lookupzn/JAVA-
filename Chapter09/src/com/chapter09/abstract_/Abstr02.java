package com.chapter09.abstract_;

public class Abstr02 {
    public static void main(String[] args) {
//    A a = new A(); 'A' 为 abstract；无法实例化

    }
}

abstract class A1 {
//抽象类也可以没有抽象方法
//    abstract int Num;//不允许在变量处使用修饰符 'abstract'，只能在方法和类上使用abstract关键字
}

abstract class A {

    abstract void hello();
}

//class B {
//    abstract void hi();//非 abstract 类中存在 abstract 方法
//    //类 'B' 必须被声明为 abstract 或在 'B' 中实现 abstract 方法 'hi()'
//}

abstract class D {  //抽象类可以有任意成员
    public int n1 = 10;
    public static String name = "韩顺平教育";

    public void hi() {
        System.out.println("hi");
    }

    //    public static abstract void hello();////抽象方法不能使用 private、final 和 static 来修饰，因为这些关键字都是和重写相违背
    public static void ok() {
        System.out.println("ok");
    }

    public abstract void hello();
}

abstract class F extends A {
    //如果一个类继承了抽象类，则它必须实现抽象类的所有抽象方法，除非它自己也声明为 abstract
    abstract void hi();
}

//class T extends A {
//类 'T' 必须被声明为 abstract 或在 'A' 中实现 abstract 方法 'hello()'
//}

class TT extends F {
    public void hi() {

    }

    ;//非直接继承的父类如果是抽象类，也算，也得声名这个父类所有的抽象方法

    public void hello() {

    }
}