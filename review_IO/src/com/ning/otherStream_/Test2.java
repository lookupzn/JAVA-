package com.ning.otherStream_;

import java.io.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

//1. 逐行读取文本信息。
//2. 把读取到的文本存储到集合中
//3. 对集合中的文本进行排序
//4. 遍历集合，按顺序，写出文本信息。
public class Test2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("d://desc.txt"));
            BufferedReader bufferedReader = new BufferedReader(new FileReader("d://test0.txt"));

            //1. 逐行读取信息
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                list.add(line);
            }

            Collections.sort(list, new Comparator<String>() {
                @Override
                public int compare(String o1, String o2) {
                    return o1.charAt(0) - o2.charAt(0);
                }
            });

            for(String s:list)
            {
                bw.write(s);
                bw.flush();
                bw.newLine();
                bw.flush();
            }

            bw.close();
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
