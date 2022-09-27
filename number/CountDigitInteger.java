package com.uttara.number;

import java.util.Scanner;

public class CountDigitInteger {

	public void countDigit(long num)
	{
		int count = 0; 
		long temp;
		while(num != 0)
		{
			num = num /10;
			count++;
		}
		System.out.println("Number of digit in number is = "+count);
	}
	public static void main(String[] args) {
		CountDigitInteger cd = new CountDigitInteger();
		System.out.println("Enter number ");
		Scanner sc = new Scanner(System.in);
		long num = sc.nextLong();
		cd.countDigit(num);
	}

}
