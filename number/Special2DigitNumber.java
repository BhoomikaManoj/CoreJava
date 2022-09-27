package com.uttara.number;

import java.util.Scanner;

public class Special2DigitNumber {

	static void specialNumber(int num) {
		if (num < 10 || num > 99)
			System.out.println("Invalid Input! " + "Number should have " + "2 digits only");
		else {
			int first = num / 10;
			int last = num % 10;
			int sum = first + last;
			int pro = first * last;

			if ((sum + pro) == num)
				System.out.println(num + " is a Special" + " Two-Digit Number");
			else
				System.out.println(num + " is Not a Special" + " Two-Digit Number");
		}
	}

	public static void main(String[] args) {
		Special2DigitNumber sn = new Special2DigitNumber();
		System.out.println("Enter 2 digit number only ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sn.specialNumber(num);

	}

}
