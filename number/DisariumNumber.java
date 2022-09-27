package com.uttara.number;

import java.util.Scanner;

//Sum of its digits powered with their respective position is equal to the original number.
//1^1+3^2+5^3 = 135, 89, 175, 518

public class DisariumNumber {

	
	public void disariumNumber(int num)
	{
		int temp = num;
		int n;
		int result = 0,count = 0;
		while(temp != 0)
		{
				temp = temp /10;
				count++;
		}
		temp = num;
		for(int i = count; i > 0; i--,count--)
		{
			n = temp % 10; 
			result = result + (int)(Math.pow(n, count));
			temp = temp /10;
		}
		if(num == result)
			System.out.println(num +" is Disarium Number");
		else
			System.out.println(num +" is not DisariumNumber");
	}
	
	public static void main(String[] args) {
		DisariumNumber dn = new DisariumNumber();
		System.out.println("Enter number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		dn.disariumNumber(num);

	}

}
