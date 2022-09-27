package com.uttara.number;

import java.util.Scanner;

public class IncreasingNumber {

	public static void increasingOrderNumber(int num)
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
	public static void main(String[] args) {
		IncreasingNumber ic = new IncreasingNumber();
		System.out.println("Enter number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		ic.increasingOrderNumber(num);

	}

}
