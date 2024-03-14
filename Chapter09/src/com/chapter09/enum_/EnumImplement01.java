package com.chapter09.enum_;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

public class EnumImplement01 {
    public static void main(String[] args) {
    D yuanshen = D.原神;
    yuanshen.start();
    }
}

@Deprecated
class A{}

//enum B extends A{}//不允许对枚举扩展子句
//因为 enum 会隐式继承 Enum，而 Java 是单继承机制

enum C implements EnumImplementTest{}//enum 实现的枚举类，仍然是一个类，所以还是可以实现接口的
enum D implements SourceGod
{
    原神;
    @Override
    public void start()
    {
        System.out.println("原神启动");
    }
}


