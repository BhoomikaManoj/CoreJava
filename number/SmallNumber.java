package com.uttara.number;

import java.util.Scanner;

public class SmallNumber {

	public int smallestOfNumber(int a, int b, int c) {
		int smallestNumber = (a < b && a < c) ? a : (b < c && b < a ? b : c);
		return smallestNumber;
	}

	public static void main(String[] args) {

		SmallNumber sn = new SmallNumber();
		System.out.println("Enter three numbers");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		System.out.println("Smallest Number is " + sn.smallestOfNumber(a, b, c));
	}

}
