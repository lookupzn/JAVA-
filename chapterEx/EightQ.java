public class EightQ{
	public static void main(String[] args)
	{
		//八皇后，不可以同一排同一列同一斜线
		//结果为排列方法
		int arrQ = new int[8];//1.建立一个8个长度的一维数组，元素下标为横坐标
		
		for(int i = 0; i < 8 ; i++)
		{
			//2. 让第一个女皇的位置从(0,0) --> (0,7)都进行测试
			for(int j = 0; j < 8; j++)
			{

			}
		}

	}
}

class Queen
{
	public int methodForCount (int m,int n)
	{
		int i = 0;
		if(n == 0)
		{
			return 1;
		}
		else if (m != arrQ[n - 1]) && (m != (arrQ[n -1] + m - n + 1)) && (m != (arrQ[n -1] - m + n - 1) )
		{
			
			methodForCount (m,(n-1));			
			//3. 设计方法来统计成功布局一次的次数,失败不用统计
		}
		else
		{
			return 0;
		}
			
		}
		
	}


}