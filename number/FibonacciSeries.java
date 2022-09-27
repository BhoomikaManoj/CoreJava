package com.uttara.number;

import java.util.Scanner;

public class FibonacciSeries {
	
	public void fibonacciSeries(int num) {
		int f1 = 0,f2 = 1 ,f3;
		System.out.println("Fibonacci Series are ");
		System.out.print(f1+","+f2+",");
		for(int i = 2; i < num; i++)
		{
			f3 = f1 + f2;
			System.out.print(f3+",");
			f1 = f2;
			f2 = f3;
		}
	}
	
	public int fibonacciSeriesRecursive(int num) {
		if(num <= 1)
			return num;
		else
			return fibonacciSeriesRecursive(num-1)+fibonacciSeriesRecursive(num-2);
	}

	public static void main(String[] args) {
		FibonacciSeries fs = new FibonacciSeries();
		System.out.println("Enter number ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		fs.fibonacciSeries(num);
		System.out.println("");
		for (int i = 0; i < num; i++)
			System.out.println("Fibonacci Series of "+num+" is "+fs.fibonacciSeriesRecursive(i));

	}

}
