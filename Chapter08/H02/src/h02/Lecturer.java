package h02;

public class Lecturer extends Teacher {

    public String post = "Lecturer";
    public Lecturer(String name, int age, double salary) {
        super(name, age, salary);

    }

    @Override
    public double getSalary()
    {
        return 1.1 * super.getSalary();
    }

    @Override
    public String info()
    {
        return super.info() + " 职称： " + this.post;
    }
}
