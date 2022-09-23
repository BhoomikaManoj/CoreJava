public class Hello
{
	public static void main(String[] args)
	{
		System.out.println("Hello");
		byte b = -128;
		int i = b;
		//byte a = 128;
	}
}

class A
{
	public static void main(String[] args)
	{
		System.out.println("This is class A");
		byte b = 50;
		int x = b;
		b = (byte)x;
		short a = (short)x;
	 	float d = x;
	 	float c = d;
		System.out.println(b);

	}
}

class B
{
	public static void main(String[] args)
	{
		System.out.println("This is class B");
		System.out.println("1"+2+3);
		System.out.println(6+2+"4");
		System.out.println('2'+2+"2");
		//System.out.println('2`+2);// unclosed character literal or  illegal character: '`'
	}
}
class C
{
	public static void main(String[] args)
	{
		System.out.println("This is class c");
	}
}

class A1
{

	public static void main(String[] args)
	{
		System.out.println("This is class A");
		int x = 10;
		int y = 4;
		int resultAdd = x + y;
		int resultSubtraction = x - y;
		int resultProduct = x * y;
		int resultDivision = x / y;
		int resultMod = x % y;

		System.out.println("Result of Add ="+ resultAdd);
		System.out.println("Result of Subtraction ="+ resultSubtraction);
		System.out.println("Result of Multiplication ="+ resultProduct);
		System.out.println("Result of Division ="+ resultDivision);
		System.out.println("Result of Mod ="+ resultMod);
	}
}


class B1
{
	public static void main(String[] args)
	{

		byte b = 10;
		b+=10;   //replace this code to solve the error it can be data lose for larger value
		int a = b + 10; // assign the integer value
		System.out.println(b);
		System.out.println(a);
		System.out.println(((Object)b).getClass().getSimpleName() + " - b data type");
		System.out.println(((Object)a).getClass().getSimpleName() + " - a data type");
	}
}

class C1
{

	public static void main(String[] args)
	{
		System.out.println("This is class C");

 		char c = 'X';
		int a = 98;
		//char d = a; //data loss while conversion int to char
		System.out.println(a); // it print the ASCII value of the alphabet or char

		char cc = 'X';
		int aa = 98;
		char dd = (char)aa;
		System.out.println(dd); //it print the alphabet or char

		char c = 'A';
		int a = 63;
		int d = c;
		System.out.println(d);


 		char c = 'X';
		int a = 63;
		char d = (char)a;
		// byte d = 100 + 100; //incompatible types: possible lossy conversion from int to byte
 		//System.out.println(d);
	}
}

class D1
{
	public static void main(String[] args)
	{
		System.out.println("This is class D");

		// Its a run time error beacuse we cannot divide any number with zero

		int i = 10/0;
		System.out.println("interger value of i is " + i);

		double d = 10.0/0.0;
		System.out.println("double value of d is " + d);

		float f = 10.0f/0.0f;
		System.out.println("float value of f is " + f);

		double d1 = 10.0/0;
		System.out.println("double value of d1 is " + d1);

		double a1 = 10/0.0;
		System.out.println("double value of a1 is " + a1);

class E1
{
	public static void main(String[] args)
	{
		System.out.println("This is class D");

		int x = 100 + 100;
		byte result = (byte)x;
		System.out.println(result);

	}
}


























