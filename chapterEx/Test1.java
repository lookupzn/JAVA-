public class Test1
{
	public static void main(String[] args)

	{
		T001 t = new T001();
		t.t001();
	}
}
class T001// 全局变量和局部变量的就近原则和重名规则
{
	int a = 100;

	public void t001()
	{
		System.out.println("a = " + a);
		int a = 200;
		System.out.println("a = " + a);
	}
}