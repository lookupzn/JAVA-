package com.chapter18.io_;

import org.junit.jupiter.api.Test;

import java.io.File;

public class FileDelete {
    public static void main(String[] args) {

    }

    @Test
    public void delete01(){
        File file = new File("C:\\Users\\29716\\Desktop\\File01\\news1.txt");
        if(file.exists())
        {
            file.delete();
        }
    }

    @Test
    public void delete02(){
        File file = new File("C:\\Users\\29716\\Desktop\\File01\\news1.txt");
        if(file.exists())
        {
            file.delete();
        }
        else
        {
            System.out.println("news1不存在 ");
        }
    }

    @Test
    public void delete03(){
        File file = new File("C:\\Users\\29716\\Desktop\\File01\\a\\b\\c\\d");
        if(file.mkdirs() == false)
        {
            System.out.println("目录已经存在");
        }
        else
        {
            file.mkdirs();
        }
    }
}
