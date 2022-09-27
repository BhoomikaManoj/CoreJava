package com.uttara.threads;

public class MyJob implements Runnable {

	int val;

	public MyJob(int val) {
		super();
		this.val = val;
	}

	@Override
	public void run() {

		try {
			for (int i = val; i < val + 100; i++) {
				Thread.sleep(100);
				System.out.println(Thread.currentThread().getName() + " : " + val);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
