package com.uis.initializer;

public class StringUpperLower {
	public void convertStringUpperLower(String str)
	{
		StringBuffer sb = new StringBuffer();
		for(int i = 0; i < str.length(); i++)
		{
			char letter = str.charAt(i);
			if(Character.isUpperCase(letter))
				sb.append(Character.toLowerCase(letter));
			else
				sb.append(Character.toUpperCase(letter));
		}
		String result = sb.toString();
		System.out.println(result);
	}
}
class TestStringUpperLower
{
	public static void main(String[] args) {
		
		StringUpperLower sul = new StringUpperLower();
		sul.convertStringUpperLower("B$hOO@123");
	}

}
