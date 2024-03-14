package test100.num1;

public class Test11 {

    public static void main(String[] args)
    {
        People people = new Student();
        People people2 = new People();
        People people1 = new Student("XiaoQiang",18,77);

        System.out.println(((Student) people).info());
        System.out.println(((Student) people1).info());

        people.functionOverride();
        people2.functionOverride();
    }

}
