public class A
{
	public static final int R = 5; // we cannot re-assign the final variable value because it constant, it immutable
	final int p; // we cannot re-assign the final variables
	A(int p)
	{
		this.p = p;
	}

}

class TestA
{
	public static void main(String[] args)
	{
		A obj = new A(10);
		System.out.println("P = "+ obj.p);
		System.out.println("R = "+obj.R);
	}
}