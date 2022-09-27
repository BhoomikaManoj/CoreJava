package com.uttara.number;

import java.util.Scanner;

public class PostiveNegative {
	
	public static void postiveNegativeNumber(int num)
	{
		if(num < 0)
			 System.out.println("It\'s a negative value");
		else
			System.out.println("It\'s a postive value");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int num = sc.nextInt();
		postiveNegativeNumber(num);

	}

}
