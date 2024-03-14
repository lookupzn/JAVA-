package com.chapter21.homework_;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class H02Receiver {
    public static void main(String[] args) throws IOException {
        byte[] bytes = new byte[1024];
        DatagramSocket datagramSocket = new DatagramSocket(9999);
        DatagramPacket datagramPacket = new DatagramPacket(bytes, bytes.length);
        datagramSocket.receive(datagramPacket);
        System.out.println(new String(datagramPacket.getData(),0,datagramPacket.getLength()));
        datagramSocket.close();
    }
}
