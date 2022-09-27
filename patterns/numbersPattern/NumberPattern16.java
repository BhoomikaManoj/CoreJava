package com.uttara.numbersPattern;

public class NumberPattern16 {

	public static void main(String[] args) {
		int n = 5,z = 1;
		for(int i = 0; i < n; i++)
		{
			for(int j = n-1 ; j > i; j--)
				System.out.print(" ");
			for(int k = 0; k < z; k++)
			{
				System.out.print(z);
			}
			z+=2;
			System.out.println();

		}

	}

}
