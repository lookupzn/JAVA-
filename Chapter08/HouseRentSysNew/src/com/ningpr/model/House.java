package com.ningpr.model;

public class House {
    //编号 房主 电话 地址 月租 租赁状态
    private int index;
    private String name;
    private String tel;
    private String address;
    private double rent;
    private String state;

    //构造器

    public House(int index, String name, String tel, String address, double rent, String state) {
        this.index = index;
        this.name = name;
        this.tel = tel;
        this.address = address;
        this.rent = rent;
        this.state = state;
    }
    //getter & setter

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getRent() {
        return rent;
    }

    public void setRent(double rent) {
        this.rent = rent;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return index +
                "\t" + name +
                "\t" + tel  +
                "\t" + address  +
                "\t" + rent +
                "\t" + state
                ;
    }
}
