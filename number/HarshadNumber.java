package com.uttara.number;

import java.util.Scanner;

public class HarshadNumber {

	public void harshadNumber(int num)
	{
		int temp = num,n, sum = 0 ;
		while(temp != 0)
		{
			n = temp % 10;
			sum = sum + n;
			temp = temp/10;
		}
		if(num % sum == 0)
			System.out.println(num+" is HarshadNumber");
		else
			System.out.println(num+" is not HarshadNumber");
	}
	public static void main(String[] args) {
		HarshadNumber hn = new HarshadNumber();
		System.out.println("Enter number ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		hn.harshadNumber(num);
	}

}
