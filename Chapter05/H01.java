public class H01
{
	public static void main(String[] args)
	{
		//100000元根据50000标准交过路费
		double totalMoney = 100000.0;
		double rate = 0.05;
		double k = 50000.0;
		double funderFee = 1000;
		int i = 0;//经过多少次路口
		while(true)
		{
			if(totalMoney > k)
			{
				totalMoney = totalMoney * (1 - rate);
				i++;
			}
			else if ((totalMoney >= funderFee) && (totalMoney < k))//剩下不到1k就无法通过路口了
			{
				totalMoney = totalMoney - funderFee;
				i++;
			}
			else 
			{
				System.out.println("一共" + i + "次" );//62而不是63
				break;
			}
		}
	}
}