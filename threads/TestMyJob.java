package com.uttara.threads;

public class TestMyJob {
		
		public static void main(String[] args) {
			MyJob mj1 = new MyJob(10);
			MyJob mj2 = new MyJob(1000);
			
			Thread t1 = new Thread(mj1);
			Thread t2 = new Thread(mj2);
			t1.setName("Earth");
			t2.setName("Dhathri");
//			t1.run();
//			t2.run();
			t1.start();
			t2.start();

	}
}
