public class Test
{
	public static void process(int x)
	{
		System.out.println("process() x=  " + x);
	}

	public static int processReturn(int x)
	{
		if(x%2 == 0)
			return 1;
		else
			return 0;
	}

	public static void main(String[] args)
	{
		System.out.println("main() start");
		Test.process(5);
		System.out.println(Test.processReturn(5));
		System.out.println("main() end");
	}
}
class A
{
}

class B
{
}