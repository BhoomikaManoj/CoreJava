package com.uttara.numbersPattern;

public class NumberPattern14 {

	public static void main(String[] args) {
		int n = 3;

		for (int i = n; i >= 0; i--) {
			for (int j = n; j >= i; j--)
				System.out.print(j);
			System.out.println(" ");
		}

		for (int i = n; i > 0; i--) {
			for (int j = i, a = n; j > 0; j--) {
				System.out.print(a);
				a--;
			}
			System.out.println("");
		}

		System.out.println("\n Using Math.abs");
		int num = 3;

		for (int i = n; i >= -num; i--) {
			for (int j = n; j >= Math.abs(i); j--) {
				System.out.print(j);
			}

			System.out.println(" ");
		}
	}

}
