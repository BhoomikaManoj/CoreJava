import java.util.Arrays;

public class JavaLab3
{
	public static void even(int i)
	{
		if(i % 2 == 0)
		{
			System.out.println("It is a even number");
			System.out.println("find even number using % operator");
		}
		else
			System.out.println("It is not a even number");

		if((i & 1) == 0)
		{
			System.out.println("It is a even number");
			System.out.println("find even number using bit wise operator &");
		}
		else
			System.out.println("It is not a even number");
	}

	public static void multiplication(int number1,int number2)
	{
		if(number1 > number2)
			for(int i = 1;i <= number1;i++)
				System.out.println(number2+" * "+i+" = "+(number2*i));
		else
			for(int i = 1;i <= number2;i++)
				System.out.println(number1+" * "+i+" = "+(number1*i));
	}

	public static void divide(int i)
	{
		if(i % 3 == 0)
			System.out.println(i+" is divisiable by 3");
		else
			System.out.println(i+" is not divisiable by 3");
	}
	public static String primeNumber(int num)
	{
		if(num < 0)
			return "Invaild number";
		if(num == 0 || num == 1)
			return num+" Not a prime number";
		if((num & 1) == 0)
			return num+" Not a prime number";
		for(int a = 3; a < (num/2); a += 2)
		{
			if(num % a == 0)
				return num+" Not a prime number";
		}
		return num+" is a prime number";
	}

	public static void prime(int num)
	{
		int count;
		for (int i = 1; i <= num; i++)
		{
			count = 0;
			for (int j = 2; j <= i / 2; j++)
			{
		   		if (i % j == 0)
		   		{
		     		count++;
		     		break;
		    	}
		   }

		   if (count == 0)
		   {
		    	System.out.println(i+ " ");
		   }
		}
	}

	public static void average(int a,int b,int c)
	{
		float sum = (a+b+c)/3;
		System.out.println("Average of three numbers "+sum);
	}

	public static void test()
	{
		int num = 10;
		int count = 0;
		for(int i = 0 ; i < num ; i++)
		{
			if((num & 1) == 1)
				count++;
			num = num >> 1;
		}
		System.out.println(count);
	}

	public static void main(String[] args)
	{
		even(2);
		even(4);
		even(7);
		/*average(12,24,245);
		average(-12,40,50);
		average(10,50,15);*/

	}

}

class PowerOfTwo {

	// Function to check if
	// x is power of 2
	public static boolean isPowerOfTwo(int n)
	{
		if (n == 0)
			return false;
		while (n != 1)
		{
			if (n % 2 != 0)
				return false;
			n = n / 2;
		}
		return true;
	}
	// Driver program
	public static void main(String args[])
	{
		if (isPowerOfTwo(31))
			System.out.println("Yes");
		else
			System.out.println("No");
		if (isPowerOfTwo(64))
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}

class Numbers
{
	public static void decreasingOrder(int num)
	{
		int x = num % 10;
		num = num/10;
		boolean flag = false;
		while(num > 0)
		{
			if(x <= (num % 10))
			{
				flag = true;
				break;
			}
			x = num % 10;
			num = num/10;
		}
		if(flag)
			System.out.println("Digits are in decreasing order.");
		else
			System.out.println("Digits are not in decreasing order.");
	}
	public static void main(String[] args)
	{
		decreasingOrder(-1234);
		decreasingOrder(1234);
		decreasingOrder(1234567);
		decreasingOrder(4567);
		decreasingOrder(765);
		decreasingOrder(543321);
	}
}
class Numbers1
{
	public static void increasingOrder(int num)
	{
		int x = num % 10;
		num = num/10;
		boolean flag = false;
		while(num > 0)
		{
			if(x <= (num % 10))
			{
				flag = true;
				break;
			}
			x = num % 10;
			num = num/10;
		}
		if(flag)
			System.out.println("Digits are not in increasing order.");
		else
			System.out.println("Digits are in increasing order.");
	}
	public static void main(String[] args)
	{
		increasingOrder(-1234);
		increasingOrder(4321);
		increasingOrder(1234567);
		increasingOrder(4567);
		increasingOrder(321);
		increasingOrder(543321);
	}
}
class Number3
{
	public static String sameNumber(int num)
	{
		int d = num % 10 ;
		while(num != 0)
		{
			int currentdigit = num % 10;
			num = num/10;
			if(d != currentdigit)
				return "No";
		}
		return "yes";
	}
	public static void sumOfDigits(int num)
	{
		double sum = 0;
		int reminder;
		while(num > 0)
		{
			reminder = num % 10;
			num = num/10;
			sum = sum + reminder;
		}
		System.out.println("Sum of digits is " + sum);
	}
	public static void presentNumber(int num, int digit)
	{
		int count = 0;
		while(num > 0)
		{
			if ((num % 10) == digit)
				count++;
			num = num / 10;
		}
		if(count > 1)
			System.out.println("yes "+ digit + " present in " +count + "times");
		else
			System.out.println("no repeat");
	}
	public static void palindrome(int startNumber,int endNumber)
	{
		int num1,num2;
		for(int i = startNumber; i <= endNumber; i++)
		{
			num1=i;
		    num2=0;
		    while(num1!=0)
		    {
		    	int rem=num1%10;
		    	num1/=10;
				num2=num2*10+rem;
			}
			if(i==num2)
				System.out.print(i+" ");
		}
	}
	public static void main(String[] args)
	{
		palindrome(10,1000000);
	}
}

class SameDigit
{
	public static boolean sameDigitAndLength(int num1,int num2)
	{
		String s1 = String.valueOf(num1);
		char[] c1 = s1.toCharArray();
		Arrays.sort(c1);

		String s2 = String.valueOf(num2);
		char[] c2 = s2.toCharArray();
		Arrays.sort(c2);

		return(Arrays.equals(c1,c2));
	}
	public static void main(String[] args)
	{
		System.out.println(sameDigitAndLength(112,345));
		System.out.println(sameDigitAndLength(112,121));
		System.out.println(sameDigitAndLength(90861,31234));
		System.out.println(sameDigitAndLength(132,-132));
		System.out.println(sameDigitAndLength(1234,9876));

	}
}

class Gcd
{
	public static void gcdOfTwoNumber(int num1,int num2)
	{
		int gcd = 1;
		for(int i = 1; i <= num1 && i <= num2; i++)
		{
			if(num1 % i == 0 && num2 % i == 0)
				gcd = i;
		}
		System.out.println("GCD of "+ num1 +" and "+ num2 +" is: "+gcd);
	}
	public static void main(String[] args)
	{
		gcdOfTwoNumber(8,16);
		gcdOfTwoNumber(4,2);
		gcdOfTwoNumber(10,15);
	}
}

class Secondbiggest
{
	public static void secondLarge(int a, int b, int c)
	{
		if(a > b && a < c || a < b && a > c)
			System.out.println("Second biggest number is " + a);
		else if(b < a && b > c || b > a && b < c)
			System.out.println("Second biggest number is " + b);
		else
			System.out.println("Second biggest number is " + c);
	}
	public static void main(String[] args)
	{
		secondLarge(10,20,30);
		secondLarge(10,-20,30);
		secondLarge(100,223,300);
		secondLarge(-10,-20,-30);
	}
}


































