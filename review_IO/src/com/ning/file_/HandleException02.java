package com.ning.file_;

import java.io.FileWriter;
import java.io.IOException;

public class HandleException02 {
    public static void main(String[] args) {
        // 创建流对象
        try (FileWriter fw = new FileWriter("fw.txt"); ) {
            // 写出数据
            fw.write("黑马程序员"); //黑马程序员
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}