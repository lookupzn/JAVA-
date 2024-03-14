package com.ning.file_;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

//> 字符流，只能操作文本文件，不能操作图片，视频等非文本文件。
//>
//>
//> 当我们单纯读或者写文本文件时  使用字符流 其他情况使用字节流
//>

@SuppressWarnings({"all"})
public class FileWrtter03 {
    public static void main(String[] args) throws IOException {
        File file = new File("d://", "hello.java");
        file.createNewFile();
        FileWriter fw = new FileWriter(file);

        String fuck= "fuck";
        fw.write(fuck,0,4);
        fw.close();//先进先出了，字符流
        FileReader fr = new FileReader(file);

        int len;
        char[] c = new char[1024];

        while ((len = fr.read(c)) != -1)
        {
            System.out.println(c);
        }

        fr.close();//先进先出了，字符流


    }
}
