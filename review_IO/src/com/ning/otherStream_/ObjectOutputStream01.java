package com.ning.otherStream_;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

//1. 一个对象要想序列化，必须满足两个条件:
//- 该类必须实现`java.io.Serializable`  接口，`Serializable` 是一个标记接口，
// 不实现此接口的类将不会使任何状态序列化或反序列化，会抛出`NotSerializableException` 。
//- 该类的所有属性必须是可序列化的。如果有一个属性不需要可序列化的，则该属性必须注明是瞬态的，使用`transient` 关键字修饰。
public class ObjectOutputStream01 {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.name = "zhangsan";
        e1.address = "beiqinglu";
        e1.age = 20;
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("d://code.txt");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(e1);
            // 释放资源
            objectOutputStream.close();
            fileOutputStream.close();
            System.out.println("Serialized data is saved");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

