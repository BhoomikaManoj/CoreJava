package com.uttara.number;

import java.util.Scanner;

public class LargestOf3Number {

	public void largestNumber(int a, int b, int c)
	{
		if(a == b && b== c)
			System.out.println("Three numbers are equal");
		else
		{
			if(a > b && a > c)
				System.out.println("Largest number is "+a);
			else if(b > a && b > c)
				System.out.println("Largest number is "+b);
			else
				System.out.println("Largest number is "+c);
		}
	}
	public static void main(String[] args) {
		
		LargestOf3Number ln = new LargestOf3Number();
		System.out.println("Enter three numbers");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		ln.largestNumber(a, b, c);
	}

}
