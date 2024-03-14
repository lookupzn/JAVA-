package com.chapter09.final_;

public class Final01 {
    public static void main(String[] args) {
        BB b = new BB();
//      b.TAX_RATE = 0.11;
        b.meow();
//      无法将值赋给 final 变量 'TAX_RATE'

    }
}

final class A {
    //1. A不想成为别人的父类，用final

}

//class B extends A{
//
//}(无法从final 'com.chapter09.final_.A' 继承)
class AA {
    //2. 不想该类方法被子类override掉，用final(不过此时仍可以根据访问修饰符进行判断是否能调用）

    public final void meow() {
        System.out.println("Meow!");
    }
}

class BB extends AA {
//    @Override
//    public void meow(){
//        System.out.println("Meow!");
//    } 错误：'meow()' 无法重写 'com.chapter09.final_.AA' 中的 'meow()'；重写的方法为 final

    //3. 不希望某个值被修改，用final
    public final double TAX_RATE = 0.08;

    public void m() {

        //4. 不希望某个局部变量改变，用final
        final double NUM = 0.01;
//       NUM = 8;
//        无法将值赋给 final 变量 'NUM'
        System.out.println("NUM=" + NUM);
    }

}
