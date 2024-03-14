package com.collection_.generics_;

import java.util.ArrayList;
import java.util.Iterator;

public class GenericsPractice {
    public static void main(String[] args) {
        ArrayList<BoSiCat> boSiCats = new ArrayList<>();
        boSiCats.add(new BoSiCat("Cindy"));
        boSiCats.add(new BoSiCat("Merry"));
        keepPet(boSiCats);

    }

    public static void keepPet(ArrayList<? extends Animal> list){
        Iterator<? extends Animal> iterator = list.iterator();
        while (iterator.hasNext()) {
            Animal next =  iterator.next();
            next.eat();
            System.out.println(next);
        }



        //遍历集合并调用动物的eat方法
    }

}

class Animal{
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                '}';
    }

    public void eat() {

    }
}

class Cat extends Animal{
    public Cat(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Cat{  " + super.toString() + "}";
    }
}

class BoSiCat extends Cat{
    public BoSiCat(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "BoSi" + super.toString();
    }


    public void eat(){
        System.out.println("一只叫" + getName() + "的波斯猫在吃东西");
    }

}

class LiHuaCat extends Cat{
    public LiHuaCat(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "LiHua" + super.toString();
    }

    public void eat(){
        System.out.println("一只叫" + getName() + "的狸花猫在吃东西");
    }
}

class Dog extends Animal{
    public Dog(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Dog{  " + super.toString() + "}";
    }
}

class TaiDiDog extends Dog{
    public TaiDiDog(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "TaiDi" + super.toString();
    }

    public void eat(){
        System.out.println("一只叫" + getName() + "的泰迪犬在吃东西");
    }
}

class HaShiQiDog extends Dog{
    public HaShiQiDog(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "HaShiQi" + super.toString();
    }

    public void eat(){
        System.out.println("一只叫" + getName() + "的哈士奇在吃东西");
    }
}
