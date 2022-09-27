package com.uttara.number;

import java.util.Scanner;

public class DecreasingOrderNumber {

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
	public static void main(String[] args) {
		DecreasingOrderNumber dc = new DecreasingOrderNumber();
		System.out.println("Enter number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		dc.decreasingOrder(num);

	}

}
