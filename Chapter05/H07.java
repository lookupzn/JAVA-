public class H07
{
	public static void main(String[] args)
	{
		//利用char编码对应数字来
		char c01 = 'a';
		char c02 = 'Z';
		int count;
		for(count = 0; count < 26; count++)
		{
			System.out.print(c01 + " ");
			c01++;
		}
		System.out.println();
		for(count = 0; count < 26; count++)
		{
			System.out.print(c02 + " ");
			c02--;
		}
	}
}