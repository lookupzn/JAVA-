package com.chapter15.generic_;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class H01 {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {

        DAO<String> dao = new DAO<>();
        dao.save("1", "Jason");
        dao.get("1");

    }


}

class DAO<T> {
    String s;
    T t;
    Map<String, T> hashMap = new HashMap<>();

    public DAO() {
    }

    public DAO(String s, T t) {
        this.s = s;
        this.t = t;
    }

    public void save(String id, T entity) {
        hashMap.put(id, entity);
        System.out.println("添加成功！");
    }

    public T get(String id) {
        System.out.println(hashMap.get(id));
        return hashMap.get(id);
    }

    public void update(String id, T entity) {
        hashMap.replace(id, entity);
        System.out.println(hashMap.get(id));
        System.out.println("更改成功！");
    }

    public void delete(String id) {
        hashMap.remove(id);
        System.out.println("删除成功！");
    }

    public List<T> list() {

        return new ArrayList<T>(hashMap.values());
    }


}

class User {
    private int id;
    private String name;
    private int age;

    public User(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}