package com.ning.otherStream_;

import java.io.*;

public class BufferSpeed {
    public static void main(String[] args) {
        File file = new File("d://", "steam.exe");
        long start = System.currentTimeMillis();
        try {
            try (BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file))) {
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream("D:\\test\\steam.exe"));
                int b;
                byte[] bytes = new byte[1024];
                while ((b = bufferedInputStream.read(bytes)) != -1) bufferedOutputStream.write(bytes,0,b);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            long end = System.currentTimeMillis();
            System.out.println("缓冲流复制时间:" + (end - start) + " 毫秒");//缓冲流复制时间:177 毫秒,可以通过数组byte【】提高效率 79 毫秒
        }


    }
}
