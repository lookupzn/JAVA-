public class H04
{
	public static void main(String[] args)
	{
		int times = 5;
		Circle circle = new Circle();
		PassObject p = new PassObject();
		p.printAreas(circle,times);

	}
}

class Circle
{
	double radius;
	

	public void setRadius(double r)
	{
		radius = r;
		
	}

	public double findArea()
	{
		return (radius*radius*Math.PI);
	}
}

class PassObject
{
	public void printAreas(Circle c,int times)
	{

		System.out.println("Radius" + "    " + "Area");
		for(int i = 1; i <= times; i++)
		{
			c.setRadius(i);
			System.out.print((double)i + "         " 
				+ c.findArea() + "\n");
		}
	}
}