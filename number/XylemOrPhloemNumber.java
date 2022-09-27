package com.uttara.number;

import java.util.Scanner;

public class XylemOrPhloemNumber {

	public void xylemOrPhloemNumber(int num) {

		num = Math.abs(num);
		int n = num;
		int extreme_sum = 0;
		int mean_sum = 0;

		while (n != 0) {
			if (n == num || n < 10)
				extreme_sum = extreme_sum + n % 10;
			else 
				mean_sum = mean_sum + n % 10;
			n = n / 10;
		}
			System.out.println("The sum of extreme digits: " + extreme_sum);
			System.out.println("The sum of mean digits: " + mean_sum);
			if (extreme_sum == mean_sum)
				System.out.println(num + " is a xylem number.");
			else
				System.out.println(num + " is a phloem number.");
	}

	public static void main(String[] args) {
		XylemOrPhloemNumber xp = new XylemOrPhloemNumber();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		xp.xylemOrPhloemNumber(num);
	}

}
