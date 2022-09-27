package com.uttara.numbersPattern;

public class NumberPattern20 {

	public static void main(String[] args) {
		int n=9;
		int space=n/2;
		int height=n-space;

		
		for(int i=height;i>=1;i--)
		{
			for (int j=space;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=n;k++)
			{
				System.out.print(k);
			}
			n-=2;

			System.out.println();
		}


	}

}
