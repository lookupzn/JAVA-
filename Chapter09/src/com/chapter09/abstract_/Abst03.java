package com.chapter09.abstract_;

public class Abst03 {
    public static void main(String[] args) {
        Manager wang = new Manager("王大海", 1, 10000.0, 5000.0);
        wang.setBonus(10000.0);
        wang.work();
        CommonEmployee lee = new CommonEmployee("李三", 2, 7500.0);
        lee.work();
        Manager zhang = new Manager("Zhang", 3, 50000);
        zhang.setBonus(10000);
        zhang.work();


    }

}

abstract class Employee {
    private String name;
    private int id;
    private double salary;

    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    abstract public void work();

    @Override
    public String toString() {
        return "员工信息：" +
                " name：" + name +
                " id：" + id +
                " salary= " + getSalary();
    }
}

class Manager extends Employee {
    private double bonus;

    public Manager(String name, int id, double salary, double bonus) {
        super(name, id, salary);
        this.bonus = bonus;
    }

    public Manager(String name, int id, double salary) {
        super(name, id, salary);
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public double getSalary() {
        return super.getSalary() + this.getBonus();
    }

    @Override
    public String toString() {
        return super.toString() + " 职位： 经理";
    }

    @Override
    public void work() {
        System.out.println(toString());
    }

    ;
}

class CommonEmployee extends Employee {

    public CommonEmployee(String name, int id, double salary) {
        super(name, id, salary);

    }

    @Override
    public String toString() {
        return super.toString() + " 职位： 普通员工";
    }

    @Override
    public void work() {
        System.out.println(toString());
    }

    ;
}