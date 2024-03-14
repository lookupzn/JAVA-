package h05;

public class Homework05 {

    public static void main(String[] args) {
        Employee[] employees = new Employee[3];
        employees[0] = new Employee(40000);
        employees[1] = new Teacher(30000,30,50);
        employees[2] = new Scientist(50000,100000);
        Tester.checkinfo(employees);

    }

}
