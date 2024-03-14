public class Employee {
    private String name;
    private double sal;
    private int day;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public Employee(String name, double sal, int day) {
        this.name = name;
        this.sal = sal;
        this.day = day;
    }

    public Employee() {
    }

    public double sumSal(){
        return this.getSal()*this.getDay();
    }

    public String info()
    {
        return "name: " + this.name + " salary: " + sumSal();
    }

}
