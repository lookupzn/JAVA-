package com.chapter14.list_;
//链表的简单本质，叠起来的三明治，上面是pre，和它上一个三明治相叠，中间的馅儿是实际传输的东西，下面next，和它下面那个三明治相叠
public class LinkedList01 {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        //模拟一个简单的双向链表
        Node jack = new Node("jack");
        Node tom = new Node("tom");
        Node hsp = new Node("老韩");

        //连接三个结点，形成双向链表
        //jack -> tom -> hsp
        jack.next = tom;
        tom.next = hsp;
        //hsp -> tom -> jack
        hsp.pre = tom;
        tom.pre = jack;

        Node first = jack;//让 first 引用指向 jack,就是双向链表的头结点
        Node last = hsp; //让 last 引用指向 hsp,就是双向链表的尾结点

        //演示，从头到尾进行遍历
        System.out.println("===从头到尾进行遍历===");

        while (first != null) {
            System.out.println(first + " ");
            first = first.next;
        }

        //演示，从尾到头的遍历
        System.out.println("====从尾到头的遍历====");
        while (true) {
            if(last == null) {
                break;
            }
        //输出 last 信息
            System.out.println(last);
            last = last.pre;
        }
    }
}

//定义一个 Node 类，Node 对象 表示双向链表的一个结点
class Node {
    public Object item; //真正存放数据
    public Node next; //指向后一个结点，下面next，和它下面那个三明治相叠
    public Node pre; //指向前一个结点，上面是pre，和它上一个三明治相叠
    public Node(Object name) {
        this.item = name;
    }

    @Override
    public String toString() {
        return "Node name=" + item;
    }
}
