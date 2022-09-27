package com.uttara.number;

import java.util.Scanner;

//A positive integer whose sum of digits of its square is equal to the number itself is called a neon
// example: 9 * 9 =81, 8+1=9 is neon number
public class NeonNumber {

	public void neonNumber(int num) {
		int square = num * num;
		int temp = square;
		int n,sum = 0;
		while(temp != 0 )
		{
			n = temp % 10;
			sum = sum + n;
			temp = temp/10;
		}
		if(sum == num)
			System.out.println(num+" is Neon Number");
		else
			System.out.println(num+" is not Neon Number");
	}
	public static void main(String[] args) {
		NeonNumber nn = new NeonNumber();
		System.out.println("Enter number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		nn.neonNumber(num);

	}

}
