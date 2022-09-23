public class MathTest
{
	public void add(int x,int y,double a,double b)
	{
		long result = x+y;
		System.out.println("Sum of Integer value is " + (x+y));
		System.out.println("Sum of Double value is " + (a+b));
	}
	public void addArray(int[] a, int[] b)
	{
		int[] sum = new int[a.length];
		for(int i = 0; i <= a.length-1; i++)
			for(int j = i; j <= a.length-1; j++)
				sum[i] = a[i] + b[i];
		for(int x : sum)
			System.out.println("Sum of two array values " + x);
	}
	public static void main(String[] args)
	{
		MathTest m = new MathTest();
		m.add(10, 20, 12.50, 17.50);
		int[] a = {10,20};
		int[] b = {10,20};
		m.addArray(a, b);
	}
}

class CommandLineArgs
{
	public static void main(String[] args)
	{
		if(args.length > 0)
		{
			StringBuffer sb = new StringBuffer();
			for(int i = 0; i < args.length; i++)
			{
				sb.append(args[i]);
			}
			System.out.println("concate string is " + sb);
		}
		else
			System.out.println("No arguments list is found");
	}
}

class Complex
{
	private int image,real;
	public Complex(int r,int i)
	{
		real = r;
		image = i;
	}
	public void setImage(int i)
	{
		image = i;
	}

	public int getImage()
	{
		return image;
	}
	public void setReal(int r)
	{
		real = r;
	}
	public int getReal()
	{
		return real;
	}
}
class X
{
	public static Complex add(Complex c1, Complex c2)
	{
		int r = c1.getReal() + c2.getReal();
		int i = c1.getImage() + c2.getImage();

		Complex c = new Complex(r,i);
		return c;
	}
	public static void main(String[] args)
	{
		Complex co1 = new Complex(5,4);
		Complex co2 = new Complex(5,6);
		Complex co3 = X.add(co1,co1);
		System.out.println(co3.getReal());
		System.out.println(co3.getImage());
	}
}