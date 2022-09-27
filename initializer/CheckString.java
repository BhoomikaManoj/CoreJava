package com.uis.initializer;

public class CheckString {
	public void checkString(String str1, String str2) {
		int n = str1.length(), m = str2.length();
		int i = 0, j = 0;
		while (i < n && j < m) {
			if (str1.charAt(i) == str2.charAt(j))
				i++;
			j++;
		}
		/*
		 * If i reaches end of s1,that mean we found all characters of s1 in s2, so s1
		 * is subsequence of s2, else not
		 */
		if(i == n)
			System.out.println("string found "+str1 + " in "+str2);
		else
			System.out.println("String not found");
	}
}

class TestCheckString {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckString cs = new CheckString();
		cs.checkString("abc", "abdef");

	}

}
