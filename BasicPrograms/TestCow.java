public class TestCow
{
	public static void main(String[] args)
	{
		Cow c1 = new Cow();
		c1.name = "Gowri";
		c1.moo();

		// one object with two variable
		Cow c2 = c1;
		c2.moo();
		c2.name = "gange";

		c1.moo();
		//one object two or more refernces
		Cow c3 = c2;
		c3.name = "kaveri";
		System.out.println("c1.name = "+c1.name);
		System.out.println("c2.name = "+c2.name);
		System.out.println("c3.name = "+c3.name);
		c1.moo();

	}
}