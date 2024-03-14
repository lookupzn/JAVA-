package com.chapter18.io_;

import org.junit.jupiter.api.Test;

import java.io.FileReader;
import java.io.IOException;

public class FileReader_ {
    public static void main(String[] args) {

    }

    @Test
    public void readFile01() {
        /*
         * 单个字符读取文件
         */
        String filePath = "C:\\Users\\29716\\Desktop\\File01\\story.txt";
        FileReader fileReader = null;
        int data = 0;
        char[] bur = new char[8];
        //1. 创建 FileReader 对象
        try {
            fileReader = new FileReader(filePath);
            //循环读取 使用 read, 单个字符读取
            while ((data = fileReader.read(bur)) != -1) {
                System.out.print(new String(bur, 0, data));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if (fileReader != null) {
                    fileReader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}


