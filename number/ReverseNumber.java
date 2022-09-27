package com.uttara.number;

import java.util.Scanner;

public class ReverseNumber {
	
	public void reverseNumber(int num)
	{
		int temp; 
		int reverse = 0;
		while(num != 0)
		{
			temp = num % 10; 
			reverse = (reverse * 10) + temp;
			num = num /10;
		}
		System.out.println("Reverve number is "+reverse);
	}

	public static void main(String[] args) {
		ReverseNumber rn = new ReverseNumber();
		System.out.println("Enter number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		rn.reverseNumber(num);

	}

}
