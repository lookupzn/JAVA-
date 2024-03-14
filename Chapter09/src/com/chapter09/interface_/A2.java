package com.chapter09.interface_;

public interface A2 {
    //接口中的属性,只能是 final 的，而且是 public static final 修饰符
    int n1 = 10; //等价 public static final int
//    n1++;//无法改变n1数值，体现final
}
