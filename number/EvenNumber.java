package com.uttara.number;

import java.util.Scanner;

public class EvenNumber {

	public void evenNumber(int num)
	{
		for (int i = 1; i <= num; i++) {
			if(i % 2 == 0)
				System.out.print(i+",");
		}
	}
	public static void main(String[] args) {
		
		EvenNumber en = new EvenNumber();
		System.out.println("Enter number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		en.evenNumber(num);
	}
}
