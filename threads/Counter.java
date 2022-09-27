package com.uttara.threads;

public class Counter {

	int count;
	
	public synchronized int incCount()
	{
		count++;
		return count;
	}
}
