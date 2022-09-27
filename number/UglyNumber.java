package com.uttara.number;

import java.util.Scanner;

public class UglyNumber {

	static int maxDivide(int a, int b) {
		while (a % b == 0)
			a = a / b;
		return a;
	}
	static int isUgly(int no) {
		no = maxDivide(no, 2);
		no = maxDivide(no, 3);
		no = maxDivide(no, 5);

		return (no == 1) ? 1 : 0;
	}

	public int uglyNumber(int num) {

		int i = 1;
		int count = 1;
		while (num > count) {
			i++;
			if (isUgly(i) == 1)
				count++;
		}
		return i;

	}

	public static void main(String[] args) {
		UglyNumber un = new UglyNumber();
		System.out.println("Enter number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println(un.uglyNumber(num));

	}

}
