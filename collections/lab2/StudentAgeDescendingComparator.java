package com.uttara.collections.lab2;

import java.util.Comparator;

public class StudentAgeDescendingComparator implements Comparator{
	
	public int compare(Object o1, Object o2)
	{
		if(o1 instanceof StudentComparators && o2 instanceof StudentComparators)
		{
			StudentComparators s1 = (StudentComparators) o1;
			StudentComparators s2 = (StudentComparators) o2;
			
			if(s1.age == s2.age)
				return 0;
			else if(s1.age < s2.age)
				return 1;
			else
				return -1;
		}
		else
			throw new IllegalArgumentException("only String can be compare");
	}

}
