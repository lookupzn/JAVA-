public class Test
{
	public static void main(String[] args)
	{
		char[] charABC = new char[26];
		charABC[0] = 'A';
		for(int i = 0; i < charABC.length; i++)
		{
			charABC[i] = (char)(charABC[0] + i);
		}
		
		System.out.println("===×ÖÄ¸ÅÅÐò===");
		for(int i = 0; i < charABC.length; i++) 
		{
			System.out.print(charABC[i] + " ");
		}
	}
}