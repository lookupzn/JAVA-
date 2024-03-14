import java.util.Scanner;
public class H01
{
	public static void main(String[] args)
	{	
	double[] arr = {1.1, 1.2, 1.5, 2.0};
	a1 k = new a1();
	A02 q = new A02();
	double a = k.max(arr);
	q.find(arr,2.0);
	q.find(arr,2.1);
	System.out.println("a = " + a);	
	Book b = new Book();
	Scanner s = new Scanner(System.in);
	System.out.println("请输入书的价格： ");
	int x = s.nextInt();
	if (x > 0)
		{
			int priceNow = b.updatePrice(x);
			System.out.println("现在的价格为 " + priceNow);

		}
		else
		{
			System.out.println("Wrong Price Number!!!");
		}

	
	}
}

class a1
{
	public double max (double[] arr)
	{
		double a = 0;
		for(int i = 0 ; i < (arr.length - 1); i++)
		{
			if(arr[i] > arr[i + 1])
			{
				a = arr[i];
			}
			else
			{
				a = arr[i + 1];
			}
		}
		return a;
	}
}
class A02
{
	public void find (double[] arr, double a)
	{
		for(int i = 0 ; i < arr.length ; i++)
		{
			if(arr[i] == a)
			{
				System.out.println("yes");
				break;
			}
			else if ((i != arr.length - 1) && (arr[i] != a))
			{

			}
			else if ((i == arr.length - 1 ) && (arr[i] != a))
			{
				System.out.println("no");
				break;
			}
		}
	}
}
class Book
{
	public int updatePrice(int a)
	{
		if (a > 150)
		{
			a = 150;
			return a;
		}
		else if((a > 100) && (a <= 150))
		{
			a = 100;
			return a;
		}
		else
		{
			return a;
		} 
	}
}