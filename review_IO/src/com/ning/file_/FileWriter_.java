package com.ning.file_;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriter_ {
    public static void main(String[] args) throws IOException {
        File file = new File("d://ttt.txt");
        file.createNewFile();
        FileWriter fw = new FileWriter(file);//创建文件输出流以指定的名称写入文件。true(append) 代表续写
//        FileWriter fw1 = new FileWriter("d://ttt.txt");
        fw.write(97);
        fw.write('b');
        fw.write('c');
        fw.write('\n');
        fw.write("Hello!");
//        fw.write("Hello!");
        fw.close();
        /*
        【注意】关闭资源时,与FileOutputStream不同。
      	 如果不关闭,数据只是保存到缓冲区，并未保存到文件。
        */


    }
}
