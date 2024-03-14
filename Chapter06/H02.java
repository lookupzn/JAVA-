public class H02
{
	public static void main(String[] args)
	{
		//1.随机10个整数（1-100）
		//2.倒序打印
		//3.平均值，最大值，最大值下标
		//4.查有没有8
		//开始
		int arr[] = new int[10];
		for(int i = 0; i < 10; i++)
		{
			int ran = (int)(Math.random()* 100 + 1);
			arr[i] = ran;
		}//1.创建一个带10个1-100随机数的数组
		int arrOri[] = new int[arr.length];
		for (int i = 0;i < arr.length ;i++ ) {
			arrOri[i] = arr[i];
		}
		System.out.println("===========原数组如下==========");
		for(int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i] + "\t");
		}

		//2.倒叙排序
		int temp = 0;
		for(int i = 0; i < arr.length - 1; i++)//外层循环9次
		{
			for(int j = 0;j < arr.length - 1 - i;j++)
			{
				if(arr[j] < arr[j + 1])
				{
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}//反向冒泡
		System.out.println("");
		System.out.println("===========排序后数组如下==========");
		for(int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i] + "\t");
		}
		System.out.println("");
		//平均值，最大值，最大值下标
		double sum = 0;
		for (int i = 0;i < arr.length;i++ )
		{
			sum += arr[i];	
		}
		double avgNum = sum / arr.length;
		for (int i= 0; i < arr.length;i++)
		{
			if(arrOri[i] == arr[0])
			{
				System.out.println( "最大数为 " + arrOri[i] + "\n" + "最大数的下标为 " + i);
			}
		}
		System.out.println( "总和为 " + sum + "\n" + "平均数为 " + avgNum);

		//查有没有8
		int index = -1;
		for (int i= 0; i < arr.length;i++)
		{
			if(arrOri[i] == 8)
			{
				index = i;
			}	
		}
		if(index == -1)
		{
			System.out.println( "没有8");
		}
		else
		{
			System.out.println( "有8");
		}
	}
}