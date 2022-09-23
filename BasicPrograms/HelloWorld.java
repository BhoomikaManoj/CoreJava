public class HelloWorld
{
	public static void main(String[] args)
	{
		for(int k=1; k<=10; k++)
			System.out.println("Hello World "+k); // program 1,2,3 print hello world program
		int i = 1;
		int temp = i;
		for(int j=1; j<=10; j++)
			System.out.println("For Loop "+j); // program 4 print 1 to 10 times using for,while,dowhile

		while(i<=10)
		{
			System.out.println("While Loop "+i);
			i++;
		}
		do
		{
			System.out.println("Do While Loop "+temp);
			temp++;
		}while(temp<=10);
	}
}


class OddEven
{
	public static void main(String[] args)
	{
		System.out.println("odd numbers is "); // program 5 print odd number
		for(int i=1; i<=100; i++)
		{
			if(i%2 != 0)
				System.out.print(i+",");
		}

		System.out.println("\n"+"Even numbers is "); // program 5 print even number
		for(int i=1; i<=100; i++)
		{
			if(i%2 == 0)
				System.out.print(i+",");
		}

		System.out.println("\n"+"odd and Even numbers is "); // program 8 print odd and even number
		for(int i=1; i<=100; i++)
		{
			if(i%2 == 0)
				System.out.println("even number is "+i);
			else
				System.out.println("odd number is "+i);
		}

	}
}

class NonMultiplesOfThree
{
	public static void main(String[] args)
	{
		System.out.println("non multiples of 3 is "); // program 6 print non multiples of 3
		for(int i = 1; i <= 100; i++)
		{
			if(i%3 != 0)
				System.out.print(i+",");
		}
	}
}

class Divisble
{
	public static void main(String[] args)
	{
		// Divide any two int values and get the output of remainder and quotient
		int x = 245;
		int y = 10;
		int remainder = x % y;
		float quotient = (float)x / y;
		System.out.println(remainder);
		System.out.println(quotient);

		// program 9 print divisible, num is divisible by 3 or 5 and not both
		System.out.println("number is divisible by 3 or 5 and not both of 3 is ");
		for(int i = 1; i <= 100; i++)
		{
			//if(((i % 3 == 0) || (i % 5 == 0)) && (i % 15 != 0))
			if(i%3 == 0 ^ i%5 == 0)	// using XOR logic.truth table is T^T=F,T^F=T,F^F=F,F^T=F
				System.out.print(" "+i+",");
		}
	}
}
class Multiplication
{
	public static void main(String[] args)
	{
		int i = 100;
		System.out.println("100 is Divisible 2 the result is " +String.valueOf(i>>2));
		System.out.println("100 is Divisible 4 the result is " +String.valueOf(i>>4));
		System.out.println("100 is Divisible 8 the result is " +String.valueOf(i>>8));
		System.out.println("100 is multiply 2 the result is " +String.valueOf(i<<2));
		System.out.println("100 is multiply 4 the result is " +String.valueOf(i<<4));
		System.out.println("100 is multiply 8 the result is " +String.valueOf(i<<8));
	}
}
class Misc
{
	public static void main(String[] args)
	{
		int b = 127 + 10 ;
		byte result = (byte)b;
		System.out.println(result);

		System.out.println(2 >> 1);
		System.out.println(6 >> 2);
		System.out.println(-2 >> 1);

		System.out.println(10);
		System.out.println(012);
		System.out.println(0xAB);

		System.out.println( 2 << 1);
		System.out.println(6 << 2);
		System.out.println( -2 << 1);

		int x = 10;
		System.out.println("x value is "+ ~x);

		int y = 100;
 		System.out.println("a value is " +~y);

 		int a = 10;
		int b = 6;
 		System.out.println(a | b);

 		int aa = 100;
		int bb = 50;
 		System.out.println(aa | bb);

 		int xa = 10;
		int yb = 6;
		System.out.println(xa & yb);
		int ax = 100;
		int by = 50;
		System.out.println(ax & by);

		int xor1 = 10;
		int xor2 = 6;
		System.out.println(xor1 ^ xor2);
		int xor3 = 100;
		int xor4 = 50;
 		System.out.println(xor3 ^ xor4);

		System.out.println("----------");
 		int x1 = 10;
		System.out.println(x1 >>> 2);
		int a1 = -10;
		System.out.println(a1 >>> 2);

		System.out.println(4 | 3);
		System.out.println(4 | 4);
		System.out.println(4 & 3);
		System.out.println(4 / 3);

		int ii = 50;
		while(ii != 0){
			System.out.println(ii >>>= 1);
		}
	}
}

class Test
{
	public static void process(int i)
	{
		System.out.println(i);
	}
	public static void main(String[] args)
	{
		//int i = 10;
		Test.process(20);
	}
}

class Add
{
	public static int sum(int x,int y)
	{
		//int result = x+y;
		return x+y;
	}
	public static void main(String[] args)
	{
		//int i = 10;
		//int result = Add.sum(10,20);
		System.out.println(Add.sum(10,20));
	}
}
class SumOfDigit
{
	public static int sum(int x)
	{
		int result = 0;
		int remainder;
		int length = String.valueOf(x).length();
		if(length == 0)
			return 0;
		else if(x >= 1 || x <= 9)
			return x;
		else
		{
			for(int i=1; i<=length; i++)
			{
				remainder = x%10;
				x = x/10;
				result = result + remainder;
			}
		}
		return result;
	}
	public static void main(String[] args)
	{
		System.out.println(SumOfDigit.sum(6));
	}
}