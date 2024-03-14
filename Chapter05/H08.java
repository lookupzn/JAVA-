public class H08
{
	public static void main(String[] args)
	{
		//化繁为简：1.列出1/1到1/100这些数字
		double d = 1.0;
		int base = 1;
		double sum = 0;
		for(base = 1; base <= 100; base++)
		{
			//2.分成正负两拨，区分条件：base % 2 ==0
			//3.相加
			if(base % 2 == 0)
				{
					sum -= d / base;
				}
			else
				{
					sum += d / base;
				}			
		}
		System.out.println("总和为" + sum);
	}
}