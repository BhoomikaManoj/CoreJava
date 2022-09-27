package com.uttara.collections.lab2;

import java.util.Comparator;

public class StudentNameComparator implements Comparator {

		@Override
		public int compare(Object o1, Object o2)
		{
			if(o1 instanceof StudentComparators && o2 instanceof StudentComparators)
			{
				StudentComparators s1 = (StudentComparators) o1;
				StudentComparators s2 = (StudentComparators) o2;
				return s1.name.length() - s2.name.length();
			}
			else
				throw new IllegalArgumentException("only String can be compare");
	}
}
