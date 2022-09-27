package com.uttara.number;

import java.util.Scanner;

public class CountVowelConsonant {

	public void countVowelConsonant(String s)
	{
		int countVowel = 0;
		int countConsonant = 0;
		s = s.replaceAll("\\s", ""); // remove sing white space in sentence
		char[] c = s.toCharArray();
		for(int i = 0; i < s.length(); i++)
		{
//			System.out.println(c[i]+","+i);
			if(c[i] == 'a' || c[i] == 'e' || c[i] == 'i' || c[i] == 'o' || c[i] == 'u' || c[i] == 'A' || c[i] == 'E' || c[i] == 'I' || c[i] == 'O' || c[i] == 'U')
				{
				System.out.println(c[i]+","+i+"-------------------");
				countVowel++;
				}
			else {
				System.out.println(c[i]+","+i);
				countConsonant++;
			}
		}
		System.out.println("Number of vowels in sentence is "+countVowel);
		System.out.println("Number of consonent in sentence is "+countConsonant);
	}
	
	public static void main(String[] args) {
		
		CountVowelConsonant cvc = new CountVowelConsonant();
		System.out.println("Enter Sentance");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		cvc.countVowelConsonant(str);

	}

}
