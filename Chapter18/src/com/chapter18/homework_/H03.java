package com.chapter18.homework_;

import java.io.*;
import java.util.Properties;

public class H03 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Properties dog01 = new Properties();
        dog01.setProperty("name","Tom");
        dog01.setProperty("age","6");
        dog01.setProperty("color","red");
        dog01.store(new FileWriter("D:\\JAVA\\Chapter18\\src\\dog.properties"),"Homework 03");
        Doggy doggy = new Doggy(dog01.getProperty("name"), Integer.parseInt(dog01.getProperty("age")), dog01.getProperty("color"));
        String filePath = "C:\\Users\\29716\\Desktop\\File01\\dog.dat";
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath));
        oos.writeObject(doggy);
        oos.close();
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath));
        System.out.println(ois.readObject());
        ois.close();

    }
}

class Doggy implements Serializable {
    private String name;
    private int age;
    private String color;

    public Doggy(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
