package com.chapter18.homework_;

import java.io.*;

public class H02 {
    public static void main(String[] args) throws IOException {
        String filePath = "C:\\Users\\29716\\Desktop\\File02\\homework.java";
        FileInputStream fis = new FileInputStream(filePath);
        InputStreamReader gbk = new InputStreamReader(fis, "gbk");
        BufferedReader br = new BufferedReader(gbk);

        String line = null;
        int i = 1;
        while((line = br.readLine()) != null)
        {
            System.out.println(i + ":" + line);
            i++;
        }

    }
}
