package com.ning.otherStream_;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class Test3 {
    public static void main(String[] args) {
        //1. 指定GBK编码的转换流，读取文本文件。
        //2. 使用UTF-8编码的转换流，写出文本文件。

        try {
            InputStreamReader isr = new InputStreamReader(new FileInputStream("d://s.java"),"GBK");
            OutputStreamWriter osr = new OutputStreamWriter(new FileOutputStream("d://file_utf8.txt"), StandardCharsets.UTF_8);
            int i;
            char[] c = new char[1024];
            while((i = isr.read(c)) != -1)
            {
                osr.write(c,0,i);
            }



            osr.close();
            isr.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
