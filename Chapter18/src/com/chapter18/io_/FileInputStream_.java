package com.chapter18.io_;

import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.IOException;

//演示 FileInputStream 的使用(字节输入流 文件--> 程序)
public class FileInputStream_ {
    public static void main(String[] args) {

    }

    /**
     * 演示读取文件... * 单个字节的读取，效率比较低
     * -> 使用 read(byte[] b)
     */
    @Test
    public void readFile01() {
        String filePath = "C:\\Users\\29716\\Desktop\\File01\\hello.txt";
        int readData = 0;
        FileInputStream fileInputStream = null;
        try {
            //创建 FileInputStream 对象，用于读取 文件
            fileInputStream = new FileInputStream(filePath);
            //从该输入流读取一个字节的数据。 如果没有输入可用，此方法将阻止。
            //如果返回-1 , 表示读取完毕

            while ((readData = fileInputStream.read()) != -1) {
                //该代码是一个while循环，它从文件输入流中读取数据，
                //并检查该值是否不等于-1。如果值不等于-1，则会将数据转换为字符并打印出来。
                System.out.print((char) readData);//转成 char 显示
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
        //关闭文件流，释放资源.
            try {
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


    /**
     * 使用 read(byte[] b) 读取文件，提高效率
     */
    @Test
    public void readFile02() {
        String filePath = "C:\\Users\\29716\\Desktop\\File01\\a.txt";
        //字节数组
        byte[] buf = new byte[8]; //一次读取 8 个字节.
        int readLen = 0;
        FileInputStream fileInputStream = null;
        try {
            //创建 FileInputStream 对象，用于读取 文件
            fileInputStream = new FileInputStream(filePath);
            //从该输入流读取最多 buf.length 字节的数据到字节数组。 此方法将阻塞，直到某些输入可用。
            //如果返回-1 , 表示读取完毕
            //如果读取正常, 返回实际读取的字节数
            while ((readLen = fileInputStream.read(buf)) != -1) {
                System.out.print(new String(buf, 0, readLen));//显示
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
        //关闭文件流，释放资源.
            try {
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
