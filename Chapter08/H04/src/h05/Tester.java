package h05;

public class Tester {

    public static void checkinfo(Employee[] employees)
    {
        for(int i = 0;i < employees.length;i++)
        {
            System.out.println(employees[i].info());
        }
    }
}
