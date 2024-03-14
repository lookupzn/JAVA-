package com.ning.file_;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Copy_ {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("d://a.jpg");
        FileOutputStream fos = new FileOutputStream("d://desc.jpg");

        byte[] b = new byte[1024];

        int len;

        while ((len = fis.read(b)) != -1) {
            fos.write(b, 0, len);
        }
        //先开后关，后开先关。
        fos.close();
        fis.close();
    }

}
