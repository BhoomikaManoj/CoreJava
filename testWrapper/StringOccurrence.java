package com.uis.testWrapper;

public class StringOccurrence {

	int count = 0, pos = 0;

	public void stringOccurrence(String str1, String str2) {
		while ((pos = str1.indexOf(str2, pos)) != -1) {
			count++;
			pos++;
		}
		System.out.println(count);
	}
}

class TestStringOccurrence {
	public static void main(String[] args) {

		StringOccurrence so = new StringOccurrence();
		so.stringOccurrence("aaabbbaaabbbaabbbaaa", "aaa");

	}

}
