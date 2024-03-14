package com.chapter18.io_;


import java.io.*;

public class ObjectStream_ {
    public static void main(String[] args) throws Exception {
    //演示 ObjectOutputStream 的使用, 完成数据的序列
    //序列化后，保存的文件格式，不是存文本，而是按照他的格式来保存
        String filePath = "C:\\Users\\29716\\Desktop\\File01\\data.dat";
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath));
        //序列化数据到 e:\data.dat
        oos.writeInt(100);// int -> Integer (实现了 Serializable)
        oos.writeBoolean(true);// boolean -> Boolean (实现了 Serializable)
        oos.writeChar('a');// char -> Character (实现了 Serializable)
        oos.writeDouble(9.5);// double -> Double (实现了 Serializable)
        oos.writeUTF("韩顺平教育");//String
        //保存一个 dog 对象
        oos.writeObject(new Dog(18, "旺财", "日本", "白色"));
        oos.writeObject(new Dog(18, "旺财", "日本", "白色"));
        oos.close();
        System.out.println("数据保存完毕(序列化形式)");



        // 1.创建流对象
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:\\Users\\29716\\Desktop\\File01\\data.dat"));
        // 2.读取， 注意顺序
        System.out.println(ois.readInt());
        System.out.println(ois.readBoolean());
        System.out.println(ois.readChar());
        System.out.println(ois.readDouble());
        System.out.println(ois.readUTF());
        System.out.println(ois.readObject());
        System.out.println(ois.readObject());

        // 3.关闭
        ois.close();
        System.out.println("以反序列化的方式读取(恢复)ok~");


    }
}

class Dog implements Serializable {
    private int age;
    private String name;
    private String color;
    private String country;

    public Dog(int age, String name, String color, String country) {
        this.age = age;
        this.name = name;
        this.color = color;
        this.country = country;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
