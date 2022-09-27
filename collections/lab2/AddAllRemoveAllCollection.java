package com.uttara.collections.lab2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class AddAllRemoveAllCollection {

	String color;
	int value;

	public AddAllRemoveAllCollection() {
		super();
	}

	public AddAllRemoveAllCollection(String color, int value) {
		super();
		this.color = color;
		this.value = value;
	}

	@Override
	public String toString() {
		return "AddAllRemoveAllCollection [color=" + color + ", value=" + value + "]";
	}

}

class TestAddAllRemoveAllCollection {
	public static void main(String[] args) {

		AddAllRemoveAllCollection ar1 = new AddAllRemoveAllCollection("Red", 2);
		AddAllRemoveAllCollection ar2 = new AddAllRemoveAllCollection("Blue", 5);
		AddAllRemoveAllCollection ar3 = new AddAllRemoveAllCollection("white", 6);
		AddAllRemoveAllCollection ar4 = new AddAllRemoveAllCollection("Black", 4);
		AddAllRemoveAllCollection ar5 = new AddAllRemoveAllCollection("Red", 2);
		AddAllRemoveAllCollection ar6 = new AddAllRemoveAllCollection("sky blue", 6);

		List l = new ArrayList();
		boolean b = Collections.addAll(l, ar1, ar2, ar3, ar4, ar5, ar6);
		
//		boolean b = Collections.addAll(l,1,2,34,5,6,7);
//		System.out.println(l);
		
		System.out.println("\n AddAll Elements ot ArrayList is :" + b);

		Iterator itr = l.iterator();
		while (itr.hasNext())
			System.out.println(itr.next());
		
		// addAll elements ArrayList to LinkedList
		List ll = new LinkedList();
		b = Collections.addAll(ll,l);
		
		System.out.println("\n AddAll Elements List ot LinkedList is :" + b);

		for(int i = 0; i < ll.size();i++)
			System.out.println(ll.get(i));
		
		// addAll Elements LinkedList to set
		Set s = new HashSet();
		b = Collections.addAll(s, ll);
		
		System.out.println("\n AddAll Elements LinkedList ot Set is :" + b);

		Iterator itr2 = s.iterator();
		while (itr2.hasNext())
			System.out.println(itr2.next());
		
		//addAll elements Set to TreeSet
//		TreeSet  ts = new TreeSet();
//		b = Collections.addAll(ts, s);
//		
//		System.out.println("\n AddAll Elements Set to TreeSet is :" + b);
//
//		Iterator itr3 = ts.iterator();
//		while (itr3.hasNext())
//			System.out.println(itr3.next());
		
		l.removeAll(l);
		ll.removeAll(ll);
		s.removeAll(s);
		System.out.println("After Removing Elements from list "+ l);
		System.out.println("After Removing Elements from LinkedList "+ ll);
		System.out.println("After Removing Elements from Set "+ s);
		
		
	}

}
