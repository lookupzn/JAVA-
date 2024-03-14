package com.chapter18.io_;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

public class FileCreate {
    public static void main(String[] args) {

    }

    //方式 1 new File(String pathname)
    @Test
    public void create01() {
        String filePath = "C:\\Users\\29716\\Desktop\\File01\\news1.txt";
        File file = new File(filePath);
        try {
            file.createNewFile();
            System.out.println("文件创建成功");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void create02() {
        File parentFile = new File("C:\\Users\\29716\\Desktop\\File01");
        String fileName = "news2.txt";
        File file = new File(parentFile,fileName);
        try {
            file.createNewFile();
            System.out.println("文件创建成功");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void create03() {
        String parentPath = "C:\\Users\\29716\\Desktop\\File01";
        String fileName = "news3.txt";
        File file = new File(parentPath,fileName);
        try {
            file.createNewFile();
            System.out.println("文件创建成功");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

//下面四个都是抽象类
//
//InputStream
//OutputStream
//Reader //字符输入流
//Writer //字符输出流