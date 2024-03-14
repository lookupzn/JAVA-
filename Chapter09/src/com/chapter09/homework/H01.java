package com.chapter09.homework;

public class H01 {
    public static void main(String[] args) {
        Frock frock = new Frock();
        System.out.println(frock.getNextNum());
        System.out.println(frock.getNextNum());
        System.out.println("===frock.getNextNum()调用结束===");
        Frock frock1 = new Frock();
        System.out.println(frock1.getSerialNum());
        Frock frock2 = new Frock();
        System.out.println(frock2.getSerialNum());
        Frock frock3 = new Frock();
        System.out.println(frock3.getSerialNum());



    }
}


class Frock
{
    static private int currentNum = 100000;
    private int serialNum;

    static public int getNextNum(){
        currentNum += 100;
        return currentNum;
    }

    public int getSerialNum() {
        return serialNum;
    }

    public Frock() {
        serialNum = getNextNum();
    }
}
