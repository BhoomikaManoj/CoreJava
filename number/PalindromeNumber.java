package com.uttara.number;

import java.util.Scanner;

public class PalindromeNumber {

	public void palindromeNumber(int num)
	{
		int n = num;
		int temp; 
		int reverse = 0;
		while(num != 0)
		{
			temp = num % 10; 
			reverse = (reverse * 10) + temp;
			num = num /10;
		}
		if(reverse == n)
			System.out.println(n +" is a palindrome number");
		else
			System.out.println(n +" is a palindrome number");
	}
	public static void main(String[] args) {
		PalindromeNumber pn = new PalindromeNumber();
		System.out.println("Enter number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		pn.palindromeNumber(num);
	}

}
