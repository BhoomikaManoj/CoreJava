
package com.uttara.number;

import java.util.Scanner;

public class PrimeNumber {

	public void primeNumber(int num)
	{
		int count;
		for (int i = 1; i <= num; i++)
		{
			count = 0;
			for (int j = 2; j <= i / 2; j++)
			{
		   		if (i % j == 0 )
		   		{
		     		count++;
		     		break;
		    	}
		   }

		   if (count == 0 )
		   {
		    	System.out.print(i+ ",");
		   }
		}
	}
	public static void main(String[] args) {
		PrimeNumber pn = new PrimeNumber();
		System.out.println("Enter number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		pn.primeNumber(num);

	}

}
