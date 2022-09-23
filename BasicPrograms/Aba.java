class Aba
{
	private int i = 10;
	public void write()
	{
		System.out.println(i);
	}
}

class B extends Aba
{
	public void write()
	{
		i = 20;
		System.out.println(i);
	}
	public static void main(String[] args)
	{
		Aba a = new B();
		a.write();
	}

}