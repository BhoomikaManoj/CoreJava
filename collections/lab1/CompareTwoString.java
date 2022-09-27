package com.uttara.collections.lab1;

public class CompareTwoString {

	public static void main(String[] args) {
		String str1 = "abc";
		String str2 = "abc";
		String str3 = new String("abc");
		String str4 = new String("abc");
		String str5 = new String("xyz");

		System.out.println("str1 == str2 : "+ (str1 == str2));
		System.out.println("Str1.equals(str2) : "+ (str1.equals(str2)));
		System.out.println("Str1.equals(str3) : "+ (str1.equals(str3)));
		System.out.println("Str3.equals(str4) : "+ (str3.equals(str4)));
		System.out.println("Str5.equals(str4) : "+ (str5.equals(str4)));
	}

}
