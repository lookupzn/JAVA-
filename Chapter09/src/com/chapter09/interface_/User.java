package com.chapter09.interface_;

public class User {
    public static void main(String[] args) {
        //创建手机，相机对象
        //Camera 实现了 UsbInterface
        Interface01 interface01 = new Interface01();
        //Phone 实现了 UsbInterface
        Interface02 interface02 = new Interface02();
        Computer computer = new Computer();
        computer.work(interface01);//把手机接入到计算机
        System.out.println("===============");
        computer.work(interface02);//把相机接入到计算机
//        USB usb = new USB();'USB' 为 abstract；无法实例化
        System.out.println(A2.n1);//体现static
        System.out.println("===============");
        USB[] usbs = new USB[2];
        usbs[0] = new Interface01();
        usbs[1] = new Interface02();
        for(int i = 0;i < usbs.length;i++)
        {
            usbs[i].start();//动态绑定..
            if(usbs[i] instanceof Interface02) //对象比较
            {
                ((Interface02) usbs[i]).call();//向下转型
            }
            usbs[i].stop();
        }

        //接口的多态体现
        //接口类型的变量 sub 可以指向 实现了 USB
        //接口类型的变量可以指向，实现了该接口的类的对象实例
        USB sub = new Interface01();
        sub = new Interface02();

        //继承体现的多态
        //父类类型的变量 dom 可以指向 继承 BBB 的子类的对象实例
        Interface02 dom = new AAA();
        dom = new BBB();
        //如果 USB接口 继承了 A1 接口，而 Interface02 类实现了 USB 接口
        //那么，实际上就相当于 Interface02 类也实现了 A1 接口.
        // 这就是所谓的 接口多态传递现象




    }
}



