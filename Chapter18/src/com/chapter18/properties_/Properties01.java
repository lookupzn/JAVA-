package com.chapter18.properties_;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Properties01 {
    public static void main(String[] args) throws IOException {
        //读取配置文件并得到对应元素
        BufferedReader br = new BufferedReader(new FileReader("D:\\JAVA\\Chapter18\\src\\mysql.properties"));

        //循环读取
        String line = "";
        while((line = br.readLine()) != null)
        {
            String[] split = line.split("=");
            System.out.println(split[0] + ":" + split[1]);
        }
        br.close();
    }
}
