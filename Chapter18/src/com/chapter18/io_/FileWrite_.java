package com.chapter18.io_;

import org.junit.jupiter.api.Test;

import java.io.FileWriter;
import java.io.IOException;

public class FileWrite_ {
    public static void main(String[] args) {

    }

    @Test
    public void WriteFile01() {
        String filePath = "C:\\Users\\29716\\Desktop\\File01\\story.txt";
        //创建 FileWriter 对象
        FileWriter fileWriter = null;
        char[] chars = {'a', 'b', 'c'};
        try {
            fileWriter = new FileWriter(filePath);//默认是覆盖写入
            // 3) write(int):写入单个字符
            fileWriter.write('H');
            // 4) write(char[]):写入指定数组
            fileWriter.write(chars);
            // 5) write(char[],off,len):写入指定数组的指定部分
            fileWriter.write("韩顺平教育".toCharArray(), 0, 3);
            // 6) write（string）：写入整个字符串
            fileWriter.write(" 你好北京~");
            fileWriter.write("风雨之后，定见彩虹");
            // 7) write(string,off,len):写入字符串的指定部分
            fileWriter.write("上海天津", 0, 2);
            //在数据量大的情况下，可以使用循环操作

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        System.out.println("程序结束...");
        }
    }
}

//对应 FileWriter , 一定要关闭流，或者 flush 才能真正的把数据写入到文件
//老韩看源码就知道原因.
//
/*
看看代码
    private void writeBytes() throws IOException {
        this.bb.flip();
        int var1 = this.bb.limit();
        int var2 = this.bb.position();
        assert var2 <= var1;
        int var3 = var2 <= var1 ? var1 - var2 : 0;
        if (var3 > 0) {
        if (this.ch != null) {
        assert this.ch.write(this.bb) == var3 : var3;
        } else {
        this.out.write(this.bb.array(), this.bb.arrayOffset()
        }
        }
        this.bb.clear();
        }
        */