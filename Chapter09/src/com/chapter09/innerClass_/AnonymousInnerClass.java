package com.chapter09.innerClass_;


public class AnonymousInnerClass {
    public static void main(String[] args) {

    }
}

abstract class A8{
    abstract public void hi();
}

class A9{
    public static final int RATE = 3;
    private int i;

    public A9(int i) {
        this.i = i;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public void test() {

    }

    public void say()
    {
        System.out.println("nigga!");
    }
}

class Outer04
{
    private int n1 = 10;
    public void method(){
        //基于接口的匿名内部类
        //1.需求： 想使用 IA 接口,并创建对象
        //2.传统方式，是写一个类，实现该接口，并创建对象
        //3.Tiger/Dog 类只是使用一次，后面再不使用
        //4. 可以使用匿名内部类来简化开发
        //5. tiger 的编译类型 ? IA
        //6. tiger 的运行类型 ? 就是匿名内部类 Outer04$
//        class Outer04$1 implements IA{
//            @Override
//            public void cry() {
//                System.out.println("55555~");
//            }
//
//        } 正常做法
        IA tiger = new IA() {
            @Override
            public void cry() {
                System.out.println("老虎叫唤...");
            }
        };
        //7. jdk 底层在创建匿名内部类 Outer04$1,立即马上就创建了 Outer04$1 实例，并且把地址
        // 返回给 tiger
        //8. 匿名内部类使用一次，就不能再使用 （类名/接口名 对象名 = new 类名/接口名（）{...};）
        System.out.println("tiger 的运行类型=" + tiger.getClass());
        tiger.cry();
        tiger.cry();
        tiger.cry();//优点：匿名内部类在method() 使用后被销毁，不会影响内存存储

        //基于抽象类的匿名内部类
        A8 a8 = new A8() {
            @Override
            public void hi() {
                System.out.println("你干嘛欸有");
            }
        };
        a8.hi();
        a8.hi();


        //基于类的匿名内部类
        A9 a9 = new A9(3){
            @Override
            public void test() {
                System.out.println("匿名内部类重写了 test 方法");
            }
        };

        a9.test();
        a9.say();//这里相当于（temp）A9$1 是A9子类，继承父类的除了private外所有成员


    }

}

