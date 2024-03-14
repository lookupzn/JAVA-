package com.ning.reflection_;

public class BigStar {
    private String name;

    public BigStar(String name) {
        this.name = name;
    }

    public BigStar() {
    }

    public String sing(String name)
    {
        System.out.println(this.name +"正在唱" + name);
        return "Thanks";
    }

    public void dance()
    {
        System.out.println(this.name + "在跳舞");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
