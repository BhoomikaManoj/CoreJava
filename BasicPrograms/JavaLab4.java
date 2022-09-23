public class JavaLab4
{
	int x = 20;
	String str= "xyz";
	boolean y = false;
	public static void main(String[] args)
	{
		int a = 10;
		String b = "asdf";
		boolean z = true;

		//local variables value
		System.out.println("a = " + a + ", b =" + b + ", z =" + z);
		JavaLab4 jl = new JavaLab4();

		// access instance variable value
		System.out.println("x = " + jl.x + ", String = " + jl.str + ", boolean = " +jl.y);

		// passing value to object variables
		System.out.println(jl.x = 10);
		System.out.println(jl.str = "asd");
		System.out.println(jl.y);

	}
}