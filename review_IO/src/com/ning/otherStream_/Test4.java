package com.ning.otherStream_;

import java.io.*;
import java.util.ArrayList;

//1. 把若干学生对象 ，保存到集合中。
//2. 把集合序列化。
//3. 反序列化读取时，只需要读取一次，转换为集合类型。
//4. 遍历集合，可以打印所有的学生信息
public class Test4 {
    public static void main(String[] args) {
        //1. 将存有多个自定义对象的集合序列化操作，保存到`list.txt`文件中。
        //2. 反序列化`list.txt` ，并遍历集合，打印对象信息。
        Student student1 = new Student("Alice", "Smith");
        Student student2 = new Student("Bob", "Johnson");
        Student student3 = new Student("Carol", "Brown");
        ArrayList<Student> students = new ArrayList<>();
        ArrayList<Student> studentsReverse = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        try {
            FileOutputStream list = new FileOutputStream("list.txt");
            ObjectOutputStream oos = new ObjectOutputStream(list);
            for (Student student : students) {
                oos.writeObject(student);
            }

            FileInputStream listReverse = new FileInputStream("list.txt");
            ObjectInputStream ois = new ObjectInputStream(listReverse);
            try {

                for (int i = 0; i < students.size(); i++) {
                    studentsReverse.add((Student) ois.readObject());
                }

                for (Student student : studentsReverse) {
                    System.out.println(student);
                }
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
