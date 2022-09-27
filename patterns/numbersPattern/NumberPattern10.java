package com.uttara.numbersPattern;

public class NumberPattern10 {

	public static void main(String[] args) {
		int n = 5, a =1;

		for (int i = 1 ; i <= n ; i++) {
			for(int k = 1; k <= n - i; k++)
				System.out.print(" ");
			for (int j = 1; j <= a ; j++)
				System.out.print(i);
			a++;
			System.out.println(" ");
		}

	}

}
