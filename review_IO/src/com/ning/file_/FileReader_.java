package com.ning.file_;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReader_ {
    public static void main(String[] args) throws IOException {
        File file = new File("d://t.txt");
        FileReader fr = new FileReader(file);
//        FileReader fr1 = new FileReader("d://t.txt");

        int b;//内容：”1 2 3“
//        while((b = fr.read()) != -1)
//        {
//            System.out.println((char) b);//输出：1  2  3
//        }
        char[] cbuf = new char[1024];
        while((b = fr.read(cbuf)) != -1)
        {
            System.out.println(cbuf);//输出：1 2 3
        }

        fr.close();
    }
}
