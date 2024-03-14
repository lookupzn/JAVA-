package com.chapter18.homework_;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class H01 {
    public static void main(String[] args) throws IOException {
        String pathway = "C:\\Users\\29716\\Desktop\\File02";
        File file = new File(pathway);
        file.mkdir();
        File hello = new File(pathway, "Hello.txt");
        if (hello.exists() == false) {
            hello.createNewFile();
            FileWriter fw = new FileWriter("C:\\Users\\29716\\Desktop\\File02\\Hello.txt");
            fw.write("HelloWorld!");
            fw.close();
        } else {
            System.out.println("文件已创建");
        }


    }
}
