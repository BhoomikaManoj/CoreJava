package com.uttara.collections.lab3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class SortWordLength {
	
	
	
	public void sortWordLength(String sentence)
	{
		String[] stringArray = sentence.split("[ .]+");
		
		for(String s : stringArray)			// display array elements
			System.out.println(s);
		
		List l = new ArrayList();
		Collections.addAll(l, stringArray);
		StringLengthComparator slc = new StringLengthComparator();
		Collections.sort(l,slc);
		
		System.out.println("Sort the words in sentence based on word length with duplicate : "+l);
		
		Set ts = new TreeSet(slc);
		Collections.addAll(ts, stringArray);
		
		System.out.println("Sort the words in sentence based on word length without duplicate : ");
		Iterator<String> it = ts.iterator();
		while(it.hasNext())
		{
			String str = it.next();
			System.out.println(str);
		}
	}
}

class TestSortWordLength
{
	
	public static void main(String[] args) {
		SortWordLength swl = new SortWordLength();
		System.out.println("Enter the sentence");
		Scanner sc1 = new Scanner(System.in);
		String sentence = sc1.nextLine();

		swl.sortWordLength(sentence);

	}

}
