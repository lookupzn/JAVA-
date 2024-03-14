public class H04
{
	public static void main(String[] args)
	{
		//用变量将姓名等信息储存
		String name = "David Jones JR";
		int age = 27;
		double score = 78.6;
		char gender = '男';
		String hobby = "swimming";
		//添加转义字符，使用一条语句输出
		System.out.println("姓名\t年龄\t成绩\t性别\t爱好\n"+ name + "\t" + 
			age + "\t" + score + "\t" +  gender + "\t" + hobby);//使用+
	}
}