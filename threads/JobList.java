package com.uttara.threads;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

public class JobList implements Runnable {

	List<Integer> list = new ArrayList<Integer>();
	BigDecimal sum = new BigDecimal("0");
	BigDecimal avg;
	
	public JobList(List<Integer> list) {
		super();
		this.list = list;
		avg  = new BigDecimal(this.list.size());
	}
	

	@Override
	public void run() {
		
		for(Integer l : list)
		{
			BigDecimal b = new BigDecimal(l);
			sum = sum.add(b);
			
		}
		System.out.println("Average of sum of ArrayList : "+(sum.divide(avg, 2, RoundingMode.HALF_EVEN)));
	}
	
	
}
