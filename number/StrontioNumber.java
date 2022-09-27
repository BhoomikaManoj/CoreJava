package com.uttara.number;

import java.util.Scanner;

public class StrontioNumber {

	int count = 0;
	public int countNumberOfDigit(int num)
	{
		int temp = num;
		while(temp != 0)
		{
			temp = temp /10;
			count++;
		}
		return count;
	}
	public void strontioNumber(int num)
	{
		System.out.println(countNumberOfDigit(num));
		if(countNumberOfDigit(num) == 4)
		{
			System.out.println(num+" is not strontioNumber,Enter only 4 digit number");
		}
		else
		{
			int result = num * 2;
			count = 0;
			if(countNumberOfDigit(result) == 4)
				System.out.println(num+" is strontioNumber");
			else 
				System.out.println(num+" is not strontioNumber");
		}
		
	}
	
	public static void main(String[] args) {
		StrontioNumber sn = new StrontioNumber();
		System.out.println("Enter number 4 digit number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sn.strontioNumber(num);

	}

}
