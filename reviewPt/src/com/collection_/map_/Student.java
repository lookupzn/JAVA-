package com.collection_.map_;

import java.util.Objects;

public class Student {
    private String name;
    private int age;
    private String hometown;

    public Student(String name, int age, String hometown) {
        this.name = name;
        this.age = age;
        this.hometown = hometown;
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

    public String getHometown() {
        return hometown;
    }

    public void setHometown(String hometown) {
        this.hometown = hometown;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return this.getAge() == student.getAge() &&
                this.getName().equals(student.getName());
    }

    @Override
    public int hashCode() {
        return this.getName().hashCode() + this.getAge();
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '\'' +
                '}';
    }
}
