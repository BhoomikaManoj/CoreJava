package com.uttara.io;

import java.util.Scanner;

public class TestScannerFirst {

	public static void main(String[] args) {
		
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		
		System.out.println("Enter a String input");
		String str1 = sc1.next();
		
		System.out.println("Enter Integer as input");
		int i = sc1.nextInt();
		
		System.out.println("Enter Double as input");
		double d = sc1.nextDouble();
		
		System.out.println("Enter long as input");
		long l = sc1.nextLong();
		
		System.out.println("Enter float as input");
		float f = sc1.nextFloat();
		
		System.out.println("Enter sentence");
		String line = sc2.nextLine();
		
		System.out.println("Enter true or false");
		boolean b = sc1.nextBoolean();
		
		System.out.println("Word : "+str1);
		System.out.println("Integer : "+i);
		System.out.println("Double : "+d);
		System.out.println("long : "+l);
		System.out.println("float : "+f);
		System.out.println("Sentence : "+line);
		System.out.println("Boolean : "+b);
	}

}
