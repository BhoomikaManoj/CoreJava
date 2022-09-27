package com.uttara.CollectionsProblems;

import java.util.Comparator;

public class FriendNameLengthComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2)
	{
		if(o1 instanceof String && o2 instanceof String)
		{
			String str1 = (String) o1;
			String str2 = (String) o2;
			return str1.length() - str2.length();
		}
		else
			throw new IllegalArgumentException("compare only string");
	}
}
