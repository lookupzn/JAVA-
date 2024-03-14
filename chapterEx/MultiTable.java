public class MultiTable
{
	public static void main(String[] args)
	{
		//第二个数为每一行最大值，第一个数达到最大值进行换行操作
		int i1 = 1;//第一个数
		int i2 = 1;//第二个数
		int imax = 9;//99乘法表极限
		for(i2 = 1; i2 <= imax; i2++)
		{
			for(i1 = 1;i1 <= i2; i1++)
			{
				System.out.print(i1 + "*" + i2 + "=" + (i1 * i2));
				System.out.print(" ");
			}
			System.out.println();
		}

}
}