package com.chapter14.list_;

import java.util.Vector;

public class Vector01 {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        Vector vector = new Vector(8);
        for(int i = 0; i < 9; i++ )
        {
            vector.add(i);//长度超过8个的时候，容量翻倍,16
        }
        vector.add(9);

        for(int i = 10; i < 15; i++ )
        {
            vector.add(i);
        }

        System.out.println(vector);

        //老韩解读源码
        //1. new Vector() 底层
        /*
        public Vector() {
        this(10);
        }
        补充：如果是 Vector vector = new Vector(8);
        走的方法:
        public Vector(int initialCapacity) {
        this(initialCapacity, 0);
        }


        2. vector.add(i)
        2.1 //下面这个方法就添加数据到 vector 集合
        public synchronized boolean add(E e) {
        modCount++;
        ensureCapacityHelper(elementCount + 1);
        elementData[elementCount++] = e;
        return true;
        }


        2.2 //确定是否需要扩容 条件 ： minCapacity - elementData.length>0
        private void ensureCapacityHelper(int minCapacity) {
        // overflow-conscious code
        if (minCapacity - elementData.length > 0)
        grow(minCapacity);
        }


        2.3 //如果 需要的数组大小 不够用，就扩容 , 扩容的算法
        //newCapacity = oldCapacity + ((capacityIncrement > 0) ?
        // capacityIncrement : oldCapacity);
        //就是扩容两倍. private void grow(int minCapacity) {
        // overflow-conscious code
        int oldCapacity = elementData.length;
        int newCapacity = oldCapacity + ((capacityIncrement > 0) ?
        capacityIncrement : oldCapacity);
        if (newCapacity - minCapacity < 0)
        newCapacity = minCapacity;
        if (newCapacity - MAX_ARRAY_SIZE > 0)
        newCapacity = hugeCapacity(minCapacity);
        elementData = Arrays.copyOf(elementData, newCapacity);
        }
        */
    }
}
