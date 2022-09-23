public class MethodTest
{
	public static void print1()
	{
		System.out.println("in print()");
	}

	public static int print()
	{
		System.out.println("in print()");
		return 1;
	}

	public static void x()
	{
		int a = 10;
		y();
		System.out.println("This is x class, its a value is "+a);
	}

	public static void y()
	{
		int b = 20;
		System.out.println("This is y class, its a value is "+b);
	}

	public static void main(String[] args)
	{

		int i = print();
		System.out.println(i);
		x();
		test2 t2 = new test2();
		t2.z();
	}
}

class test2
{
	public static void z()
	{
		System.out.println("method z");
	}
}

class Multiplication
{
	public static void tablesBetweenTwoNumbers(int number1,int number2)
	{
		if(number1 > number2)
			for(int i = 1;i <= number1;i++)
				System.out.println(number2+" * "+i+" = "+(number2*i));
		else
			for(int i = 1;i <= number2;i++)
				System.out.println(number1+" * "+i+" = "+(number1*i));

	}

	public static void tables(int number)
	{
		for(int i = 1;i <= 10;i++)
			System.out.println(number+" * "+i+" = "+(number*i));
	}

	public static void main(String[] args)
	{
		//tablesBetweenTwoNumbers(5,3)
		tablesBetweenTwoNumbers(5,6);
	}
}
class TestLoop
{
	public static void numbers(int number)
	{
		int k = 11;
		for(int i = 1,j=1; i<= number; i++)
		{
			if(k == i )
			{
				System.out.println();
				j++;
				k = 11*j;
			}
			else
				System.out.print(i);
		}
	}
	public static void main(String[] args)
	{
		numbers(100);
	}
}

class FindNumOfDaysInMonth
{
	public static void findDays(int month,int year)
	{
		if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
			System.out.println("It is a Leap year");
		else
			System.out.println("It is Not a leap year.");
		switch(month)
		{
			case 1,3,5,7,8,10,12:System.out.println("31 days in "+ month+" month");
					break;
			case 2:if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
					{
						System.out.println("29 days in "+ month+" month");
					}
					else
					{
						System.out.println("It is Not a leap year.");
						System.out.println("28 days in "+ month+" month");
					}
					break;
			case 4,6,9,11 :System.out.println("30 days in "+ month+" month");
					break;
		}
	}
	public static void main(String[] args)
	{
		findDays(2,1996);
		findDays(3,1995);
		findDays(4,1995);
	}
}

class NumberPattern
{
	public static void pattern3(int row)
	{
		int i, j;
		//Outer loop work for rows
		for (i=0; i<row; i++)
		{
			for (j=row-i; j>1; j--) //inner loop work for space
			{
				System.out.print(" ");
			}
			for (j=0; j<=i; j++ ) //inner loop for columns
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}


	public static void pattern2(int number)
	{
		for(int i = number; i > 0; i--)
		{
			for(int j = 1; j <= i ; j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}


	public static void pattern1(int number)
	{
		for(int i = 1; i<= number; i++)
		{
			for(int j = 1; j <= i; j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
	public static void main(String[] args)
	{
		pattern3(6);
	}

}
class PrintName
{
	public static void oddEven(int i)
	{
		if(i % 2 == 0)
		{
			System.out.println("its a even number");
			for(int j = 0; j < i; j++)
				System.out.println("shambo");
		}
		else
		{
			System.out.println("Its a odd number");
			for(int j = 0; j < i; j++)
				System.out.println("govida");
		}

	}

	public static void printCharacter()
	{
		for(int i = 0; i <= 65535; i++)
		{
			if(i % 5 != 0)
				System.out.print((char)i + "  " + i+ " ");
		}

	}
	public static void main(String[] args)
	{

		printCharacter();
	}
}















