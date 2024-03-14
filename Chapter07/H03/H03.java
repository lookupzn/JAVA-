public class H03
{
	public static void main(String[] args)
	{
		Dog dog = new Dog("Jimmy","Black",3);
		dog.show();

	}
}

class Dog
{
	String name;
	String color;
	int age;

	public Dog(String name,String color,int age)
	{
		this.name = name;
		this.color = color;
		this.age = age;
	}
	public void show()
	{
		System.out.println("name: " + this.name +
			" color: " + color + " age: " + color);
	}
}