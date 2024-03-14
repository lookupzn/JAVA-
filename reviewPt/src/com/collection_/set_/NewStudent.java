package com.collection_.set_;

public class NewStudent implements Comparable<NewStudent>{

    private double Chinese;
    private double Math;
    private double English;

    private int age;
    private String name;

    public NewStudent(double chinese, double math, double english, int age, String name) {
        Chinese = chinese;
        Math = math;
        English = english;
        total = chinese + math + english;
        this.age = age;
        this.name = name;
    }



    public double getChinese() {
        return Chinese;
    }

    public void setChinese(double chinese) {
        Chinese = chinese;
    }

    public double getMath() {
        return Math;
    }

    public void setMath(double math) {
        Math = math;
    }

    public double getEnglish() {
        return English;
    }

    public void setEnglish(double english) {
        English = english;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double total;

    public double getTotal() {
        return this.getChinese() + this.getMath()  + this.getEnglish();
    }


    @Override
    public int compareTo(NewStudent o) {
        if(this.getTotal() != o.getTotal())
        {
            return (int)(this.getTotal() - o.getTotal());
        }
        else if(this.getChinese() != o.getChinese()){
            return (int)(this.getChinese() - o.getChinese());}
        else if(this.getMath() != o.getMath())
        {
            return (int)(this.getMath() - o.getMath());
        }
        else if(this.getEnglish() != o.getEnglish())
        {
            return (int)(this.getEnglish() - o.getEnglish());
        }
        else if(this.getAge() != o.getAge())
        {
            return this.getAge() - o.getAge();
        }
        else if(o.getName().equals(this.getName()))
        {
            return this.getName().compareTo(o.getName());
        }
        else
            return 0;

    }

    @Override
    public String toString() {
        return "NewStudent{"  +
                " Chinese=" + Chinese +
                ", Math=" + Math +
                ", English=" + English +
                ", total=" + total +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
