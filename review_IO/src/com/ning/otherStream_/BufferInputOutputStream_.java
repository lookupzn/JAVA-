package com.ning.otherStream_;
/*
缓冲流,也叫高效流，是对4个基本的`FileXxx` 流的增强，所以也是4个流，按照数据类型分类：

- **字节缓冲流**：`BufferedInputStream`，`BufferedOutputStream`
- **字符缓冲流**：`BufferedReader`，`BufferedWriter`

缓冲流的基本原理，是在创建流对象时，会创建一个内置的默认大小的缓冲区数组，通过缓冲区读写，减少系统IO次数，从而提高读写的效率。
*/

import java.io.*;

public class BufferInputOutputStream_ {
    public static void main(String[] args) {
        File file = new File("d://","buffer.txt");
        try {
            BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file));
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("d://bos.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
