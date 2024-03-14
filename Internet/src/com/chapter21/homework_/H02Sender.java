package com.chapter21.homework_;

import java.io.IOException;
import java.net.*;
import java.util.Scanner;

public class H02Sender {
    public static void main(String[] args) throws IOException {
        //UDP发送数据：数据来自于键盘录入，直到输入的数据是886，发送数据结束
        //UDP接收数据：因为接收端不知道发送端什么时候停止发送，故采用死循环接收

        //1. 接收键盘数据
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入数据： ");
        String data = scanner.next();


        //2. 准备发送,找快递公司
        DatagramSocket datagramSocket = new DatagramSocket();


        //3.打包数据(塞入，字符及属性，主机名，端口），并且判断
        while (true)
        {
            if("886".equals(data))
            {
                break;
            }
            else
            {
                System.out.print("请输入数据： ");
                data = scanner.next();
            }
        }

        byte[] bys = data.getBytes();
        DatagramPacket dp = new DatagramPacket(bys, bys.length, InetAddress.getByName("127.0.0.1"), 9999);


        //4.发送数据
        datagramSocket.send(dp);


        //5.释放资源
        datagramSocket.close();

    }
}
