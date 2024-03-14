package H01;

public class Homework01 {
    public static void main(String[] args) {
        Person[] people = new Person[3];
        people[0] = new Person(18,"Jerry","Writer");
        people[1] = new Person(41,"Huang","Manager");
        people[2] = new Person(25,"Mary","Waiter");

        for(int i = 0;i < people.length - 1;i++)
        {
            for(int j = 0;j < people.length - 1;j++)
            {
                if (people[j].getAge() < people[j+1].getAge())
                {
                    Person temp = people[j + 1];
                    people[j+1] = people[j];
                    people[j] = temp;
                }
            }
        }

        for(int i = 0;i < people.length;i++)
        {
            System.out.println(people[i].info());
        }
    }

}
