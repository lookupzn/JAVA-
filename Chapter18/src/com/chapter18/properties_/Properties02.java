package com.chapter18.properties_;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Properties02 {
    public static void main(String[] args) throws IOException {
        //1.  创建properties对象
        Properties properties = new Properties();
        //2.  加载指定文件
        properties.load(new FileReader("D:\\JAVA\\Chapter18\\src\\mysql.properties"));
        //3.  K-V显示控制台
        properties.list(System.out);
        String user = properties.getProperty("name");
        System.out.println(user);
    }
}
