package com.uttara.number;

import java.util.Scanner;

public class AutomorphicNumber {

	public boolean automorphicNumber(int num) {
		int square = num * num;
		while (num > 0) {
			// find the remainder (last digit) of the variable num and square and comparing
			// them
			if (num % 10 != square % 10)
				// returns false if digits are not equal
				return false;
			num = num / 10;
			square = square / 10;
		}
		return true;
	}

	public static void main(String[] args) {
		AutomorphicNumber an = new AutomorphicNumber();
		System.out.println("Enter number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if(an.automorphicNumber(num))
			System.out.println(num+" is a AutomorphicNumber");
		else
			System.out.println(num+" is not a AutomorphicNumber");

	}

}
