package com.uis.testWrapper;

public class StringExamples {

	public static void main(String[] args) {
		
		String str = "blah";
		str.toUpperCase();
		System.out.println(str); // it print blah in Lower case because we are not store the result in memory
		
		str = " blah ";
		System.out.println("Length of str = "+str.length());
		System.out.println(str.trim()); //after this, print its length.
		System.out.println("After trim the string, length = "+str.trim().length());
		String s1 = new String("abc"); // one String object created in heap
		String s2 = new String("abc"); // one String object created in heap
		System.out.println("s1 == s2 result = "+(s1==s2)); // it compare the object reference address value
		System.out.println("s1.equals(s2) result = "+s1.equals(s2)); // compare object value
		String s3 = "abc";
		System.out.println("s1 == s3 result = "+(s1==s3)); 
		System.out.println("s1.equals(s3) result = "+s1.equals(s3)); 
		String s4 = "abc";
		System.out.println("s3 == s4 result = "+(s3==s4)); 
		System.out.println("s3.equals(s4) result = "+s3.equals(s4));

	}

}
