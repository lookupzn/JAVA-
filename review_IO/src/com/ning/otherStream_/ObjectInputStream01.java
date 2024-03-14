package com.ning.otherStream_;

import java.io.*;

public class ObjectInputStream01 {
    public static void main(String[] args) {
        Employee employee = null;
        try {
            ObjectInputStream i = new ObjectInputStream(new FileInputStream("code.txt"));
            employee = (Employee) i.readObject();
            i.close();

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.out.println("Employee class not found");
            e.printStackTrace();
        }finally {
            System.out.println("Name: " + employee.name);	// zhangsan
            System.out.println("Address: " + employee.address); // beiqinglu
            System.out.println("age: " + employee.age); // 0
        }
    }
}
