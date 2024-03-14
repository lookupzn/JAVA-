package com.chapter15.generic_;

import java.util.ArrayList;
import java.util.List;

public class CustomGeneric01 {
    public static void main(String[] args) {
        Tiger<Double,String,Integer> wang = new Tiger<>("Wang");
        wang.setM(10);
        wang.setT(20.1);
        System.out.println(wang);

        List hello = new ArrayList();
        AA aa = new AA();
        wang.hello(hello,aa);
        wang.hello1("new AA()",new AA());
    }





}


class  Tiger<T,R,M>
        //当我们去实现 IA 接口时，因为 IA 指定了 <Double,String,Integer>
        //，在实现 IA 接口的方法时，使用 String 替换 U, 是 Double 替换
{
T t;
R r;
M m;
String s;

    public Tiger(T t, R r, M m, String s) {
        this.t = t;
        this.r = r;
        this.m = m;
        this.s = s;
    }

//    public void eat(U){} //不能解决符号 'U'
public void run(M m) {
} //ok

    public<K,L> void hello(L l, K k) {
        System.out.println(l.getClass());//class java.util.ArrayList
        System.out.println(k.getClass());//class com.chapter15.generic_.AA

        //说明 泛型方法
        //1. <K,L> 就是泛型
        //2. 是提供给 hello 使用
    }

    //说明
    //1. 下面 hi 方法不是泛型方法
    //2. 是 hi 方法使用了类声明的 泛型
    public void hi(T t) {
    }

    //泛型方法，可以使用类声明的泛型，也可以使用自己声明泛型
    public<K> void hello1(R r, K k) {
        System.out.println(r.getClass());//ArrayList
        System.out.println(k.getClass().getSimpleName());//Float
    }


//    static R r2;
//    public static void m1(M m){
//
//    }
// 无法从 static 上下文引用 'com.chapter15.generic_.Tiger.this'

    public Tiger(String s) {
        this.s = s;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public R getR() {
        return r;
    }

    public void setR(R r) {
        this.r = r;
    }

    public M getM() {
        return m;
    }

    public void setM(M m) {
        this.m = m;
    }

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }

    @Override
    public String toString() {
        return "Tiger{" +
                "t=" + t +
                ", r=" + r +
                ", m=" + m +
                ", s='" + s + '\'' +
                '}';
    }
}

class AA implements A{


    @Override
    public String get(Integer integer) {
        return null;
    }

    @Override
    public void hi(String s) {

    }

    @Override
    public void run(String r1, String r2, Double u1, Double u2) {

    }

    @Override
    public String method(Double aDouble) {
        return null;
    }
}

class BB implements B<Integer,Float,String>{
    @Override
    public Float get(String s) {
        return null;
    }

    @Override
    public void hi(Float aFloat) {

    }

    @Override
    public void run(Float r1, Float r2, Integer u1, Integer u2) {

    }

    @Override
    public Float method(Integer integer) {
        return null;
    }

//实现接口时，直接指定泛型接口的类型
//给 U 指定 Integer 给 R 指定了 Float
//所以，当我们实现 IUsb 方法时，会使用 Integer 替换 T, 使用 Float 替换 R,String 替换 M
//没有指定类型，默认为 Object
//建议直接写成 B<Object,Object,Object>

}