package com.uttara.collections.lab2;

import java.util.Set;
import java.util.TreeSet;

public class SortWord {

	public static void main(String[] args) {
		String sentence = "TreeSet is one of the most important implementations of the SortedSet interface in Java that uses a Tree for storage";
		
		String[] s1=sentence.split(" ");
		Set<String> ts =new TreeSet<String>();
		for(String s:s1)
			ts.add(s);

		System.out.println(ts);

	}

}
