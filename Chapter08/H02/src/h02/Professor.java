package h02;

public class Professor extends Teacher {

    public String post = "Professor";
    public Professor(String name, int age, double salary) {
        super(name, age, salary);

    }

    @Override
    public double getSalary()
    {
        return 1.3 * super.getSalary();
    }

    @Override
    public String info()
    {
        return super.info() + " 职称： " + this.post;
    }


}
