package com.uttara.numbersPattern;

public class NumberPattern13 {

	public static void main(String[] args) {
		int n = 5;

		for (int i = n; i > 0; i--) {
			for (int k = i; k < n; k++)
				System.out.print(" ");
			for (int j = 1; j <= i; j++)
				System.out.print(j);
			System.out.println(" ");
		}
	}

}
