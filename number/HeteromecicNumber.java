package com.uttara.number;

import java.util.Scanner;

// A pronic/HeteromecicNumber number is a number which is the product of two consecutive integers, that is, a number of the form n(n + 1)

public class HeteromecicNumber {

	public void heteromecicNumber(int num) {
		int flag = 0;
		for (int i = 0; i < num; i++) {
			if (i * (i + 1) == num) {
				flag = 1;
				break;
			}
		}
		if (flag == 1)
			System.out.println(num + " is a Pronic Number.");
		else
			System.out.println(num + " is not a Pronic Number.");
	}

	public static void main(String[] args) {
		HeteromecicNumber hn = new HeteromecicNumber();
		System.out.println("Enter number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		hn.heteromecicNumber(num);

	}

}
