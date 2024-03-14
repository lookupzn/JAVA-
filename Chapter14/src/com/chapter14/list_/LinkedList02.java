package com.chapter14.list_;


//老韩源码阅读.
/*
// 1. LinkedList linkedList = new LinkedList();


2. 这时 linkeList 的属性 first = null last = null


3. 执行 添加
public boolean add(E e) {
        linkLast(e);
        return true;
        }


    4.将新的结点，加入到双向链表的最后
        void linkLast(E e) {
final Node<E> l = last;
final Node<E> newNode = new Node<>(l, e, null);
        last = newNode;
        if (l == null)
        first = newNode;
        else
        l.next = newNode;
        size++;
        modCount++;
        }

        */

/*
老韩读源码 linkedList.remove(); // 这里默认删除的是第一个结点
1. 执行 removeFirst
public E remove() {
return removeFirst();
}
2. 执行
public E removeFirst() {
final Node<E> f = first;
if (f == null)
throw new NoSuchElementException();
return unlinkFirst(f);
}
3. 执行 unlinkFirst, 将 f 指向的双向链表的第一个结点拿掉
private E unlinkFirst(Node<E> f) {
// assert f == first && f != null;
final E element = f.item;
final Node<E> next = f.next;
f.item = null;
f.next = null; // help GC
first = next;
if (next == null)
last = null;
else
next.prev = null;
size--;
modCount++;
return element;
}
*/

import java.util.Iterator;
import java.util.LinkedList;


//这部分是关于链表的CRUD四大功能的演示
public class LinkedList02 {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        System.out.println("linkedList=" + linkedList);//创建新链表，添加元素
        linkedList.remove(2);
        System.out.println("linkedList=" + linkedList);//delete元素
        linkedList.add(2, 60);//指定元素添加
        System.out.println("linkedList=" + linkedList);
        linkedList.addFirst(10);
        linkedList.addLast(15);//首尾添加元素
        System.out.println("linkedList=" + linkedList);
        LinkedList newLinkedList = new LinkedList();
        newLinkedList.addAll(linkedList);
        System.out.println("newLinkedList=" + newLinkedList);
        newLinkedList.addAll(3, linkedList);//加其他的元素集合
        System.out.println("newLinkedList=" + newLinkedList);
        linkedList.set(0, 99);//修改链表元素
        System.out.println("linkedList=" + linkedList);
        System.out.println(linkedList.get(3));//查找具体位置元素
        linkedList.removeFirst();

        //遍历linkedlist
        //因为 LinkedList 是 实现了 List 接口, 遍历
        System.out.println("======iterator 遍历======");
        Iterator iterator = linkedList.iterator();
        while (iterator.hasNext()) {
            Object next = iterator.next();
            System.out.println(next);
        }

        System.out.println("===LinkeList 遍历增强 for====");
        for (Object o1 : linkedList) {
            System.out.println("o1=" + o1);
        }
        System.out.println("===LinkeList 遍历普通 for====");
        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println(linkedList.get(i));
        }

    }
}
