package com.collection_.set_;

import java.util.TreeSet;

public class TreeSet02 {

    public static void main(String[] args) {
        Student s1 = new Student("Winky", 12);
        Student s2 = new Student("Dick", 11);
        Student s3 = new Student("Wang", 12);
        Student s4 = new Student("Silly", 15);
        Student s5 = new Student("Silly", 14);

        TreeSet<Student> ts = new TreeSet<>();
        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        ts.add(s5);

        System.out.println(ts);//[Stu{name='Dick', age=11}, Stu{name='Winky', age=12}, Stu{name='Silly', age=14}, Stu{name='Silly', age=15}]
    }


}
