package com.ning.file_;

import java.io.FileWriter;
import java.io.IOException;

//JDK 7前
//之前的入门练习，我们一直把异常抛出，而实际开发中并不能这样处理，
//建议使用try...catch...finally 代码块，处理异常部分，代码使用演示：

public class HandleException {
    public static void main(String[] args) {
        // 声明变量
        FileWriter fw = null;
        try {
            //创建流对象
            fw = new FileWriter("fw.txt");
            // 写出数据
            fw.write("黑马程序员"); //黑马程序员
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fw != null) {
                    fw.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

