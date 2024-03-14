package com.ning.otherStream_;

import java.io.*;

public class OutputStreamWriter01 {
    public static void main(String[] args) {
        try {
//            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream("d://s1.java"));
//            OutputStreamWriter outputStreamWriter1 = new OutputStreamWriter(new FileOutputStream("d://s1.java"),"GBK");
////        outputStreamWriter.write("你好");
//        outputStreamWriter1.write("你好");

            InputStreamReader i = new InputStreamReader(new FileInputStream("d://s1.java"),"GBK");
            int a;
            while((a = i.read()) != -1)
            {
                System.out.print((char) a);
            }

            i.close();
//            outputStreamWriter1.close();
//            outputStreamWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
