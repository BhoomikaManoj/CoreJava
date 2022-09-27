package com.uttara.collections.lab3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountWordsOccurrencesSentence {
	public void countWords(String sentence)
	{
		String[] stringArray = sentence.split("[ .]+");
		
//		for(String s : stringArray)
//			System.out.println(s);
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		for(String word : stringArray)
		{
			if(map.containsKey(word))
				map.put(word, map.get(word)+1);
			else
				map.put(word, 1);
		}
		
		for(Map.Entry<String, Integer> entry : map.entrySet())
		{
//			if(entry.getValue() == 1)
				System.out.println(entry.getKey()+" : "+entry.getValue());
		}
	}
}

class TestCountWordsOccurrencesSentence
{
	public static void main(String[] args) {
		CountWordsOccurrencesSentence cw = new CountWordsOccurrencesSentence();
		System.out.println("Enter the sentence");
		Scanner sc1 = new Scanner(System.in);
		String sentence = sc1.nextLine();

		cw.countWords(sentence);

	}

}
