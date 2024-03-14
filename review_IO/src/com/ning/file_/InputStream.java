package com.ning.file_;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class InputStream {
    public static void main(String[] args) throws IOException {
        File file = new File("d://", "t.txt");
        file.createNewFile();
        FileInputStream fileInputStream = new FileInputStream(file);
//        FileInputStream fis = new FileInputStream("d://tt.txt");



//        int read = fileInputStream.read();//文档内容”1 2 3“
//        System.out.println(read);//49
//        read = fileInputStream.read();
//        System.out.println(read);//32
//        read = fileInputStream.read();
//        System.out.println(read);//50
//        read = fileInputStream.read();
//        System.out.println(read);//32
//        read = fileInputStream.read();
//        System.out.println(read);//51
//        read = fileInputStream.read();
//        System.out.println(read);//-1


//        int w = 0;//文档内容”1 2 3“
//        while((w = fileInputStream.read() )!= -1)
//        {
//            System.out.println((char)w);
//        }

        byte[] b = new byte[1024];
        int w;
        while ((w = fileInputStream.read(b)) != -1)
        {
            System.out.println(new String(b));//1 2 3
            System.out.println(new String(b,0,3));//1 2
        }

        fileInputStream.close();

        //错误数据d，是由于最后一次读取时，只读取一个字节e，数组中，上次读取的数据没有被完全替换，所以要通过len ，获取有效的字节，代码使用演示：
        /*public class FISRead {
    public static void main(String[] args) throws IOException{
      	// 使用文件名称创建流对象.
       	FileInputStream fis = new FileInputStream("read.txt"); // 文件中为abcde
      	// 定义变量，作为有效个数
        int len ；
        // 定义字节数组，作为装字节数据的容器
        byte[] b = new byte[2];
        // 循环读取
        while (( len= fis.read(b))!=-1) {
           	// 每次读取后,把数组变成字符串打印
            System.out.println(new String(b));
        }
		// 关闭资源
        fis.close();
    }
        }*/


        //如何改进
        /*public class FISRead {
    public static void main(String[] args) throws IOException{
      	// 使用文件名称创建流对象.
       	FileInputStream fis = new FileInputStream("read.txt"); // 文件中为abcde
      	// 定义变量，作为有效个数
        int len ；
        // 定义字节数组，作为装字节数据的容器
        byte[] b = new byte[2];
        // 循环读取
        while (( len= fis.read(b))!=-1) {
           	// 每次读取后,把数组的有效字节部分，变成字符串打印
            System.out.println(new String(b，0，len));//  len 每次读取的有效字节个数
        }
		// 关闭资源
        fis.close();
            }
        }
        */
    }
}
