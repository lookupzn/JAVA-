package com.chapter09.innerClass_;

public class StaticInnerClass {
    public static void main(String[] args) {
        Hi.Hello hello = new Hi.Hello();//因为静态内部类，是可以通过类名直接访问(前提是满足访问权限)
        hello.test001();
        Hi.Hello hello01 = Hi.getHello01();
        hello01.test001();
        //方式 2
        //编写一个方法，可以返回静态内部类的对象实例

    }
}

class Hi {
    public static int people = 7;
    private int a = 3;

    public static class Hello {

        static int a = 16;
        public void test001() {
            System.out.println(people);//可访问所有的外部类静态成员
            //System.out.println(a);//不可访问所有的外部类非静态成员
        }

        public static void test002()
        {
            System.out.println(people);
        }

    }

    public void HelloCase() {
        Hello hello = new Hello();
        hello.test001();//访问静态类普通方法/普通变量时，新建静态类的对象后进行操作
        System.out.println(Hello.a);//访问静态类的静态方法和静态变量 静态类名.静态方法/变量
        Hello.test002();//访问静态类的静态方法和静态变量 静态类名.静态方法/变量
    }

    public Hello getHello() {
        return new Hello();
    }

    public static Hello getHello01() {
        return new Hello();
    }

//    Hello.test001();
}