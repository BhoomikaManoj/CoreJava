package com.uttara.numbersPattern;

public class NumberPattern6 {

	public static void main(String[] args) {
		int n = 5;
		int k = 1;

		for (int i = n; i > 0 ; i--) {
			for (int j = 1; j <= i; j++)
				System.out.print(k);
			System.out.println();
			k++;
		}
	}
}
