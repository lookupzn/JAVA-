package com.chapter21.homework_;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

public class H01Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket(InetAddress.getLocalHost(), 9999);

        InputStream inputStream = socket.getInputStream();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        String s = bufferedReader.readLine();
        System.out.println(s);

        OutputStream outputStream = socket.getOutputStream();
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream));

        while (!s.equals("exit")) {
            if (s.equals("name")) {
                bufferedWriter.write("nova");
            } else if (s.equals("hobby")) {
                bufferedWriter.write("编写Java程序");
            } else {
                bufferedWriter.write("说的啥？");
            }
            bufferedWriter.newLine();
            bufferedWriter.flush();
        }

    }
}
