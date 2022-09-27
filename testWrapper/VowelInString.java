package com.uis.testWrapper;

public class VowelInString {
	
	int count;
	public void vowelInString(String str) {
		for(int i = 0; i < str.length(); i++)
		{
			char vowel = str.charAt(i);
			if(vowel == 'A' || vowel == 'E' || vowel == 'I' || vowel == 'O' || vowel == 'U' || vowel == 'a' || vowel == 'e' || vowel == 'i' || vowel == 'o' || vowel == 'u')
			{
				System.out.print(vowel+",");
				count++;
			}
		}
		System.out.println();
	}
}
class TestVowelInString
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VowelInString v = new VowelInString();
		v.vowelInString("Bhoomika");
		System.out.println("Total Number of vowels in String is "+v.count);
	}

}
