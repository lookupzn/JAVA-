package com.chapter10.exception_;

import java.io.FileInputStream;
import java.io.IOException;

public class Exception01 {
    public static void main(String[] args) {
//        try {
//            FileInputStream fis;
//            fis = new FileInputStream("d:\\aa.jpg");
//            int len;
//            while ((len = fis.read()) != -1) {
//                System.out.println(len);
//            }
//            fis.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        int num1 = 10;
//        int num2 = 0;
//        try {
//            int res = num1 / num2;
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
        try {
            Person person = new Person();
//person = null;
            System.out.println(person.getName());//NullPointerException
            int n1 = 10;
            int n2 = 0;
            int res = n1 / n2;//ArithmeticException
        }
        //1.如果 try 代码块有可能有多个异常
        //2.可以使用多个 catch 分别捕获不同的异常，相应处理
        //3.要求子类异常写在前面，父类异常写在后面
//        catch (NullPointerException e) {
//            System.out.println("空指针异常=" + e.getMessage());
//        } catch (ArithmeticException e) {
//            System.out.println("算术异常=" + e.getMessage());
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
            finally {
            /*
            可以进行 try-finally 配合使用, 这种用法相当于没有捕获异常，
            因此程序会直接崩掉/退出。应用场景，就是执行一段代码，不管是否发生异常，
            都必须执行某个业务逻辑
            */
        }
    }
}

class Person {
    private String name = "jack";

    public String getName() {
        return name;
    }
}
