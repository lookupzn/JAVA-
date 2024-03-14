package com.chapter13.homework_;

import javax.naming.Name;
import java.util.Scanner;

public class H02 {
    public static void main(String[] args) {
        User user = new User();
        user.getName();


    }
}

class User{
    private String name;
    private int pwd;
    private String emailAddress;
    Scanner scanner = new Scanner(System.in);
    //注册所需信息
    //注意：输入信息时候若不符合格式，抛出异常


    public String getName() throws NameException{

        //要求1：名字在2 - 4个字符之间
        System.out.print("请输入姓名（2-4 个字符）： ");
        String name = scanner.next();
        if(name.length() >= 2 && name.length() <= 4)
        {return name;}
        else
        {
            throw new NameException("姓名格式异常，请输入2-4个字符");
        }
    }


    public int getPwd() throws PwdException{
        //要求2：pwd必须是6个数字
        System.out.print("请输入6位数字密码： ");

        if(pwd >= 100000 && pwd <= 999999)
        {return pwd;}
        else
        {
            throw new PwdException("密码格式异常，请输入6位密码");
        }

    }



    public String getEmailAddress() {
        return emailAddress;
    }

}

