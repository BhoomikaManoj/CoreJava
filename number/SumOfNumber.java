package com.uttara.number;

import java.util.Scanner;

public class SumOfNumber {
	
	public void sumOfNaturalNumbers(int num)
	{
		int sum = 0;
		for (int i = 0; i <= num; i++) {
			sum = sum + i;
		}
		System.out.println("Sum of natural numbers is "+sum);
	}
	public static void main(String[] args) {
		SumOfNumber sn = new SumOfNumber();
		System.out.println("Enter number ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sn.sumOfNaturalNumbers(num);
	}
}
