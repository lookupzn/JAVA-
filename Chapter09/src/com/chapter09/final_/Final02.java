package com.chapter09.final_;

public class Final02 {
    public static void main(String[] args) {
        System.out.println(BBBB.num);
    }
}

class AAA {// final变量初始化的位置 1。类里 2. 代码块（不管是不是静态代码块） 3. 构造器


    final double RATE_01 = 0.3;


    {
        final double RATE_02 = 0.8;
    }

    static {
        final double RATE_04 = 0.8;
    }


    public AAA() {
        final double RATE_03 = 1.5;
    }
}

class BBB {
    static final int BABY_01 = 5;
    // 此处不允许使用修饰符 'static',
    //    {
    //        static final int BABY_02 = 5;
    //    }
    //    static {
    //    static final int BABY_03 = 5;
    //      }
    //    public BBB() {
    //        static final int BABY_01 = 5;
    //    }
    public static final double TAX_RATE2;

    static {
        TAX_RATE2 = 0.8;
    }   //可以先声明final变量后在static代码块中确定常量值
}

class BBBB {
    //final 和 static 往往搭配使用，效率更高，不会导致类加载.底层编译器做了优化处理
    public final static int num = 10000;

    static {
        System.out.println("BBB 静态代码块被执行");
    }
}
