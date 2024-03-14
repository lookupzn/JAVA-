package com.chapter09.designPattern.single_;
//饿汉式

public class Single01 {
    public static void main(String[] args) {
        GirlFriend instance = GirlFriend.getInstance();
        System.out.println(instance);//默认调用toString（）
        GirlFriend instance2 = GirlFriend.getInstance();
        System.out.println(instance2);
        System.out.println(instance == instance2);//T,因为只有一个对象


    }


}

//一个人只能一个女朋友 --> 单例设计模式：某个类只能有一个对象实例
class GirlFriend {
    private String name;

    //保障我们只能创建一个 GirlFriend 对象
    //對象，通常是重量級的對象, 餓漢式可能造成創建了對象，但是沒有使用.

    //1. 构造器私有化（防止直接new个新的对象实例）
    private GirlFriend(String name) {
        System.out.println("構造器被調用.");
        this.name = name;
    }

    //2. 在类的内部直接创建对象(该对象是 static)，即使没有在主方法或其他地方创建新的对象，也会有这个对象存在
    private static GirlFriend gf = new GirlFriend("小红红");

    //3. 提供一个公共的 static 方法，返回 gf 对象
    public static GirlFriend getInstance() {
        return gf;
    }

    @Override
    public String toString() {
        return "GirlFriend{" +
                "name='" + name + '\'' +
                '}';
    }


}