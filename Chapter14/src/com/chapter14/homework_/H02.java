package com.chapter14.homework_;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class H02 {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        List carList = new ArrayList();
        Car car1 = new Car("BMW",300000.0);
        Car car2 = new Car("Benz",450000.0);
        Car car3 = new Car("Tiger",230000.0);
        Car car4 = new Car("B",650000.0);
        carList.add(0,car1);
        carList.add(car2);
        carList.add(1,new Car("BYD",100000.0));
        carList.remove(car1);
        System.out.println(carList.size());
        System.out.println(carList.isEmpty());
        carList.clear();
        LinkedList addList = new LinkedList();
        addList.add(car3);
        addList.add(car4);
        carList.addAll(addList);
        System.out.println(carList);
        System.out.println(carList.containsAll(addList));


    }
}

class Car
{
    private String name;
    private double price;

    public Car(String name, double price) {
        this.name = name;
        this.price = price;
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

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
