package com.chapter09.interface_;

public class Interface02 implements USB {

    @Override
    public void start() {
        System.out.println("手机开始工作...");
    }

    @Override
    public void stop() {
        System.out.println("手机停止工作.....");
    }

    public void call()
    {
        System.out.println("Call...");
    }


}
