package com.collection_.set_;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSet01 {
    public static void main(String[] args) {
        Student s1 = new Student("Winky",12);
        Student s2 = new Student("Dick",12);
        Student s3 = new Student("Wang",12);
        Student s4 = new Student("Silly",12);
        Student s5 = new Student("Silly",12);
        //通过重写的hashCode和equals方法来帮助去重

        LinkedHashSet<Student> h = new LinkedHashSet<>();

        h.add(s1); h.add(s2); h.add(s3); h.add(s4); h.add(s5);
        System.out.println(h);

        //HashSet 顺序：[Stu{name='Winky', age=12}, Stu{name='Silly', age=12}, Stu{name='Wang', age=12}, Stu{name='Dick', age=12}] 无序
        //LinkedHashSet 顺序： [Stu{name='Winky', age=12}, Stu{name='Dick', age=12}, Stu{name='Wang', age=12}, Stu{name='Silly', age=12}] 和输入顺序一样
    }
}
