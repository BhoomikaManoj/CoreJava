package com.uttara.CollectionsProblems;

import java.util.Comparator;
import java.util.Date;
import java.util.Map;

public class SortStudentBasedOnDateOfBirth implements Comparator {

	@Override
	public int compare(Object o1, Object o2)
	{
		System.out.println(((Student) o1).getDob());
		System.out.println(((Student) o2).getDob());
		
		return ((Student) o1).getDob().compareTo(((Student) o2).getDob());
	}
}
