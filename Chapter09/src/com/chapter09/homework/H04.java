package com.chapter09.homework;

import java.util.Scanner;

public class H04 {
    public static void main(String[] args) {
//        System.out.println(A.show());
        Person Tang = new Person("唐僧");
        Tang.choose();
    }
}

//class A{
//
//    public static String show()
//    {
//
//        class B{
//            final String NAME = "NAME";
//        }
//        B b = new B();
//        return b.NAME;
//    }
//
//}
class Horse implements Vehicles {
    @Override
    public void work() {
        System.out.println("使用马作为交通工具");
    }
}

class Boat implements Vehicles {
    @Override
    public void work() {
        System.out.println("使用船作为交通工具");
    }
}

class VehicleFactory {

    private Boat boat;
    private Horse horse;

    public VehicleFactory(Boat boat) {
        this.boat = boat;
    }

    public VehicleFactory(Horse horse) {
        this.horse = horse;
    }

    public Boat getBoat() {
        return boat;
    }

    public Horse getHorse() {
        return horse;
    }
}

class Person {
    private String name;
    private Vehicles vehicle;
    Scanner scanner = new Scanner(System.in);

    public Person(String name) {
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Vehicles getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicles vehicle) {
        this.vehicle = vehicle;
    }

    public void choose() {
        System.out.print("请输入现在的地形：（地面 or 河水） ");
        String choice = scanner.next();
        for (; ; ) {
            if (choice.equals("地面")) {
                vehicle = new VehicleFactory(new Horse()).getHorse();
                vehicle.work();
                return;
            } else if (choice.equals("河水")) {
                vehicle = new VehicleFactory(new Boat()).getBoat();
                vehicle.work();
                return;
            } else {
                System.out.println("请输入正确的地形");
            }
        }

    }
}
