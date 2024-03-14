package com.chapter09.static_;

public class Lesson1 {

    //静态的变量/属性
    private static String name = "韩顺平教育";
    //非静态的变量/属性
    private int i = 1234;

    //静态方法
    public static void hi() {
        System.out.println("Main01 的 hi()");
    }

    //非静态方法
    public void cry() {
        System.out.println("Main01 的 cry 方法");
    }

    public static void main(String[] args) {
        Child child = new Child();
        Child child1 = new Child();
        Child child2 = new Child();
        int a = 0;//这里的a和对象调用的a不是一个a，注意区分
        child.say();
        child.eat();// 静态方法可以访问静态属性/变量
        //如果我们希望不创建实例，也可以调用某个方法(即当做工具来使用)
        //这时，把方法做成静态方法时非常合适
        child2.a++;
        child.say();
        child1.a++;//可以通过对象名.类变量名访问
        System.out.print("Child: ");
        child.say();
        System.out.print("Child1: ");
        child1.say();
        System.out.print("Child2: ");
        child2.say();
        //        child.b;//访问修饰符权限和普通变量一样，所以错
        System.out.print("Child类: " + Child.a + "\n");
        //静态变量是类加载的时候，就创建了,所以我们没有创建对象实例
        //也可以通过类名.类变量名来访问（推荐）

        //        System.out.println(Child.b);
        //无法通过类名直接调用非静态变量

        Child.eat();

        System.out.println("=======类方法========" + "\n");
        Child.eat();//yes
        //        Child.hi();//no, 只能对象.非静态方法
        new Child().hi();//匿名对象.非静态方法，yes
        new Child(1).hi();


        System.out.println("=======main方法========" + "\n");

        //可以直接使用 name
        //1. 静态方法 main 可以访问本类的静态成员
        System.out.println("name=" + name);
        hi();
        //2. 静态方法 main 不可以访问本类的非静态成员
        //System.out.println("n1=" + n1);//错误
        //cry();
        //3. 静态方法 main 要访问本类的非静态成员，需要先创建对象 , 再调用即可
        Lesson1 main01 = new Lesson1();
        System.out.println(main01.i);//ok
        main01.cry();
    }
}

class Child {

    //定义一个变量 a ,是一个类变量(静态变量) static 静态
    //该变量最大的特点就是会被 Child 类的所有的对象实例共享
    //类变量的访问，必须遵守 相关的访问权限
    public static int a = 0;
    public int b = 3;
    private static int c = 0;

    public Child(int b) {
        this.b = b;
    }

    public Child() {
    }

    public void say() {
        System.out.println("Number = " + a);
    }

    public static void eat()//访问修饰符 + 静态方法标记 + 返回数据类型 + 方法名（）
    {
        //1. 当方法使用了 static 修饰后，该方法就是静态方法
        //2. 静态方法就可以访问静态属性/变量
        //3. 开发自己的工具类时，可以将方法做成静态的，方便调用
        System.out.println("Hello! ");
        //        System.out.println(Child.a + this.b);//no, static方法不可以有和对象有关的关键词
        System.out.println(Child.a);

    }


    public void hi() {
        System.out.println("Hi 被调用");
        //普通成员方法，既可以访问 非静态成员，也可以访问静态成员
        //小结: 非静态方法可以访问 静态成员和非静态成员
        System.out.println("a=" + a + " b= " + this.b);
    }
}
