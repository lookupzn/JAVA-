package com.chapter18.io_;

import java.io.*;

public class BufferCopy_ {
    public static void main(String[] args) {
        //利用BufferReader和BufferWriter完成文件复制
        //老韩说明
        //1. BufferedReader 和 BufferedWriter 是安装字符操作
        //2. 不要去操作 二进制文件[声音，视频，doc, pdf ], 可能造成文件损坏
        //BufferedInputStream
        //BufferedOutputStream
        String srcFilePath = "C:\\Users\\29716\\Desktop\\File01\\source1.txt";
        String destFilePath = "C:\\Users\\29716\\Desktop\\File01\\source2.txt";
        // String srcFilePath = "e:\\0245_韩顺平零基础学 Java_引出 this.avi";
        // String destFilePath = "e:\\a2 韩顺平.avi";
        BufferedReader br = null;
        BufferedWriter bw = null;
        String line;
        try {
            br = new BufferedReader(new FileReader(srcFilePath));
            bw = new BufferedWriter(new FileWriter(destFilePath));
            //说明: readLine 读取一行内容，但是没有换行
            while ((line = br.readLine()) != null) {
                //每读取一行，就写入
                bw.write(line);
                //插入一个换行
                bw.newLine();
            }
            System.out.println("拷贝完毕...");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //关闭流
            try {
                if (br != null) {
                    br.close();
                }
                if (bw != null) {
                    bw.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
