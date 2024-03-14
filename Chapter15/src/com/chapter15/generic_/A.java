package com.chapter15.generic_;

//在继承接口 指定泛型接口的类型
public interface A extends B<Double,String,Integer> {
    //当我们去实现 A 接口时，因为 A 在继承 B 接口时，指定了 T 为 Double R 为 String,M 为 Integer
    //，在实现 B 接口的方法时，使用 String 替换 R,  Double 替换 T, Integer 替换 M

    /**
     * 泛型接口使用的说明
     * 1. 接口中，静态成员也不能使用泛型
     * 2. 泛型接口的类型, 在继承接口或者实现接口时确定
     * 3. 没有指定类型，默认为 Object
     */

}
