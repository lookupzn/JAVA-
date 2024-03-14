package com.chapter18.io_;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferWriter_ {
    public static void main(String[] args) throws IOException {
        //将韩顺平写进文件中
        String pathWay = "C:\\Users\\29716\\Desktop\\File01\\news4.txt";
        //创建 BufferedWriter
        //说明:
        //1. new FileWriter(filePath, true) 表示以追加的方式写入
        //2. new FileWriter(filePath) , 表示以覆盖的方式写入
        File news4 = new File(pathWay);
        news4.createNewFile();
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(pathWay,true));
        bufferedWriter.write("韩顺平");
        bufferedWriter.write("教育，hello");
        bufferedWriter.newLine();//插入一个和系统相关的换行
        bufferedWriter.write("hello2, 韩顺平教育!");

        //说明：关闭外层流即可 ， 传入的 new FileWriter(filePath) ,会在底层关闭
        bufferedWriter.close();

    }
}
