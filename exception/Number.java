package com.uttara.exception;

class Numbers
{
	public static void decreasingOrder(int num)
	{
		int x = num % 10;
		num = num/10;
		boolean flag = false;
		while(num > 0)
		{
			if(x <= (num % 10))
			{
				flag = true;
				break;
			}
			x = num % 10;
			num = num/10;
		}
		if(flag)
			System.out.println("Digits are in decreasing order.");
		else
			System.out.println("Digits are not in decreasing order.");
	}
	public static void main(String[] args)
	{
//		decreasingOrder(-1234);
//		decreasingOrder(1234);
//		decreasingOrder(1234567);
//		decreasingOrder(4567);
//		decreasingOrder(765);
		decreasingOrder(822);
	}
}