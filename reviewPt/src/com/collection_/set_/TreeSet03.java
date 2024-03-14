package com.collection_.set_;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSet03 {
    public static void main(String[] args) {
        TreeSet<Student> ts = new TreeSet<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {//o1:当前添加的元素 o2：已经添加的元素
                return o1.getAge() - o2.getAge();
            }
        });

        Student s1 = new Student("Winky", 12);
        Student s2 = new Student("Dick", 11);
        Student s3 = new Student("Wang", 12);
        Student s4 = new Student("Silly", 15);
        Student s5 = new Student("Silly", 14);

        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        ts.add(s5);

        System.out.println(ts);//[Stu{name='Dick', age=11}, Stu{name='Winky', age=12}, Stu{name='Silly', age=14}, Stu{name='Silly', age=15}]
    }
}
