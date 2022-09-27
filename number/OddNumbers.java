package com.uttara.number;

import java.util.Scanner;

public class OddNumbers {

	public void oddNumber(int num)
	{
		for (int i = 0; i <= num; i++) {
			if(i % 2 != 0)
				System.out.print(i+",");
		}
	}
	public static void main(String[] args) {
		
		OddNumbers od = new OddNumbers();
		System.out.println("Enter number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		od.oddNumber(num);

	}

}
