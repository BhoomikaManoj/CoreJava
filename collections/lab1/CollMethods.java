package com.uttara.collections.lab1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;

public class CollMethods {

	public static void main(String[] args) {
		
//		Collection<String> col1 = new ArrayList<String>(); 
//		Collection<String> col1 = new LinkedList<String>(); 
		Collection<String> col1 = new HashSet<String>(); 
		
		col1.add("Red");
		col1.add("Blue");
		col1.add("Black");
		col1.add("Red");
		col1.add("Green");
		
		System.out.println("Array List1 : "+col1);
		
//		Collection<String> col2 = new ArrayList<String>();
//		Collection<String> col2 = new LinkedList<String>();
		Collection<String> col2 = new HashSet<String>();
		
		col2.add("Red Red");
		col2.add("Blue");
		col2.add("yellow");
		col2.add("pink");

		System.out.println("Array List2 : "+col2);
		
		// is check whether the element ‘element’ exists in this collection. This method returns a boolean
		System.out.println(col1.contains("Blue"));
		
		System.out.println("Size of the collection 1 : "+col1.size());
		System.out.println("Size of the collection 2 : "+col2.size());
		
		System.out.println("Remove element in col1 : "+col1.remove("Blue"));
		col1.clear();
		System.out.println("Check collection is empty or not : "+col1.isEmpty());
		
		boolean b = Collections.addAll(col1,"white","purple","pink");
		System.out.println("addAll : "+b);
		
		System.out.println(col1.retainAll(col2)); // it remove all element except same element in the both ArrayList
		
		System.out.println("Array List1 : "+col1);
		System.out.println("Array List2 : "+col2);
		
		col1.removeAll(col1);
		System.out.println("Array List1 : "+col1);
		System.out.println("Array List2 : "+col2);
		
		
		
		
	}
	

}
