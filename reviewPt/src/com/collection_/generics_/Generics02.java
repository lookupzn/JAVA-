package com.collection_.generics_;

import java.util.ArrayList;

public class Generics02 {
    public static void main(String[] args) {
        //泛型可以再添加数据前将要添加的数据统一
        ArrayList<A> a = new ArrayList<>();
        a.add(new A(5));a.add(new B(3));//泛型被指定后，可以传入该类或者子类的对象



    }
}

class A{
    private int name;

    public A(int name) {
        this.name = name;
    }

    public int getName() {
        return name;
    }

    public void setName(int name) {
        this.name = name;
    }
}
class B extends A{

    public B(int name) {
        super(name);
    }
}
