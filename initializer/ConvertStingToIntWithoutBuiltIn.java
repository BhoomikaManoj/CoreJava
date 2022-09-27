package com.uis.initializer;

public class ConvertStingToIntWithoutBuiltIn {

	public void convertStringToInt(String str) {
		int num = 0;
		for (int i = 0; i < str.length(); i++)
		{

			// Subtract 48 from the current digit
			num = num * 10 + ((int) str.charAt(i) - 48);

			System.out.print(num);
			
		}
		int i = Integer.parseInt(str); 
		System.out.println("------------>"+i);
	}
}

class TestConvertStringToIntWithoutBuiltIn
{
	public static void main(String[] args) {
		ConvertStingToIntWithoutBuiltIn csi = new ConvertStingToIntWithoutBuiltIn();
		csi.convertStringToInt("123");

	}

}
