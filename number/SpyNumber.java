package com.uttara.number;

import java.util.Scanner;

public class SpyNumber {

	public void spyNumber(int num)
	{
		int sum = 0, product = 1,n;
		int temp = num;
		while(temp != 0 )
		{
			n = temp % 10;
			sum = sum + n;
			product = product * n;
			temp = temp/10;
		}
		if(sum == product)
			System.out.println(num+" is Spy Number");
		else
			System.out.println(num+" is not Spy Number");
	}
	public static void main(String[] args) {
		SpyNumber sn = new SpyNumber();
		System.out.println("Enter number ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sn.spyNumber(num);
	}

}
