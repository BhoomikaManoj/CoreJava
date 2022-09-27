package com.uttara.io2;

import java.util.Comparator;

public class StudentRankComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		
		if(o1 instanceof Student && o2 instanceof Student)
		{
			Student s1 = (Student) o1;
			Student s2 = (Student) o2;
			return s1.getRank() - s2.getRank();
		}
		
		throw new IllegalArgumentException("only String can be compare");
	}

}
