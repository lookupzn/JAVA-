package com.chapter18.io_;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FIleCopy_ {
    public static void main(String[] args) {
        // 编程完成图片/音乐 的拷贝
        //1. 创建文件的输入流 , 将文件读入到程序
        //2. 创建文件的输出流， 将读取到的文件数据，写入到指定的文件
        String srcFilePath = "C:\\Users\\29716\\Desktop\\File01\\a.txt";
        String destFilePath = "C:\\Users\\29716\\Desktop\\File01\\a1.txt";
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;

        try {
            fileInputStream = new FileInputStream(srcFilePath);
            fileOutputStream = new FileOutputStream(destFilePath);
            //定义一个字节数组,提高读取效果
            byte[] buf = new byte[1024];
            int readLen = 0;
            while ((readLen = fileInputStream.read(buf)) != -1) {
            //读取到后，就写入到文件 通过 fileOutputStream
            //即，是一边读，一边写
                fileOutputStream.write(buf, 0, readLen);//一定要使用这个方法
            }
            System.out.println("拷贝 ok~");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {

            try {
            //关闭输入流和输出流，释放资源
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }


}
