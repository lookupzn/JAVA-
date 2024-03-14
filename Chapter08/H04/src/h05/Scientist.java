package h05;

public class Scientist extends Employee{

    private double bonus;

    public Scientist(double salary, double bonus) {
        super(salary);
        this.bonus = bonus;
    }

    @Override
    public double getSalary() {
        return super.getSalary() + bonus;
    }

    @Override
    public String info() {
        return "科学家工资：  " + super.info() ;
    }
}
