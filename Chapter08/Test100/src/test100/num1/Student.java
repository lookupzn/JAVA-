package test100.num1;

public class Student extends People{

    public int age = 40;

    public Student() {
        System.out.println("Student() has been used");
    }

    public Student(String name, int age, int score) {
        super(name, age, score);
    }

    public String info()
    {
        return "name:" + name + " age:" + super.age + " score:" + getScore();
    }

    @Override
    public String functionOverride()
    {
        System.out.println("String functionOverride() 被使用");

        return null;
    }
}
