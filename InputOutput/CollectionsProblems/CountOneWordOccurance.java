package com.uttara.CollectionsProblems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class CountOneWordOccurance {
	
	public void countWord(String sentence, String key)
	{
		String[] stringArray = sentence.split("[ .]+");
		
		for(String s : stringArray)			// display array elements
			System.out.println(s);
		
		List l = new ArrayList();
		Collections.addAll(l, stringArray);
		System.out.println("Frequency of the Word: " +Collections.frequency(l,key));  
	}

}

class TestCountOneWordOccurance
{
	public static void main(String[] args) {
		
		CountOneWordOccurance cw = new CountOneWordOccurance();
		System.out.println("Enter the sentence");
		Scanner sc1 = new Scanner(System.in);
		String sentence = sc1.nextLine();
		
		System.out.println("Enter key element to search");
		Scanner sc2 = new Scanner(System.in);
		String key = sc2.nextLine();
		
		cw.countWord(sentence, key);
	}

}
