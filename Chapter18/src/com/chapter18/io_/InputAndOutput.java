package com.chapter18.io_;

import java.io.*;

public class InputAndOutput {
    public static void main(String[] args) throws IOException {
        //读取 "C:\\Users\\29716\\Desktop\\File01\\data.txt" 文件到程序
        //思路
        //1. 创建字符输入流 BufferedReader [处理流]
        //2. 使用 BufferedReader 对象读取 a.txt
        //3. 默认情况下，读取文件是按照 utf-8 编码
        String filePath = "C:\\Users\\29716\\Desktop\\File01\\data.txt";
        BufferedReader br = new BufferedReader(new FileReader(filePath));
        String s = br.readLine();
        System.out.println("读取到的内容: " + s);
        br.close();
        //InputStreamReader
        //OutputStreamWriter

        // 演示使用 InputStreamReader 转换流解决中文乱码问题
        // 将字节流 FileInputStream 转成字符流 InputStreamReader, 指定编码 gbk/utf-8
        //将 2 和 3 合在一起
        BufferedReader br1 = new BufferedReader(new InputStreamReader(
                new FileInputStream(filePath), "gbk"));

        //4. 读取
        String s1 = br1.readLine();
        System.out.println("读取内容=" + s1);
//5. 关闭外层流
        br1.close();
    }
}
