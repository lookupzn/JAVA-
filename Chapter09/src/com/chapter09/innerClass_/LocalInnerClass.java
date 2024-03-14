package com.chapter09.innerClass_;


/**
 * 演示局部内部类的使用
 */
public class LocalInnerClass {
    public static void main(String[] args) {
//        B b = new B();//仅仅在A中可以被调用
        A a = new A();
        a.say();
    }
}

class A {
    private int a = 3;

    class AA {

        int s = 5;

        public void three() {
            System.out.println(a);//可以直接访问外部类的所有成员，包含私有
//                System.out.println(RATE*3); 作用域 : 仅仅在定义它的方法或代码块，解释：局部内部类相当于一个局部变量
        }
    }

//    AA aa = new AA();//仅仅在say()中可以被调用

    public void say() {
        AA aaa = new AA();//如果外部类和局部内部类的成员重名时，默认遵循就近原则，如果想访问外部类的成员，
        aaa.three();
        final class AA {
            public int RATE = 1;
            public int a = 0;

            public void three() {
                System.out.println(a);//可以直接访问外部类的所有成员，包含私有
                System.out.println(RATE * 8);
                System.out.println(A.this.a);//可以直接访问外部类的所有成员，包含私有,通过外部类名.this.成员名
            }

        }
        // 使用 外部类名.this.成员）去访问


        //局部内部类是定义在外部类的局部位置,通常在方法
        //局部内部类不能添加访问修饰符,但是可以使用 final 修饰，因为内部类地位相当于局部变量
        //作用域 : 仅仅在定义它的方法或代码块
        AA aa = new AA();
        aa.three();//外部类在作用域内访问内部类的途径 1.创建新的内部对象 2.调用内部对象方法
    }


}
