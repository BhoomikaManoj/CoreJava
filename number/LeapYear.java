package com.uttara.number;

import java.util.Scanner;

public class LeapYear {
	
	public void leapYear(int year)
	{
		if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
			System.out.println("It is a Leap year");
		else
			System.out.println("It is Not a leap year.");
	}

	public static void main(String[] args) {
		LeapYear ly = new LeapYear();
		System.out.println("Enter year ");
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		ly.leapYear(year);

	}

}
