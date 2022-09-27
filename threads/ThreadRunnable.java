package com.uttara.threads;

public class ThreadRunnable implements Runnable {

	@Override
	public void run() {
		try {

			for (int i = 1; i <= 100; i++) {
				Thread.sleep(500);
				System.out.println("Thread " + i + "-----> " + Thread.currentThread().getName());
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NullPointerException e) {
			e.printStackTrace();
		}

	}

}

class TestThreadRunnable {

	public static void main(String[] args) {
		ThreadRunnable tr = new ThreadRunnable();
		Thread t1 = new Thread(tr);
		Thread t2 = new Thread(tr);
		t1.start();
		t2.start();
	}

}
