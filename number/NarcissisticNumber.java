package com.uttara.number;

import java.util.Scanner;

// Narcissistic Number is a number that is the sum of its own digits each raised to the power of the number of digits
// example : 153 →	1^3+5^3+3^3=153 
//           1634 → 1^4+6^4+3^4+4^4=1634 


public class NarcissisticNumber {
	
	public void narcissisticNumber(int num)
	{
		int temp = num;
		int count = 0;
		int result = 0;
		while(temp != 0)
		{ 
			temp = temp /10;
			count++;
		}
		System.out.println("total digits present in number is "+count);
		temp = num;
		int n;
		while(temp != 0)
		{
			n = temp % 10; 
			result = result + (int)(Math.pow(n, count));
			temp = temp /10;
		}
		if(num == result)
			System.out.println(num +" is Narcissistic Number");
		else
			System.out.println(num +" is not Narcissistic Number");
	}

	public static void main(String[] args) {
		NarcissisticNumber nn = new NarcissisticNumber();
		System.out.println("Enter number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		nn.narcissisticNumber(num);

	}

}
