package com.chapter18.properties_;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

/*
        Properties 父类是 Hashtable ， 底层就是 Hashtable 核心方法
        public synchronized V put(K key, V value) {
        // Make sure the value is not null
        if (value == null) {
        throw new NullPointerException();
        }
        // Makes sure the key is not already in the hashtable. Entry<?,?> tab[] = table;
        int hash = key.hashCode();
        int index = (hash & 0x7FFFFFFF) % tab.length;
        @SuppressWarnings("unchecked")
        Entry<K,V> entry = (Entry<K,V>)tab[index];
        for(; entry != null ; entry = entry.next) {
        if ((entry.hash == hash) && entry.key.equals(key)) {
        V old = entry.value;
        entry.value = value;//如果 key 存在，就替换
        return old;
        }
        }
        addEntry(hash, key, value, index);//如果是新 k, 就 addEntry
        return null;
        }

        Properties类是Hashtable的子类，它可以用于读取和写入属性文件（.properties文件）。
        底层实现是通过Hashtable来存储属性和值的键值对。put()方法用于向Properties对象中添加属性和值，
        它会先检查键是否已经存在，若存在则替换值，若不存在则调用addEntry()方法来添加新的键值对。
        如果要添加的键已经存在，就会抛出异常。
*/

public class Properties03 {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();

        // 若该文件无key，创建，有则是修改
        properties.setProperty("charset","utf8");
        properties.setProperty("user","Tom");
        //k-v存储文件
        properties.store(new FileWriter("D:\\JAVA\\Chapter18\\src\\mysql2.properties"),"Properties 02");
        System.out.println("保存成功");
    }
}
