package com.chapter21.internet_;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class API_ {
    public static void main(String[] args) throws UnknownHostException {
        //获取本机 InetAddress 对象 getLocalHost
        InetAddress localHost = InetAddress.getLocalHost();
        System.out.println(localHost);//LAPTOP-7HO2JJG4/172.19.114.195

        //根据指定主机名/域名获取 ip 地址对象`` getByName
        InetAddress host2 = InetAddress.getByName("LAPTOP-7HO2JJG4");//LAPTOP-7HO2JJG4/172.19.114.195
        System.out.println(host2);
        InetAddress host3 = InetAddress.getByName("www.google.com");
        System.out.println(host3);//www.google.com/172.217.24.36

        //获取 InetAddress 对象的主机名 getHostName
        String host3Name = host3.getHostName();
        System.out.println(host3Name);//www.google.com

        //获取 InetAddress 对象的地址 getHostAddress
        String host3Address = host3.getHostAddress();
        System.out.println(host3Address);//172.217.24.36
    }
}
