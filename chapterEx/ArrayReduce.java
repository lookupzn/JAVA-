import java.util.Scanner;
public class ArrayReduce
{
	public static void main(String[] args)
	{
		int[] arr = {1,2,3,4,5};
		Scanner myScanner = new Scanner(System.in);
		do
		{
			System.out.println("是否删减元素？ y/n");
			char key = myScanner.next().charAt(0);
			if ((key == 'y') && (arr.length > 1))
			{
				int[] arrNew = new int[arr.length - 1];
				for(int i = 0; i < (arr.length - 1); i++)
				{
					arrNew[i] = arr[i];
				}
				arr = arrNew;
				System.out.println("====arr 扩容后元素情况====");
				for(int i = 0; i < arr.length; i++) 
				{
				System.out.print(arr[i] + "\t");
				}
				System.out.println("");
			}
			else if (key == 'n')
			{
				System.out.println("stop");
				break;
			}
			else if (arr.length == 1)
			{
				System.out.println("length is not enough!");
				break;
			}
			else 
			{
				System.out.println("again");
			}
			
		}while(true);
	}
}