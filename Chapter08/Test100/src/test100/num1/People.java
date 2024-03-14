package test100.num1;

public class People {

    public String name = "XiaoMing";
    public int age = 20;
    private int score = 84;

    public People() {
        System.out.println("Super() has been used");
    }

    public People(String name, int age, int score) {
        this.name = name;
        this.age = age;
        this.score = score;
        System.out.println("Super(String name, int age, int score) has been used");
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }



    Object functionOverride()
    {
        System.out.println("Object functionOverride() 被使用");

        return null;
    }

}
