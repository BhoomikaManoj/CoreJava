package com.uttara.threads;

public class CountJob implements Runnable{

	Counter counter;
	
	public CountJob(Counter counter) {
		super();
		this.counter = counter;
	}


	@Override
	public void run() {
		try {
			Thread.sleep(500);
			System.out.println(Thread.currentThread().getName()+" : "+counter.incCount());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
