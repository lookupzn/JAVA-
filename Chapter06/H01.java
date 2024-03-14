public class H01
{
	public static void main(String[] args)
	{
		//1.插入数据为23
		//2.原数组{10，12，45，90}
		//3.保持数组顺序为升序
		//开始
		int[] arr = {10,12,45,90};
		int num = 23;
		//1. 将数插进数组最后
		int[] arrNew = new int[arr.length + 1];
		arrNew[arr.length] = num;
		for(int i = 0; i < arr.length; i++)
		{
			arrNew[i] = arr[i];
		}
		//2.排序
		//思路，将最后一个元素（即新数字）从后往前比较，
		//直到新数字比前一个数字大截至
		//原因：原数组是一个已经按升序排列的数组
		int temp = 0;//设置一个用来存储临时元素的变量
		for(int i = (arrNew.length - 1); i > 0; i--)
		{
			if(arrNew[i] < arrNew[(i - 1)])
			{
				temp = arrNew[i - 1];
				arrNew[i - 1] = arrNew[i];
				arrNew[i] = temp;
			}	
		}
		arr = arrNew;
		System.out.println("=====Final Result=====");

		for(int i = 0;i < arr.length; i++)
		{
			System.out.print(arr[i] + "\t");
		}
	}
}