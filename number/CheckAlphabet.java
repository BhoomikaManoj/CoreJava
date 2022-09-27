package com.uttara.number;

import java.util.Scanner;

public class CheckAlphabet {

	public void checkAlphabet(char c) {
		if(Character.isUpperCase(c) || Character.isLowerCase(c))
			System.out.println(c+" is a Character");
		else
			System.out.println(c+" is not a Character");
	}
	public static void main(String[] args) {
		CheckAlphabet cvc = new CheckAlphabet();
		System.out.println("Enter Character ");
		Scanner sc = new Scanner(System.in);
		char c = sc.next().charAt(0);
		cvc.checkAlphabet(c);


	}

}
