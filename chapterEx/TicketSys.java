import java.util.Scanner;

public class TicketSys
{
	public static void main(String[] args)
	{
		Scanner myScanner = new Scanner(System.in);
		System.out.println("请输入月份： ");
		int month = myScanner.nextInt();
		if(month >= 1 && month <= 12)
		{
			if(month >= 4 && month <= 10)
			{
				System.out.println("请输入年龄： ");
				int age = myScanner.nextInt();
				if (age >= 18 && age <= 60)
				{
					System.out.println("您需要缴纳60元");
				}
				else if (age < 18 && age >= 0)
				{
					System.out.println("您需要缴纳30元");
				}
				else if (age > 60)
				{
					System.out.println("您需要缴纳20元");
				}
				else
				{
					System.out.println("Data Error.");
				}
			}
			else if((month < 4 && month >= 1) || (month > 10 && month <= 12))
			{
				System.out.println("请输入年龄： ");
				int age01 = myScanner.nextInt();
				if (age01 >= 18 && age01 <= 60)
				{
					System.out.println("您需要缴纳40元");
				}
				else if (age01 < 0)
				{
					System.out.println("Data Error.");
				}
				else
				{
					System.out.println("您需要缴纳20元");
				}
			}
		}
		else
		{
			System.out.println("请输入正确月份");
		}
	}
}