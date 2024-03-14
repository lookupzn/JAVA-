package com.chapter09.interface_;

public class Interface01 implements USB,A1 //一个类同时可以实现多个接口，实际上是对单继承机制的补充，即单继承基础上可以使用多接口机制继承多个接口
{//实现接口,就是把接口方法实现

    @Override
    public void start() {
        System.out.println("相机开始工作...");
    }

    @Override
    public void stop() {
        System.out.println("相机停止工作....");
    }

}


