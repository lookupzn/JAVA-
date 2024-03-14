import java.util.Scanner;
public class SeqSearch
{
	public static void main(String[] args)
	{
		int[] arr = {1,8,89,10,1000,1234};
		int index = -1;
		Scanner myScanner = new Scanner(System.in);
		System.out.println("Type the number: ");
		int numType = myScanner.nextInt();
		for(int i = 0; i < arr.length; i++)
		{
			if (numType  ==  arr[i])
			{
				System.out.println("恭喜你找到 " + numType);
				System.out.println("下标为" + i);
				index = i;
				break;
			}

		}
		if (index == -1)
		{
			System.out.println("sorry, no " + numType);
		}
	}
}