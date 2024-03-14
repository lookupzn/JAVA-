package com.chapter09.homework;

public class H02 {
    public static void main(String[] args) {
    Animal cat = new Cat();
    cat.shout();
    Animal dog = new Dog();
    dog.shout();
    }
}

abstract class Animal
{
    abstract void shout();

}

class Cat extends Animal
{
    public void shout()
    {
        System.out.println("meow！");
    }

}

class Dog extends Animal
{
    public void shout()
    {
        System.out.println("wow！");
    }

}
