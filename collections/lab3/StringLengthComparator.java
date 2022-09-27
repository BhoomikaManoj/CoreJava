package com.uttara.collections.lab3;

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
