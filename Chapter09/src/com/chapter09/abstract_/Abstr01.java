package com.chapter09.abstract_;

public class Abstr01 {
    public static void main(String[] args) {

    }
}

class Animal {
    private int age;
    private String sort;

    public Animal(int age, String sort) {
        this.age = age;
        this.sort = sort;
    }

    public void eat()//任何动物都有eat行为
    {
        System.out.println("好好吃！");
    }

    //当父类的方法需要声明却不知道如何实现，我们使用抽象类来完成
}

abstract class bigAnimal {
    private String name;

    public bigAnimal(String name) {
        this.name = name;
    }

    //思考：这里 eat 这里你实现了，其实没有什么意义
    //即： 父类方法不确定性的问题
    //===> 考虑将该方法设计为抽象(abstract)方法
    //===> 所谓抽象方法就是没有实现的方法
    //===> 所谓没有实现就是指，没有方法体
    //===> 当一个类中存在抽象方法时，需要将该类声明为 abstract 类
    //===> 一般来说，抽象类会被继承，有其子类来实现抽象方法.
    // public void eat() {
    // System.out.println("这是一个动物，但是不知道吃什么..");}
    public abstract void eat();

}
