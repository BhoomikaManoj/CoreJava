package com.uttara.number;

import java.util.Scanner;

public class SwapNumber {
	
	public static void swapWithXor(int a, int b)
	{
		//10= 1010, 15 = 1111
		a = a ^ b; // T^T = T,F^F = F ,T^F=T,F^T =T   1010 ^ 1111 = 0101 = 5
		b = a ^ b; //								  0101 ^ 1111 = 1010 = 10 = b
		a = a ^ b; //								  0101 ^ 1010 = 1111 = 15 = a
		System.out.println("Swap Two numbers using Xor a ="+a+", b=" +b);
	}
	public static void swapWithArthimaticOpertion(int a, int b)
	{
		a = a + b; 
		b = a - b;
		a = a - b;
		System.out.println("Swap Two numbers using ArthimaticOpertion a = "+a+", b=" +b);
	}
	public static void swapUsingThirdVariable(int a, int b)
	{
		int temp = a; 
		a = b;
		b = temp;
		System.out.println("Swap Two numbers using Third variable a = "+a+", b=" +b);
	}
	public static void main(String[] args) {
		SwapNumber s = new SwapNumber(); 
		System.out.println("Enter two numbers to swap");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		s.swapWithXor(a,b);
		s.swapWithArthimaticOpertion(a,b);
		s.swapUsingThirdVariable(a,b);

	}

}
