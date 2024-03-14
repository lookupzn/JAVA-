package com.chapter15.generic_;

public interface B <T,R,M>{
    int n = 10;
    R get(M m);
    void hi(R r);
    void run(R r1, R r2, T u1, T u2);
    default R method(T t) {
        return null;
    }
    //在 jdk8 中，可以在接口中，使用默认方法, 也可以使用泛型
}
