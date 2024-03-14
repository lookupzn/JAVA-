package com.chapter09.homework;

public class H03 {

    public static void main(String[] args) {
        Phone phone = new Phone(3,0);
        phone.testWork();


    }
}

class Phone{
    private double x;
    private double y;

    public Phone(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }


    public void testWork()
    {
        PC phone = new PC() {
            @Override
            public double multi() {
                return x * y;
            }
            @Override
            public double add() {
                return x + y;
            }
            @Override
            public double remove() {
                return x - y;
            }
            @Override
            public double divide() {
                return x / y;
            }

        };


        System.out.println(phone.add());
        System.out.println(phone.multi());
        System.out.println(phone.remove());
        if (Phone.this.getY() != 0)
            System.out.println(phone.divide());
        else
            System.out.println("chu is unavailable!");

    }

}