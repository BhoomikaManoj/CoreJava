package com.uttara.threads;

public class TestCounter {

	public static void main(String[] args) throws InterruptedException {
		Counter c1 = new Counter();
		CountJob cjob = new CountJob(c1);
		
		Thread t1 = new Thread(cjob);
		t1.setName("Earth");
		Thread t2 = new Thread(cjob);
		t2.setName("Dathri");
		t1.start();
		t2.start();
//		t2.join();
		
		

	}

}
