public class SimplePrograms
{
	public static void main(String[] args)
	{
		int h = 0x45E213;
		System.out.println(h);
	}
}

class Add
{
	public static void main(String[] args)
	{
		int x =20;
		int y = 20;
		long result = x+y;
		System.out.println("Integer value addition is" + (x+y));

		double a = 12.03;
		double b = 1232.32;
		double result1 = a+b;
		System.out.println("double value addition is" + (a+b));

		char c = 'a';
		int i = 100;
		int resultOfInteger = c + i;
		char resultOfChar = (char)resultOfInteger;
		System.out.println("result Of Integer value is "+ resultOfInteger);
		System.out.println("result Of char value is "+ resultOfChar);

	}
}
class DataTypes
{
	public static void main(String[] args)
	{
		int x = 20;
		int y = 18;
		double a = 79;
		double b = 45;
// we can assign the compute value or we directly compute in println statment.
		double remainder;
		int quotient;

		System.out.println("for Integer values");
		System.out.println("remainder is "+(x/y));
		System.out.println("quotient" + (x%y));

		System.out.println("for double values");
		System.out.println("remainder is " + (a/b));
		System.out.println("quotient is " +(b/a));


		System.out.println("for Integer values");
		System.out.println(x-y);
		System.out.println(y-x);

		System.out.println("for double values");
		System.out.println(a-b);
		System.out.println(b-a);

		System.out.println("for Integer values");
		System.out.println(x*y);
		System.out.println(y*x);

		System.out.println("for double values");
		System.out.println(a*b);
		System.out.println(b*a);

		System.out.println("for Integer values");
		System.out.println(x/y);
		System.out.println(y/x);

		System.out.println("for double values");
		System.out.println(a/b);
		System.out.println(b/a);




		long l = -1L >>> 1;
		double f = l;
		System.out.println(l);
		System.out.println(f);

		byte b = 123;
		short s = 1232;
		int result = b + s;
		short r = (byte)result;
		System.out.println(result);
		System.out.println("Data loss "+r);
		// loss data while convertion


	}
}
class Operator
{
	public static void main(String[] args)
	{
		int i = 55;
		int j = 55;

		// it is a infintie loop beacuse
		// i<=j, j<=i is ture and i==j is also true
		// true & true =true
		while(i <= j && j<=i & i==j)
		{
			System.out.println("Abc");
		}


		int i = 0;
		boolean t = true;
		boolean f = false, b;
		b = (t & ((i++) == 0)); // t, i =0
		System.out.println(b);
		b = (f & ((i+=2) > 0)); // f i=1
		System.out.println(b);



		System.out.println(1==1 ? 5 : 6);
		System.out.println(1==2 ? 5 : 6);
		System.out.println(1==1 ? true : false);
		System.out.println(1==2 ? false : true);

 		System.out.println( true ? false : true);
		System.out.println( true ? true: false);
		char x = 'X';
 		int i=0;
 		System.out.println(true ? x : 0);
		System.out.println(false ? i : x);



		//use BODMAS Rule
		System.out.println(1+2*5/2-2*4);
		System.out.println(1*2*5-2+24);
		System.out.println(1+2/5/2/2-4);
	}
}























