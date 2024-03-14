package com.chapter18.io_;

import java.io.BufferedReader;
import java.io.FileReader;
/*
* 这段代码主要是使用BufferedReader来按行读取文件内容，并打印出来。
* 首先创建一个BufferedReader对象，它的构造方法中传入一个FileReader对象，用于读取文件内容。
* 然后使用while循环来读取文件内容，每次读取一行，直到读取完毕。
* 在循环中，使用bufferedReader.readLine()方法来读取文件内容，当读取到最后一行时，该方法会返回null
* ，循环结束。最后记得调用bufferedReader.close()方法来关闭流。
* 使用BufferedReader可以提高读取文件的效率，它会将文件内容缓存在内存中，每次读取一行，不会直接操作文件，从而减少IO操作的次数。
* */

public class BufferReader_ {
    public static void main(String[] args) throws Exception {
        String filePath = "C:\\Users\\29716\\Desktop\\File01\\a.java";
        //创建 bufferedReader
        BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));
        //读取
        String line; //按行读取, 效率高
        //说明
        //1. bufferedReader.readLine() 是按行读取文件
        //2. 当返回 null 时，表示文件读取完毕
        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
        }
        bufferedReader.close();
    }

        //关闭流, 这里注意，只需要关闭 BufferedReader ，因为底层会自动的去关闭 节点流
        //FileReader。
        /*
        public void close() throws IOException {
        synchronized (lock) {
        if (in == null)
        return;
        try {
        in.close();//in 就是我们传入的 new FileReader(filePath), 关闭了. } finally {
        in = null;
        cb = null;
        }
        }
        }
        */



}

