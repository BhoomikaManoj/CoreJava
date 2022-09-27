package com.uttara.number;

import java.util.Scanner;

public class StrongNumber {

	public int fact(int num) {
		int fact = 1;
		for (int i = 1; i <= num; i++)
			fact = fact * i;
		return fact;
	}

	public void strongNumber(int num) {
		int sum = 0, temp = num, n;

		while (temp != 0) {
			n = temp % 10;
			sum = sum + fact(n);
			temp = temp / 10;
		}
		if (sum == num)
			System.out.println(num + " is Strong Number");
		else
			System.out.println(num + " is not Strong Number");
	}

	public static void main(String[] args) {
		StrongNumber sn = new StrongNumber();
		System.out.println("Enter number ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sn.strongNumber(num);
	}

}
