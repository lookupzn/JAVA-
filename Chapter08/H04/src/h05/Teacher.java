package h05;

public class Teacher extends Employee{

    private double classSal;
    private double classHour;

    public Teacher(double salary, double classSal, double classHour) {
        super(salary);
        this.classSal = classSal;
        this.classHour = classHour;
    }

    @Override
    public double getSalary() {
        return super.getSalary() + classHour * classSal;
    }

    @Override
    public String info() {
        return "老师工资：  " + super.info() ;
    }
}
