package com.chapter09.innerClass_;

public class MemberInnerClass01 {
    public static void main(String[] args) {

        Girlfriend girlfriend = new Girlfriend("Fang",27);
        girlfriend.info();

    }
}

class Girlfriend
{
    private String name;
    private int age;
    private class Boob{
        private int upperNum;
        private int lowerNum;

        public Boob(int upperNum, int lowerNum) {
            this.upperNum = upperNum;
            this.lowerNum = lowerNum;
        }

        public int getUpperNum() {
            return upperNum;
        }

        public void setUpperNum(int upperNum) {
            this.upperNum = upperNum;
        }

        public int getLowerNum() {
            return lowerNum;
        }

        public void setLowerNum(int lowerNum) {
            this.lowerNum = lowerNum;
        }

        public void boobSize()
        {
            System.out.println("胸的size为：" + (upperNum - lowerNum));
        }
    }

    public Girlfriend(String name, int age) {
        this.name = name;
        this.age = age;
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

    public void info(){
        Boob boob = new Boob(40,3);

        System.out.println("你老婆信息如下：");
        System.out.println("姓名：" + name);
        System.out.println("年龄：" + age);
        boob.boobSize();
    }
}
