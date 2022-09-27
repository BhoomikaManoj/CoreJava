package com.uttara.collections.lab2;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class StringVowelComparators implements Comparator {
	
	public static int numOfVowels(String str)
	{
		if(str==null)
			throw new IllegalArgumentException("string cannot be null!");
		
		int count = 0;
		str = str.toLowerCase();
		for(int i = 0 ; i < str.length() ; i++)
		{
			char c = str.charAt(i);
			if(c=='a' || c=='e' || c=='i'|| c=='o'|| c=='u')
				count++;
		}
		return count;
	}
	
	@Override
	public int compare(Object o1, Object o2) {
		if(o1 instanceof String && o2 instanceof String)
		{
			String s1 = (String) o1;
			String s2 = (String) o2;
			
			int count1 = StringVowelComparators.numOfVowels(s1);
			int count2 = StringVowelComparators.numOfVowels(s2);
//			System.out.println("count1="+count1+", count2="+count2+": "+(count1 - count2));
			return count1 - count2;
		}
		else
			throw new IllegalArgumentException("only strings can be compared!");
	}
}

class TestStringVowelComparators
{
	public static void main(String[] args) {
		String str1 = "red";
		String str2 = "blue";
		String str3 = "green";
		String str4 = "yellow";
		String str5 = "purple";
		String str6 = "white";
		String str7 = "black";
		String str8 = "black blue";
		String str9 = "orange";
		String str10 = "parrot Green";
		
		System.out.println("\n Sort TreeSet based on occurence of Vowel in String using Comparator ");
		StringVowelComparators svc = new StringVowelComparators();
		Set ts = new TreeSet(svc);
		ts.add(str1);
		ts.add(str2);
		ts.add(str3);
		ts.add(str4);
		ts.add(str5);
		ts.add(str6);
		ts.add(str7);
		ts.add(str8);
		ts.add(str9);
		ts.add(str10);
		
		// it display unique string length()
		Iterator<String> it = ts.iterator();
		while(it.hasNext())
		{
			String str = it.next();
			System.out.println(str);
		}
	}
}
