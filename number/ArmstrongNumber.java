package com.uttara.number;

import java.util.Scanner;

public class ArmstrongNumber {
	
	public void armstrongNumber(int num) {
		
		int cube = 0,reminder,temp;
		for(int i = 0; i <= num; i++) // print all armstrong Numbers in range
		{
			temp = i;
			cube = 0;
			while(temp != 0)
			{
				reminder = temp % 10;
				cube = cube + (reminder * reminder * reminder);
				temp = temp / 10;
			}
			if(cube == i)
				System.out.println(i+" is an ArmstrongNumber");
//			else
//				System.out.println(i+" is not an ArmstrongNumber");
		}
	}
	public static void main(String[] args) {
		ArmstrongNumber an = new ArmstrongNumber();
		System.out.println("Enter number ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		an.armstrongNumber(num);

	}

}
