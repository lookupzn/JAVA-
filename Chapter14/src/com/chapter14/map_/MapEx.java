package com.chapter14.map_;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapEx {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        //HashMap添加仨员工
        Map map = new HashMap();
        map.put(1, new Worker("WangDefa", 15000.0, 1));
        map.put(2, new Worker("DengWen", 21000.0, 2));
        map.put(2, new Worker("DengWen", 21100.0, 2));
        map.put(3, new Worker("WangDefa", 19000.0, 3));
        //遍历sal > 18000 的员工
        Set entrySet = map.entrySet();//此时 entrySet每个元素是Map.Entry<K, V>，即map.Entry<k,v> =>set集合了
        Iterator iterator = entrySet.iterator();

        //        while (iterator.hasNext()) {
        //            Object next =  iterator.next();
        //
        //        }
        while (iterator.hasNext()) {
            Map.Entry entry = (Map.Entry) iterator.next();//此时entry每个元素是 Entry<K,V>
            //通过 entry 取得 key 和 value
            Worker emp = (Worker) entry.getValue();//此时entry每个元素是 Entry<K,V>
            if (emp.getSal() > 18000) {
                System.out.println(emp);
            }
        }
    }
}

class Worker {
    private String name;
    private double sal;
    private int id;


    public Worker(String name, double sal, int id) {
        this.name = name;
        this.sal = sal;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", sal=" + sal +
                ", id=" + id +
                '}';
    }
}