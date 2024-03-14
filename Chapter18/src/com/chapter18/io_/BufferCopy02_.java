package com.chapter18.io_;

import java.io.*;

public class BufferCopy02_ {
    public static void main(String[] args) {
        /*
         * 演示使用 BufferedOutputStream 和 BufferedInputStream 使用
         * 使用他们，可以完成二进制文件拷贝.
         * 思考：字节流可以操作二进制文件，可以操作文本文件吗？当然可以
         */

        String srcFilePath = "C:\\Users\\29716\\Desktop\\File01\\source1.txt";
        String destFilePath = "C:\\Users\\29716\\Desktop\\File01\\source3.txt";

        //创建 BufferedOutputStream 对象 BufferedInputStream 对象
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        try {
            bis = new BufferedInputStream(new FileInputStream(srcFilePath));
            bos = new BufferedOutputStream(new FileOutputStream(destFilePath));
            //循环的读取文件，并写入到 destFilePath
            byte[] buff = new byte[1024];
            int readLen = 0;
            //当返回 -1 时，就表示文件读取完毕
            while ((readLen = bis.read(buff)) != -1) {
                bos.write(buff, 0, readLen);
            }
            System.out.println("文件拷贝完毕~~~");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {

            try {
                if (bis != null) {
                    bis.close();
                }
                if (bos != null) {
                    bos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }


        }
    }
}
