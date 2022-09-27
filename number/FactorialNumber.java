package com.uttara.number;

import java.util.Scanner;

public class FactorialNumber {
	
	public void factorialNumber(int num)
	{
		int fact = 1;
		for (int i = 1; i <= num; i++) 
			fact = fact * i;
		System.out.println("Factorial of "+num+" is "+fact);
	}
	
	public int factorialNumberRecursive(int num)
	{
		if(num <= 1)
			return 1;
		else
			return num*factorialNumberRecursive(num-1);
		
	}
	public static void main(String[] args) {
		FactorialNumber fn = new FactorialNumber();
		System.out.println("Enter number ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		fn.factorialNumber(num);
		System.out.println("Factorial of "+num+" is "+fn.factorialNumberRecursive(num));
		
	}

}
