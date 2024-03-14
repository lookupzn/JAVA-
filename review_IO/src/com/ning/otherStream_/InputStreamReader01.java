package com.ning.otherStream_;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReader01 {
    public static void main(String[] args) {
        try {
            InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream("d://s.java"));// 默认是UTF - 8编码
            InputStreamReader inputStreamReader1 = new InputStreamReader(new FileInputStream("d://s.java"),"GBK");//设置为 GBK 编码
            int read;
            while((read = inputStreamReader.read()) != -1)
            {
                //"�ҽ�������" 此时会出现乱码，因为规则不匹配
                System.out.print((char) read);
            }
            System.out.println("\n================");
            int read1;
            while((read1 = inputStreamReader1.read()) != -1)
            {
                System.out.print((char) read1);//"我叫王富贵"
            }
            inputStreamReader1.close();
            inputStreamReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
