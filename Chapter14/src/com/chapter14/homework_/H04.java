package com.chapter14.homework_;

import java.util.*;
//HashMap本质举例
public class H04 {
    public static void main(String[] args) {
        Set hashSet = new HashSet();
        Person p1 = new Person(1,"Jack");
        Person p2 = new Person(2,"Lee");
        hashSet.add(p1);
        hashSet.add(p2);
        System.out.println(hashSet);
        p2.setName("Guo");
        hashSet.remove(p2);
        System.out.println(hashSet);//在原有哈希码值处只有p2（2，Guo），remove（）方法找不到p2（2，Lee），删除失败
        hashSet.add(new Person(2,"Lee"));
        System.out.println(hashSet);//[Person{id=1, name='Jack'}, Person{id=2, name='Guo'}, Person{id=2, name='Lee'}]
        //reason： 因为此时的哈希值虽然相同都是（2，Lee），但是内容不同，一个是（2，Guo）另一个是（2，Lee）因此显示三个
        hashSet.add(new Person(2,"Guo"));
        System.out.println(hashSet);//[Person{id=2, name='Guo'}, Person{id=1, name='Jack'}, Person{id=2, name='Guo'}, Person{id=2, name='Lee'}]
        //reason: 因为使用重写的hashcode（）位置生成这个对象而不是（2，Lee）的哈希值，和之前的hashcode（）不同
    }
}

class Person{
 private int id;
 private String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id &&
                name.equals(person.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode() + id;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
