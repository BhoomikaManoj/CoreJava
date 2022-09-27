package com.uttara.number;

import java.util.Scanner;

public class HappyNumber {

	public boolean happyNumber(int num) {
		if (num == 1 || num == 7)
			return true;
		int sum = num, x = num;

		// this loop executes till the sum of square of
		// digits obtained is not a single digit number
		while (sum > 9) {
			sum = 0;

			// this loop finds the sum of square of digits
			while (x > 0) {
				int d = x % 10;
				sum += d * d;
				x /= 10;
			}
			if (sum == 1)
				return true;
			x = sum;
		}
		if (sum == 7)
			return true;
		return false;
	}

	public static int isHappyNumber(int num) {
		int rem = 0, sum = 0;

		// Calculates the sum of squares of digits
		while (num > 0) {
			rem = num % 10;
			sum = sum + (rem * rem);
			num = num / 10;
		}
		return sum;
	}

	public static void main(String[] args) {
		HappyNumber hn = new HappyNumber();
		System.out.println("Enter number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if (hn.happyNumber(num))
			System.out.println(num + " is a Happy number");
		else
			System.out.println(num + " is not a Happy number");
		System.out.println("List of happy numbers between 1 to " + num+":");
		for (int i = 1; i <= 100; i++) {
			int result = i;

			// Happy number always ends with 1 and
			// unhappy number ends in a cycle of repeating numbers which contains 4
			while (result != 1 && result != 4) {
				result = isHappyNumber(result);
			}

			if (result == 1)
				System.out.print(i + " ");
		}

	}
}