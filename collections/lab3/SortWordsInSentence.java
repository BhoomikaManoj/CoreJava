package com.uttara.collections.lab3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

public class SortWordsInSentence {
	public void sortWord(String sentence)
	{
		String[] stringArray = sentence.split("[ .]+");
		
		for(String s : stringArray)			// display array elements
			System.out.println(s);
		
		List<String> word = new ArrayList();
		Collections.addAll(word,stringArray);
		Collections.sort(word);
		System.out.println("Sort the words in sentence with duplicate : "+word);
		
		TreeSet wordTS = new TreeSet(word);
		System.out.println("Sort the words in sentence without duplicate "+wordTS);
		
	}
}

class testSortWordsInSentence
{
	public static void main(String[] args) {
		SortWordsInSentence sw = new SortWordsInSentence();
		System.out.println("Enter the sentence");
		Scanner sc1 = new Scanner(System.in);
		String sentence = sc1.nextLine();

		sw.sortWord(sentence);
	}

}
