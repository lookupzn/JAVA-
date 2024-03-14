package com.chapter09.static_;

public class Lesson2 {
    public static void main(String[] args) {
    Movie a = new Movie("ABC",2);
    Movie b = new Movie("ABC",2,20.0);

    LLM a01 = new LLM(2);
    LLM a02 = new LLM(3);


        //由于静态成员（包括静态代码块）都会被这个类的所有对象共享，所以，静态代码块只会随着类的加载执行一次，之后则不会执行
        System.out.println("Num 1" + Movie.num1);
        //类在创建对象或者子类对象或者调用类的静态成员时都会被加载.
        //但是除了使用类中的静态成员时外，其他两种情况下，普通代码块都会被隐式调用。只使用类中的静态成员时，普通代码块不会被调用并执行。
        //普通代码块会随着每创建一次新对象调用一次普通代码块
        //创建对象的过程：1.static代码块  &  static变量初始化 2.普通代码块  &  普通变量初始化 3.构造器

        B b1 = new B();
//        AAA 的普通代码块
//        A()被调用
//        BBB 的普通代码块...
//        B()被调用
//        1. super() ---> A构造器 2. A构造器（super（）） 3. A构造器 代码块 4. A构造器
//        5. B构造器 代码块 6. B构造器




    }
}

class Movie {
    private String name;
    private int time;
    private double price;
    public static int num1 = 11;

    //(1) 下面的三个构造器都有相同的语句
    //(2) 这样代码看起来比较冗余
    //(3) 这时我们可以把相同的语句，放入到一个代码块中，即可
    //(4) 这样当我们不管调用哪个构造器，创建对象，都会先调用代码块的内容
    //(5) 代码块调用的顺序优先于构造器..
    {
        System.out.println("电影屏幕打开...");
        System.out.println("广告开始...");
        System.out.println("电影正是开始...");
    }

    ;

    public Movie(String name, int time) {
        this.name = name;
        this.time = time;
        System.out.println("Movie(String name, int time) 被调用...");
    }

    public Movie(String name, int time, double price) {
        this.name = name;
        this.time = time;
        this.price = price;
        System.out.println("Movie(String name, int time, double price) 被调用...");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

class LLM {


    private int a;


    public LLM(int a) {
        System.out.println("构造方法被调用");
        this.a = a;
    }

    {
        System.out.println("LLM 1 代码块被调用");
    }

    ;


    {
        System.out.println("LLM 2 代码块被调用");
    }

    ;


    static {
        System.out.println("LLM STATIC1 代码块被调用");
    }

    ;

    static {
        System.out.println("LLM STATIC2 代码块被调用");
    }

    ;

}

class A{

    {
        System.out.println("AAA 的普通代码块");
    };

    public A() {
        System.out.println("A()被调用");
    }
}

class B extends A{
    public B() {
        System.out.println("B()被调用");
    }

    {
        System.out.println("BBB 的普通代码块...");
    }
}