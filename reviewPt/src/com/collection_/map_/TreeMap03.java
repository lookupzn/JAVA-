package com.collection_.map_;

import java.util.StringJoiner;
import java.util.TreeMap;

public class TreeMap03 {
    public static void main(String[] args) {
        //统计字母个数
        //计数器思想（统计）
        //利用Map集合进行统计
        //HashMap：无要求排序，因为效率高 和TreeMap：要求排序
        //k 要统计的内容 v 次数

        //1. 先定义字符串
        String s = "aabbacabccdda";
        //3.创建集合
        TreeMap<Character,Integer> t = new TreeMap<>();


        //2.遍历字符

        for(int i = 0;i< s.length();i++)
        {
            char c = s.charAt(i);
            if(t.containsKey(c))
            {
                int count = t.get(c);
                count++;
                t.put(c,count);
            }
            else
                t.put(c,1);
        }

        StringBuilder sb = new StringBuilder();

        t.forEach((k,v) -> sb.append(k).append("(").append(v).append(")"));



        System.out.println(sb);
    }
}
