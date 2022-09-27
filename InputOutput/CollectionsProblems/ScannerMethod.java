package com.uttara.CollectionsProblems;

import java.util.Scanner;

public class ScannerMethod {

	public static void main(String[] args) {
		
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		
		System.out.println("Enter a String ");
		String s1 = sc1.next();
		System.out.println("String : "+s1);
		
		System.out.println("Enter integer");
		int n = sc1.nextInt();
		System.out.println("n = "+n);
		
		System.out.println("Enter double");
		double d = sc1.nextDouble();
		System.out.println("duble d : "+d);
		
		System.out.println("Enter Sentence");
		String line = sc2.nextLine(); // sentence input
		System.out.println("Line : "+line);


	}

}
