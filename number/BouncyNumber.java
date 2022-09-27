package com.uttara.number;

import java.util.Scanner;

public class BouncyNumber {

	public boolean increasingOrderNumber(int num) {
		int x = num % 10;
		num = num / 10;
		boolean flag = false;
		while (num > 0) {
			if (x <= (num % 10)) {
				flag = true;
				break;
			}
			x = num % 10;
			num = num / 10;
		}
		if (flag)
			return true;
		else
			return false;
	}

	public boolean decreasingOrder(int num) {
		int x = num % 10;
		num = num / 10;
		boolean flag = false;
		while (num > 0) {
			if (x <= (num % 10)) {
				flag = true;
				break;
			}
			x = num % 10;
			num = num / 10;
		}
		if (flag)
			return true;
		else
			return false;
	}

	public static void main(String args[]) {
		BouncyNumber bn = new BouncyNumber();
		System.out.println("Enter any number : ");
		Scanner scan = new Scanner(System.in);
		int inputNumber = scan.nextInt();
		if (bn.increasingOrderNumber(inputNumber) || bn.decreasingOrder(inputNumber) || inputNumber < 101)
			System.out.println(inputNumber + " Not a Bouncy number");
		else
			System.out.println(inputNumber + " is a Bouncy number");
	}
}
