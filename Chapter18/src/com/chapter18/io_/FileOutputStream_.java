package com.chapter18.io_;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStream_ {
    public static void main(String[] args) {
        //要求: 请使用 FileOutputStream 在 a.txt 文件，中写入 “hello，world”. [老师代码演示],
        //如果文件不存在，会创建文件(注意：前提是目录已经存在.)
    }

    @Test
    public void helloWorld01(){
        String pathName = "C:\\Users\\29716\\Desktop\\File01\\a.txt";
        File file = new File(pathName);
        FileOutputStream fileOutputStream = null;
        if(file.exists() == false)
        //1.如果没有文件则先创建一个文件
        {
            try {
                file.createNewFile();
                System.out.println("文件创建成功");
                //利用重写返回方法
                helloWorld01();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        else {
            //得到 FileOutputStream 对象 对象
            //老师说明
            //1. new FileOutputStream(filePath) 创建方式，当写入内容是，会覆盖原来的内容
            //2. new FileOutputStream(filePath, true) 创建方式，当写入内容是，是追加到文件后面
            try {
                //追加到文件后面继续写
                //fileOutputStream = new FileOutputStream(pathName,true);
                fileOutputStream = new FileOutputStream(pathName);
                //写入一个字节
                //fileOutputStream.write('H');//
                //写入字符串
                String str = "hsp,world!";
                //str.getBytes() 可以把 字符串-> 字节数组
                //fileOutputStream.write(str.getBytes());
                /*
                write(byte[] b, int off, int len) 将 len 字节从位于偏移量 off 的指定字节数组写入此文件输出流
                */
                try {
                    fileOutputStream.write(str.getBytes(), 0, 9);

                } catch (IOException e) {
                    e.printStackTrace();
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }finally {
                try {
                    fileOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
