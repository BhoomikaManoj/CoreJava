package com.uttara.collections.lab2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

//public class StringLengthComparator {
public class StringLengthComparator implements Comparator {

	public int compare(Object o1, Object o2)
	{
		if(o1 instanceof String && o2 instanceof String)
		{
			String s1 = (String) o1;
			String s2 = (String) o2;
			return s1.length() - s2.length();
		}
		else
			throw new IllegalArgumentException("only String can be compare");
	}

}

class TestTree
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
		
		System.out.println("\n Sort TreeSet based on String length() using Comparator ");
		StringLengthComparator slc = new StringLengthComparator();
		Set ts = new TreeSet(slc);
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
		
		System.out.println("\n Sort Linked List based on String length() using Comparator ");
		List l = new ArrayList();
		l.add(str1);
		l.add(str2);
		l.add(str3);
		l.add(str4);
		l.add(str5);
		l.add(str6);
		l.add(str7);
		l.add(str8);
		l.add(str9);
		l.add(str10);
		
		System.out.println("\n Sorting based on natural order ");
		Collections.sort(l);
		System.out.println(l);
		System.out.println("\n Sorting based on String Length using comparator ");
		StringLengthComparator slc1 = new StringLengthComparator();
		Collections.sort(l,slc1);
		System.out.println(l);
	}
}
