package com.chapter09.interface_;

public interface USB extends A1, A2 //接口不能继承其它的类,但是可以继承多个别的接口
        //接口的修饰符 只能是 public 和默认，这点和类的修饰符是一样的
{
    public void start();

    public void stop();
}
