package com.ning.file_;

import java.io.*;

public class OutputStream01 {
    public static void main(String[] args) throws IOException {
//        FileOutputStream fos = new FileOutputStream("C://A.txt");//创建文件输出流以写入由指定的 File对象表示的文件。
        File file = new File("d://", "a.txt");
        file.createNewFile();
        FileOutputStream n1 = new FileOutputStream(file);//创建文件输出流以指定的名称写入文件。true(append) 代表续写
        byte[] b = "abc".getBytes();
//        n1.write(b);
//        n1.flush();
//        n1.write(b,0,3);
        n1.write(b);
        n1.close();



    }
}
