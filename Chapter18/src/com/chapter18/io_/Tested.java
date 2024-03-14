package com.chapter18.io_;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

public class Tested {
    public static void main(String[] args) throws IOException {
        String a = "C:\\Users\\29716\\Desktop\\test";
        File a1 = new File(a);
        new File(a1,a);
        String b = "C:\\Users\\29716\\Desktop\\代码";
        File a2 = new File(a,b);
        //有两种形式的File类构造函数：一种接收文件名和路径的字符串参数，另一种接收文件对象作为参数。
        // 例如，File file1 = new File("C:\Users\John\Documents\example.txt"); 和 File file2 = new File("C:\Users\John\Documents", "example.txt");
        // 这两种形式都可以创建一个名为"example.txt"的文件，并将其保存在"C:\Users\John\Documents"路径下。

        File tester = new File(a,"example.txt");
        System.out.println(tester.exists());
        //        try {
        //            tester.createNewFile();
        //        } catch (IOException e) {
        //            e.printStackTrace();
        //        }
        System.out.println(tester.getAbsolutePath());
        tester.delete();
        System.out.println(tester.getParent());
        System.out.println(tester.isDirectory());
        System.out.println(tester.getParentFile().getAbsolutePath());
        tester.getParentFile().createNewFile();
        //一些常用的File类方法包括createNewFile()、exists()、getAbsolutePath()、delete()、getName()、length()、getParent()、list()和isDirectory()。
        // createNewFile()方法可以用来创建一个新文件，如果文件已经存在则返回false。exists()方法可以用来检查文件是否存在，如果存在则返回true。
        // getAbsolutePath()方法可以用来获取文件的绝对路径。delete()方法可以删除文件。getName()方法可以获取文件的名称。
        // length()方法可以获取文件的大小。getParent()方法可以获取文件的父目录。list()方法可以获取指定目录下的所有文件和子目录。isDirectory()方法可以判断是否为目录。
        // getParentFile(): 该方法用于获取文件的父目录，返回一个File对象。如果文件没有父目录，或者无法从文件名中获取父目录，则返回null。
    }

    @Test
    public void test01(){
        File file = new File("C:\\Users\\29716\\Desktop\\test\\example1.txt");
//        file.mkdir();
        //该方法用于创建一个新的目录，如果目录已经存在则返回false。它接收一个路径名作为参数，可以是相对路径或者绝对路径。
        // 例如，mkdir("C:\\Users\\John\\Documents\\example")就可以在指定路径下创建一个名为"example"的新目录。
        file.mkdirs();
        //该方法与mkdir()类似，但是它可以创建多级目录。
        // 例如，如果要在指定路径下创建一个名为"example1"的子目录和一个名为"example2"的子目录，
        // 可以使用mkdirs("C:\\Users\\John\\Documents\\example1\\example2")。如果父目录不存在，该方法会自动创建。

    }

}
