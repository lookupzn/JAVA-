package com.collection_.generics_;

import java.util.Arrays;

public class MyArrayList<E> {
Object[] obj = new Object[10];
int size;

//E 不确定类型 e 变量名字
    public boolean add(E e)
    {
        obj[size] = e;
        size++;
        return true;
    }

    public E get(int index){
        return (E)obj[index];
    }

    @Override
    public String toString() {
        return "MyArrayList{" +
                "obj=" + Arrays.toString(obj) +
                ", size=" + size +
                '}';
    }
}
