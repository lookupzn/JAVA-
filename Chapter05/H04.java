import java.util.Scanner;

public class H04
{
	public static void main(String[] args)
	{
		//水仙花数：1.三位数 2.每个位置上的数字的三次方之和等于这个三位数
		//思路：1.判断这个数在三位数范围内 2.将这三位数的每一位数字提出 3.按水仙花数的规律进行计算
		//开始
		Scanner myScanner = new Scanner(System.in);//录入数字
		System.out.print("输入数字： ");
		int num = myScanner.nextInt();
		int hNum = num / 100;
		int tNum = (num - (100 * hNum)) / 10;
		int gNum = (num - (100 * hNum)) % 10;//提出每一位数字
		if (num >= 100 && num <= 999)// 确保是3位数
		{
			if(num == (hNum * hNum * hNum) + (tNum * tNum * tNum) + (gNum * gNum * gNum))
			{
				System.out.println(num +"是水仙数");
			}
			else
			{
				System.out.println(num +"不是水仙数");
			}
		}
		else
		{
			System.out.println("数字格式不对");
		}
	}
}