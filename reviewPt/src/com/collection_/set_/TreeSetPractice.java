package com.collection_.set_;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetPractice {
    public static void main(String[] args) {
        NewStudent[] students = new NewStudent[5];
        students[0] = new NewStudent(90, 80, 85, 18, "张三");
        students[1] = new NewStudent(95, 85, 90, 20, "李四");
        students[2] = new NewStudent(85, 75, 80, 21, "王五");
        students[3] = new NewStudent(88, 78, 82, 19, "赵六");
        students[4] = new NewStudent(92, 82, 87, 22, "钱七");

        TreeSet<NewStudent> newStudents = new TreeSet<>();
        newStudents.add(students[0]);
        newStudents.add(students[1]);newStudents.add(students[2]);newStudents.add(students[3]);newStudents.add(students[4]);
        Iterator it = newStudents.iterator();
        while (it.hasNext()) {
            Object next =  it.next();
            System.out.println(next);
        }
    }
}
