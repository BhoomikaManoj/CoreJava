package com.uis.testWrapper;

public class UnicodeValueOfString {
	public void unicodeValueOfString(String str1) {
		
		StringBuffer sb = new StringBuffer();
		
		for(int i = 0; i < str1.length(); i++)
		{
			int e_codepoint = str1.codePointAt(i);
			sb.append(e_codepoint+".");
//        	System.out.print(e_codepoint+".");
		}
		String result = sb.toString();
		System.out.println(result);
	}
}
class TestUnicodeValueOfString
{
	public static void main(String[] args) {
		UnicodeValueOfString us = new UnicodeValueOfString();
		us.unicodeValueOfString("Bhoomi");

	}

}
