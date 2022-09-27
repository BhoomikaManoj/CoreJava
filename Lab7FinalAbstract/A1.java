public class A1
{
	static String name;

	public A1(String name)
	{
		this.name = name;
		System.out.println("constructor A = "+ this.name);
	}

	public void print()
	{
		System.out.println("Class A = "+name);
	}
}
class B extends A1
{
	public B(String n)
	{
		super(n);
		System.out.println("constructor B = "+ this.name);
	}
	public void print()
	{
		System.out.println("Class B = "+name);
	}
}

class TestA1
{
	public static void main(String[] args)
	{
		B b = new B("abc");
		b.print();
		A1 a = new B("def");
		a.print();
		A1 a2 = new A1("xyz");
		a2.print();
	}
}