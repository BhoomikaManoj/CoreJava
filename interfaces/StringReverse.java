package com.uttara.interfaces;

public interface StringReverse {
	public void reverseString(String s);
}

 class StringReverseSB implements StringReverse
{
	public void reverseString(String s)
	{
		StringBuffer sb = new StringBuffer(s);
		sb.reverse();
		String data = sb.toString();
		System.out.println("Reverse String is = "+data);
	}
}
class TestString
{
	public static void main(String[] args) {
		StringReverseSB sr = new StringReverseSB();
		sr.reverseString("Bhoomika");
	}
}