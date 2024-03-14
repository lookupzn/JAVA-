package h02;

public class AP extends Teacher {

    public String post = "Associate Professor";
    public AP(String name, int age, double salary) {
        super(name, age, salary);
    }

    @Override
    public double getSalary()
    {
        return 1.2 * super.getSalary();
    }

    @Override
    public String info()
    {
        return super.info() + " 职称： " + this.post;
    }
}
