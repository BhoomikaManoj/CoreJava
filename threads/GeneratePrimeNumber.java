package com.uttara.threads;

public class GeneratePrimeNumber implements Runnable{
	
	private long isPrimeNumber;
	private long val;
	static long number;
	public GeneratePrimeNumber(long val) {
		super();
		this.val = val;
	}
	
	public long getIsPrimeNumber() {
		return isPrimeNumber;
	}
	
	public static boolean checkPrimeNumber(long num)
	{
		number = num;
		if(num == 0 || num == 1)
			return false;
		if(num < 0)
			return false;
		if(num == 2)
			return true;
		if(num%2 == 0)                  // (num&1) == 0
			return false;
		for(long i = 3; i <= (long)(Math.sqrt(num)+1); i += 2)   // i<= num/2
		{
			if(num % i == 0)
				return false;
			
		}
		return true;
		
	}

	@Override
	public void run() {
		while(true)
		{
			long max = val*2;
			long min = val;
//			System.out.println(max+":"+min);
			long genVal = (long)(Math.random()*(max-min+1) + min);
			if(genVal > number)
			{
				if(checkPrimeNumber(genVal))
				{
					isPrimeNumber = genVal;
					break;
				}
			}
		}
	}
	
	
}
