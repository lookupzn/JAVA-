public class H02
{
	public static void main(String[] args)
	{
			int[] arrOld = {1, 2, 3};
			A03 a = new A03();
			a.copyArr(arrOld);
			System.out.println(" ");
			circle c = new circle(3);
			c.Zhouchang();
			c.Mianji();
			cale hahaha = new cale(3.0,0.0);
			System.out.println(" " + hahaha.jia());
			System.out.println(" " + hahaha.jian());
			System.out.println(" " + hahaha.cheng());
			if (hahaha.chu() != null)
			{
				System.out.println(" " + hahaha.chu());
			}
			else
			{
				System.out.println("Wrong Num!!");
			}
	}
}
class A03
{

	public void copyArr(int[] arr)
	{
		int[] arrNew = new int[arr.length];
		for(int i = 0; i < arr.length; i++)
		{
			arrNew[i] = arr[i];
		}
		System.out.println("new array : " );
		for(int i = 0; i < arrNew.length; i++)
		{
			System.out.print(arrNew[i]+" ");
		}
	}
}
class circle
{
	double banjing;
	public final double yuanzhoulv = 3.14;
	public circle(int banjing)
	{
		this.banjing = banjing;
	}
	public void Zhouchang()
	{
		System.out.println("周长为 ：" + (2*this.banjing*yuanzhoulv));
	}
	public void Mianji()
	{
		System.out.println("面积为 ：" + (this.banjing*this.banjing*yuanzhoulv));
	}
}
class cale
{
	double a;
	double b;
	public cale(double a,double b)
	{
		this.a = a;
		this.b = b;
	}
	public double jia(){
		return (this.a + this.b);
	}
	public double jian()
	{
		return (this.a - this.b);
	}
	public double cheng()
	{
		return (this.a * this.b);
	}
	public Double chu()
	{
		if (b != 0)
		{return (this.a / this.b);}
		else
		{return null;}
	}
}